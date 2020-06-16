# Retrofit simple example

## What is Retrofit

Retrofit is a REST Client for Java and Android. It makes it relatively easy to retrieve and upload JSON (or other structured data) via a REST based webservice. In Retrofit you configure which converter is used for the data serialization. Typically for JSON you use GSon, but you can add custom converters to process XML or other protocols. Retrofit uses the OkHttp library for HTTP requests.

## Implementation

Use the Following Library

```bash
 implementation 'com.squareup.retrofit2:retrofit:2.5.0'
 implementation 'com.squareup.retrofit2:converter-scalars:2.5.0'
 implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
```

## STEP INVOLVED

### Step 1: Create Interface of Retrofit (retrofite/Retrofit_interface).
### Step 2: Build the Retrofit and define Base url, serializer etc (retrofite/APIClint).
### Step 3: Define the POJO class for the expected Json file (Model/Data).
### Step 4: Call the retrofit call method to receive the Response from server.
## Useful URL Video 

[RETROFIT Tutorial (v 2.5.0) | HTTP Client](https://www.youtube.com/watch?v=1FVoBM9t2Ik)

[Retrofit Tutorial Part 1 - SIMPLE GET REQUEST - Android Studio Tutorial](https://www.youtube.com/watch?v=4JGvDUlfk7Y&t=652s)

## URL Used 
In this example we are using the [Weather API](https://www.youtube.com/watch?v=1FVoBM9t2Ik).( Make sure to subscribe and get your own key )

URL: api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={your api key}

Method : GET

## Our Response 

Example: [api.openweathermap.org/data/2.5/weather?lat=35&lon=139](https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=439d4b804bc8187953eb36d2a8c26a02) (Make sure the replace with ypur key after the subscription [LINK](https://home.openweathermap.org/users/sign_up))

```bash
 {"coord": { "lon": 139,"lat": 35},
  "weather": [
    {
      "id": 800,
      "main": "Clear",
      "description": "clear sky",
      "icon": "01n"
    }
  ],
  "base": "stations",
  "main": {
    "temp": 281.52,
    "feels_like": 278.99,
    "temp_min": 280.15,
    "temp_max": 283.71,
    "pressure": 1016,
    "humidity": 93
  },
  "wind": {
    "speed": 0.47,
    "deg": 107.538
  },
  "clouds": {
    "all": 2
  },
  "dt": 1560350192,
  "sys": {
    "type": 3,
    "id": 2019346,
    "message": 0.0065,
    "country": "JP",
    "sunrise": 1560281377,
    "sunset": 1560333478
  },
  "timezone": 32400,
  "id": 1851632,
  "name": "Shuzenji",
  "cod": 200
}
```

## THNAK YOU
