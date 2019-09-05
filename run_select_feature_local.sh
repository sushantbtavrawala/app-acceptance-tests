#!/usr/bin/env bash

NC='\033[31;0m'
RESET='\033[0m'
BOLD='\033[1m'
YELLOW='\033[38;5;11m'
GREEN='\033[01;32m'
RED='\033[01;31m'

echo -e $BOLD$YELLOW'Choose the feature from below List:(Note: List is having feature name as per feature file name in repository)'
echo -e $NC'1. Home Page'
echo -e $NC'2. Faeture 1'
echo -e $NC'3. Feature 2'


read -p "$(echo -e $BOLD$YELLOW "Please enter feature id. (Example: Enter 1 If you want to run 'Home Page' feature):"$RESET)" featureId

   if [ $featureId -gt 0 -a $featureId -lt 3 ];
   then
   echo -e $BOLD$GREEN'Thanks for entering valid feature choice'
   echo -e $BOLD$YELLOW'Your submitted Feature choice to run is - ' $featureId

   if test $featureId -eq 1
   then
   echo -e $BOLD$YELLOW'Running feature name is - Home Page'
   tagName="@home_page"
   echo -e $BOLD$YELLOW'Feature is running by tag name - '$tagName
   fi

   if test $featureId -eq 2
   then
   echo -e $BOLD$YELLOW'Running feature name is - Feature 1'
   tagName="@feature_1"
   echo -e $BOLD$YELLOW'Feature is running by tag name - '$tagName
   fi

   if test $featureId -eq 3
   then
   echo -e $BOLD$YELLOW'Running feature name is - Feature 2'
   tagName="@feature_2"
   echo -e $BOLD$YELLOW'Feature is running by tag name - '$tagName
   fi



 sbt -Dbrowser=chrome-local -Denvironment=local -Ddevicetype=browser -DCucumber.Options="--tags $tagName" 'test-only businesstaxaccount.suites.RunWipSuite'

else
 echo -e $RED"Please enter valid feature id as per list. The number you have entered does not exist as per given feature list"
fi




