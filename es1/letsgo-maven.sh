#!/bin/sh

echo "letsgooooooooo MAVEN $(date)"

mvn --version
java -version

mvn install

mvn spring-boot:run
