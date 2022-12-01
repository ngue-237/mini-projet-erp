# mini-projet-erp

Microservices and port number:

1- config server, port 8888
2- register-server (Eureka server), port 8761
3- gateway server (or proxy server), port 8080

How to turn on our microservice architecture

1- clone current projet (using git clone https://github.com/ngue-237/mini-projet-erp.git)
2- launch config server first, then launche Eureka server
3- Move into your favorite browser then open Eureka server interface (http://localhost:8761/)

Add new microservice properties

1- Clone the config repository (using git clone https://github.com/ngue-237/min-projet-cloud-config.git)
2- Create new properties file (.yml or .properties) then push it to git
3- Made all the configuration inside your local microservice to made it available

Added new microservice

1- Create your microservice online, using the spring initializr tool
2- Add your microservice project folder inside the current folder
3- Add your propertie inside the config repository
