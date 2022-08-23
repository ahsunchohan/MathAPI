# Math API

## Question
Implement a web service (in Go, Python, or Java). Feel free to use a framework, if desired.
- /min - given list of numbers and a quantifier (how many) provides min number(s)
- /max - given list of numbers and a quantifier (how many) provides max number(s)
- /avg - given list of numbers calculates their average
- /median - given list of numbers calculates their median
- /percentile - given list of numbers and quantifier 'q', compute the qth percentile of the list elements

No need to be concerned with resources, we're assuming there's plenty enough of memory, etc. The percentile should just return one
number. Use the nearest-rank method. https://en.wikipedia.org/wiki/Percentile#The_nearest-rank_method


## Description 
- It contains the following APIs:
  - `/min` given list of numbers and a quantifier (how many) provides min number(s)
  - `/max` given list of numbers and a quantifier (how many) provides max number(s)
  - `/avg` given list of numbers calculates their average
  - `/median` given list of numbers calculates their median
  - `/percentile` given list of numbers and quantifier 'q', compute the qth percentile of the list elements using the nearest-rank method

## How to compile

```mvn clean compile install```

## How to run
```mvn spring-boot:run```

## How to test
```mvn test```

## URL for API documentation
```http://localhost:8080/swagger-ui/```

## Screenshot
<img width="1149" alt="image" src="https://user-images.githubusercontent.com/26001761/186161429-6db67f98-92bc-4e95-9866-958dec90d6b3.png">


## What this API do

This API has 5 endpoints, as described below:

#### Get min numbers
```http
POST /api/operation/min
{
  "numbers": [1, 1.5, 2],
  "quantifier": 1
}
```

#### Get max numbers
```http
POST /api/operation/max
{
  "numbers": [1, 1.5, 2],
  "quantifier": 1
}
```

#### Get numbers average
```http
POST /api/operation/avg
{
  "numbers": [1, 1.5, 2]
}
```

#### Get numbers median
```http
POST /api/operation/avg
{
  "numbers": [1, 1.5, 2]
}
```

#### Get numbers percentile
```http
POST /api/operation/avg
{
  "numbers": [1, 1.5, 2],
  "quantifier": 30
}
```
