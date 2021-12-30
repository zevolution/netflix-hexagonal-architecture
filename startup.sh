#!/bin/bash
echo -e "\e[1m---------------------< Application provisioning startup >---------------------\e[0m"
echo ""
docker-compose up -d
echo "------------------------------------------------------------------------------"
echo ""
echo ""

echo -e "\e[1mAccess URLs:\e[0m"
echo    "----------------------------------------------------------------"
echo -e "             \033[1mAPI URL:\033[0m http://localhost:8180/service--softwares-info"
echo -e "             \033[1mSwagger:\033[0m http://localhost:8180/service--softwares-info/swagger-ui/"
echo -e "            \033[1mActuator:\033[0m http://localhost:9190/actuator"
echo -e "          \033[1mDebug Port:\033[0m 5105"
echo    "----------------------------------------------------------------"
