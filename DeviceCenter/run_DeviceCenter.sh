#!/bin/bash
#Date: 2019-08-21
#Author: MuggleLee
#Version: v1.0
docker ps -a | sed '/^CONTAINER/d' | grep "DeviceCenter" | gawk '{cmd="docker rm -f "$1; system(cmd)}'
docker images | sed '/^IMAGE/d' | grep "device-center" | gawk '{cmd="docker rmi "$3; system(cmd)}'
mvn clean package docker:build -Dmaven.test.skip;
