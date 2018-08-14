#!/usr/bin/env bash

sbt -Dbrowser=chrome-local -Denvironment=local -Ddevicetype=browser 'test-only application.suites.RunFeature'