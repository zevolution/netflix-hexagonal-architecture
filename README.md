<p align="center">
<img src="https://user-images.githubusercontent.com/36534847/147706401-2d3d1b89-1a72-4408-9660-e0da649196ea.png" alt="FlixHexaArch-Logo" width="700">
<h1 align="center">Netflix Hexagonal Architecture</h1>

## Table of contents
- [About the project](#about-the-project)
- [Description](#description)
- [Built with](#built-with)
- [Installation](#installation)
- [Requirements to run](#requirements-to-run)
- [Usage information](#usage-information)
- [Run](#run)
- [License](#license)

## About the project
This project was created as a simple example to show how we can implement the hexagonal architecture(software design) proposed by Netflix in [this article](https://netflixtechblog.com/ready-for-changes-with-hexagonal-architecture-b315ec967749).

## Description
This project has business logic to get the software by author and software name inside a company, for this, it searches in the company's main git provider, which is Github. At some point, the company decides to change its git provider from Github to Gitlab; thus, changing the application's data source.
<br>
<br>
*To change datasource from Github to Gitlab switch @Primmary annotation between them and restart application*

## Built with
* [Java 11](https://openjdk.java.net/projects/jdk/11/)
* [Maven](https://maven.apache.org/)
* [Spring-Boot 2.5.0](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/)
* [SpringFox 3](https://github.com/springfox/springfox/releases/tag/3.0.0)
* [MapStruct](https://mapstruct.org/documentation/stable/reference/html/)
* [OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
* [JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
* [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator)
* [WireMock](http://wiremock.org/)

## Installation

To clone and run this application, you'll need Git installed on your computer(or no, if you want to download **.zip**). From your command line:
```bash
# Git CLI
git clone https://github.com/zevolution/netflix-hexagonal-architecture.git

# Github CLI
gh repo clone zevolution/netflix-hexagonal-architecture
```

## Requirements to run
* If you use Windows OS, is strongly recommended that you use Git Bash to perform all operations.
* [Docker Engine](https://www.docker.com/get-started)
* [Docker Compose](https://docs.docker.com/compose/install/)
* OpenJDK 11 (if you don't use docker)

## Usage information
1. After open project in your IDE, run `mvn clean generate-resources` to generate stub OpenAPI structure with `OpenAPI Generator` in target folder.
2. Default api-port is `8180`
3. Default debug-port is `5105`
4. Default actuator-port is `9190`
5. Default context-path `/service--softwares-info`
6. Swagger URI `/service--softwares-info/swagger-ui/`
7. Actuator URI `/actuator`

## Run
You can execute `startup.sh`, before grant execution permissions with `chmod +x startup.sh`. If you can't run `startup.sh`, follow these steps:
1. Open your terminal in the project folder
2. Run `docker-compose up`

## License
[MIT](https://choosealicense.com/licenses/mit/)
