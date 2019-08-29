#!/bin/bash
#Date: 2019-08-21
#Author: MuggleLee
#Version: v1.0
docker ps -a | sed '/^CONTAINER/d' | grep "NotificationCenter" | gawk '{cmd="docker rm -f "$1; system(cmd)}'
docker images | sed '/^IMAGE/d' | grep "notification-center" | gawk '{cmd="docker rmi "$3; system(cmd)}'
mvn clean package -P dev docker:build -Dmaven.test.skip;
docker run -d -p 8091:8091 -e "SPRING_PROFILES_ACTIVE=dev" --name=NotificationCenter com.hao/notification-center:1.0;