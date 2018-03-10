# Retrofit
To access [Fulcrum API](http://developer.fulcrumapp.com/api/intro/) you need your add your API Key to a **gradle.properties** file in the root of the app with a string value pair representing your `APIKEY`. The file is not tracked in Git as it is for personal use. 

```
APIKEY=YOUR_API_KEY
```

## Clean the project

`./gradlew clean`

## Build the app

`./gradlew assemble`

## Run the app
`./gradlew run`

## All together now

`./gradlew clean run --info`
