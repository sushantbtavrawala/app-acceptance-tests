#!/usr/bin/env bash

ENV="local"

pids=`pidof BrowserStackLocal`
if [ pids ]; then
  echo "BrowserStackLocal process found."
  else
  echo "BrowserStackLocal process not found. You must run 'run_browserstackbinary.sh' in another terminal first."
  exit -1
fi


echo "Environment : $ENV"

# Use this to choose which browser configurations to run against.
declare -a setups=("BS_Android_GalaxyS8_v7")

#declare -a setups=("BS_ElCapitan_Firefox_v58" "BS_Android_GalaxyS8_v7" "BS_Sierra_Chrome_v64" "BS_Win7_Chrome_v64" "BS_Win7_Firefox_v58" "BS_Win7_IE_v11" "BS_Win10_Chrome_v64" "BS_Win10_Edge_v16" "BS_Win10_Firefox_v58" "BS_Win10_IE_v11" "BS_Yosemite_Chrome_v64" "iPad_Air_v8_3" "iPad_Mini_v7" "Samsung_S8_v7")

for setup in "${setups[@]}"; do
    echo "******************** Loading config from $setup.json ********************"
    sbt -Dbrowser=browserstack -DtestDevice="$setup" -Denvironment="$ENV" 'test-only application.suites.RunBS'
done

