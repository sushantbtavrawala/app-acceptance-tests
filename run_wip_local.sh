#!/bin/bash


#sbt -Dbrowser=chrome-local -Denvironment=local -Ddevicetype=browser 'test-only application.suites.RunWip'
sbt -Dbrowser=chrome-local -Denvironment=local -Ddevicetype=browser 'test-only application.suites.RunWip'

