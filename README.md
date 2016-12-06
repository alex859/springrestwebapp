# Spring Rest Web App

The main goal of this repository is to keep a basic structure of a web application based on Spring Boot and ReactJS.

The idea is to have a frontend as single page app served by a Spring based server, talking to it via a REST API.
This project is also a way to practice with React and possibly Scala.

The project contains the following modules:

- common: for common POJOs and common logic
- service: for business logic and data layer (possibly Scala based)
- restservice: Spring Boot based REST services and authentication logic
- webapp: main module containing the frontend JS application and the main Spring Boot class. (I've just started playing with npm and React)

## Getting started

### Prerequisites

- Java 8
- npm

### Build

From the root of the project run:

`./gradlew build`

This command requires npm to be installed on your system and will download the required
javascript libraries.

Gradle task `npmBuild` internally calls `webpack -d` that "only" merges the javascript sources and of
 course this is not suitable for production. At some point I'll fix this. ("only" is of course incorrect since it transpiles the jsx etc..)

To run the application:

`./gradlew bootRun`

Or using IntellijIdea you can jus click the play button in `Application.java`.

### Hot reload

During development it's really nice to be able to reload resources and classes without having to restart the server.
Spring DevTools comes to help: you just need to rebuild the project to have classes hot swapped in the JVM. The same for static resources.

When developing in React, it is useful to have some kind of watcher that rebuilds the js app when something changes.
To do this you can use the gradle task `:components:webapp:npmWatch`. You will still need to rebuild the project for the static resources to be reloaded.


