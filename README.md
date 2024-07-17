# Video Social Network
## Running
First the docker images must be built
For this cd into each microservice and run ./gradlew dockerBuild

```sh
cd video-microservice
./gradlew dockerBuild
cd ..
cd trending-hashtag-microservice
./gradlew dockerBuild
cd ..
cd subscription-microservice
./gradlew dockerBuild
cd ..
docker-compose up -d
```
alternatively you can also run
```sh
docker compose
    -p video-system-prod
    -f docker-compose.yml
    up -d
```

# Using the command line client
To make use of command line client, you must cd into the video-client folder.
To see a list of commands tou can run
```sh
./gradlew run --args="--help"
```
