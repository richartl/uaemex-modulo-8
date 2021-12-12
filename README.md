# Frameworks y librerias

## Requirements

This repo requires:
* Docker
* docker-compose

## Run this repo
This repo has a env file `.env.example`, you need to copy this file to .env file into root directory(`cp .env.example .env`).
You could change some of those environment variables in case you need.

Then, you are ready to run this project.
You need to run this commands into root directory
```
docker-compose up
```

After this, docker-compose is deploying:
* a maven container
* a glassfish server container
* a tomcat server container
* mysql container
* volume to persist db data locally

## Compiling projects
If you want to compile projects, you need to put project root folder into `src` folder
```
docker-compose.yml
.env
src
   - myprojectfolder
```
Then you need to enter to maven container to run mvn with this commands
```
docker-compose exec maven bash
```

Once that you're into maven container you could see this console
```
root@167db997681c:/usr/src/mymaven#
```
mymaven has all projects that we have into src/... folder, you could see all your projects here, for example `.../mymaven/myprojectfolder`.
In order to compile and deploy our applications to tomcat, you need to enter into you project folder and run mvn commands.

```
root@167db997681c:/usr/src/mymaven# cd myprojectfolder
root@167db997681c:/usr/src/mymaven/myprojectfolder# mvn clean install package && cp target/myprojectfolder-1.0.war ../targets
```
Once that you are installed dependencies, packaged project and copy to targets folder, tomcat should start to deploy your application, to confirm please check your docker-compose log

## TO-DO's
* Glassfish server and asadmin commands
