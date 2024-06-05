# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# This script is used to generate the annotation of package info that
# records the version, revision, branch, url, user and timestamp.

$version=$args[0]
$buildDirectory=$args[1]
$outputFile= "$buildDirectory\generated-sources\java\org\apache\flume\package-info.java"
$user = $Env:username
$date = Get-Date

cmd /c svn info 2>&1 | Out-Null
if ( $LastExitCode -eq 0 ) {
  $revision=svn info  | % { if( $_ -match "Last Changed Rev: (?<rev>.*)" ) { $matches['rev'];} }
  $url=svn info  | % { if( $_ -match "URL: (?<url>.*)" ) { $matches['url'];} }
  $branch=  if( $url -match ".*(?<branch>(branches.*)|(tags.*)|(trunk.*))" ) { $matches['branch']; } else { "Unknown"; }
}
else {
    cmd /c git rev-parse HEAD  2>&1 | Out-Null
    if ( $LastExitCode -eq 0 ) {
      $revision=$(git log -1 --pretty=format:"%H")
      $branch=$(git name-rev --name-only HEAD)
      $remote=$(git config branch.$branch.remote)
      $url=$(git config remote.$remote.url)
    }
    else {
      revision="Unknown"
      branch="Unknown"
      url="file://$cwd"
    }
}

$srcChecksum="N/A"


$fileContent = @"
/*
 * Generated by scripts/saveVersion.ps1
 */
@VersionAnnotation(version="$version", revision="$revision", branch="$branch",
                         user="$user", date="$date", url="$url",
                         srcChecksum="$srcChecksum")
package org.apache.flume;
"@

New-Item $outputFile -value $fileContent -force -type file

