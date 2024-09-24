import json

def getFlowData(filename):
    data = {}

    with open(filename, 'r') as file:
        data = json.load(file)

    flow_data = data['runs'][0]['results']

    return flow_data

def readFlows(flow_data):
    count = 0
    data_to_write = []
    for flow in flow_data:
        avg_code_flow_length = 0
        if 'codeFlows' in flow.keys():
            print(str(count) + ' :', len(flow['codeFlows']))
            for codeFlow in flow['codeFlows']:
                len_of_codeFlow = len(codeFlow['threadFlows'][0]['locations'])
                avg_code_flow_length += len_of_codeFlow
            avg_code_flow_length = avg_code_flow_length / len(flow['codeFlows'])
            data_to_write.append({'id': count, 'codeFlows': len(flow['codeFlows']), 'avg_code_flow_length': avg_code_flow_length})
        else:
            print(str(count) + ' :', 0)
            data_to_write.append({'id': count, 'codeFlows': 1, 'avg_code_flow_length': 1})
        count += 1

    return data_to_write

def subpaths(flow_data):
    all_code_flows = []
    id_count = 0
    flowID_count = 0
    for flow in flow_data:
        if 'codeFlows' in flow.keys():
            for codeFlow in flow['codeFlows']:
                new_flow = {'id': 0, 'flowID': 0, 'nodes': []}
                for node in codeFlow['threadFlows'][0]['locations']:
                    new_flow['nodes'].append(node['location']['message']['text'])
                new_flow['id'] = id_count
                new_flow['flowID'] = flowID_count
                all_code_flows.append(new_flow)
                id_count += 1
        flowID_count += 1
    return all_code_flows

def find_common_subpaths(all_code_flows):
    # we need to check a subpath with every other subpath and record the length of the common subpath
    # all_code_flows = [{'id': 0, 'nodes': [...]}, {'id': 1, 'nodes': [...]}, ...]
    print('All Code Flows:', all_code_flows)
    common_subpaths = []
    for i in range(len(all_code_flows)):
        for j in range(i + 1, len(all_code_flows)):
            if all_code_flows[i]['flowID'] == all_code_flows[j]['flowID']:
                common_subpath = []
                for node in all_code_flows[i]['nodes']:
                    if node in all_code_flows[j]['nodes']:
                        common_subpath.append(node)
                common_subpaths.append({'id1': all_code_flows[i]['id'], 'id2': all_code_flows[j]['id'], 'common_subpath_len': len(common_subpath), 'common_subpath': common_subpath})
    print('Common Subpaths:', common_subpaths)
    return common_subpaths

def calculate_avg_common_flows(common_subpaths):
    total_common_subpath_length = 0
    for common_subpath in common_subpaths:
        total_common_subpath_length += common_subpath['common_subpath_len']
    return total_common_subpath_length / len(common_subpaths)

def calculate_avg_flows(data_to_write):
    total_average_flow_length = 0
    total_flows = 0
    for data in data_to_write:
        total_average_flow_length += data['avg_code_flow_length']
        total_flows += data['codeFlows']

    return total_average_flow_length, total_flows

def calculate_nodes_edges(file_to_read):
    node_edge_data = []
    with open(file_to_read, 'r') as file:
        node_edge_data = json.load(file)

    edges = node_edge_data['edges']['tuples']
    nodes = node_edge_data['nodes']['tuples']

    print('Edges:', len(edges))
    print('Nodes:', len(nodes))

    return edges, nodes

def sources_sinks(file_to_read):
    sources = set()
    sinks = set()
    data = {}

    with open(file_to_read, 'r') as file:
        data = json.load(file)

    tuples = data['#select']['tuples']

    for tuple in tuples:
        sinks.add(tuple[0]['label'])
        sources.add(tuple[1]['label'])

    return sources, sinks



if __name__ == '__main__':
    flow_data = getFlowData('interpretedResults.json')
    data_to_write = readFlows(flow_data)
    total_average_flow_length, total_flows = calculate_avg_flows(data_to_write)
    edges, nodes = calculate_nodes_edges('results-with-alerts.json')
    sources, sinks = sources_sinks('results-with-alerts.json')
    all_code_flows = subpaths(flow_data)
    common_subpaths = find_common_subpaths(all_code_flows)
    avg_common_subpaths = calculate_avg_common_flows(common_subpaths)

    print('Common Subpaths:', common_subpaths)

    print('Sources:', len(sources))
    print('Sinks:', len(sinks))

    with open('codeFlows.csv', 'w') as file:
        file.write('id,codeFlows,avg_code_flow_length, edges, nodes, sources, sinks\n')
        for data in data_to_write:
            # if first row
            if data['id'] == 0:
                file.write(str(data['id']) + ',' + str(data['codeFlows']) + ',' + str(data['avg_code_flow_length']) + ',' + str(len(edges)) + ',' + str(len(nodes)) + ',' + str(len(sources)) + ',' + str(len(sinks)) +'\n')
            file.write(str(data['id']) + ',' + str(data['codeFlows']) + ',' + str(data['avg_code_flow_length']) + '\n')
        file.write('Total,' + str(total_flows / len(data_to_write)) + ',' + str(total_average_flow_length / len(data_to_write)) + '\n')
    
    with open('commonSubpaths.csv', 'w') as file:
        file.write('id1,id2,common_subpath_len\n')
        for common_subpath in common_subpaths:
            file.write(str(common_subpath['id1']) + ',' + str(common_subpath['id2']) + ',' + str(common_subpath['common_subpath_len']) + ',' + str(common_subpath['common_subpath']) + '\n')
        file.write('Total,' + str(avg_common_subpaths) + '\n')