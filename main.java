!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Weather App</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Weather App</h1>
        <div id="weather">
            <p>Enter a city to get the current weather or use your current location:</p>
            <input type="text" id="city" placeholder="City Name">
            <button id="getWeather">Get Weather</button>
            <button id="getLocationWeather">Use Current Location</button>
            <div id="weatherInfo">
                <!-- Weather information will be displayed here -->
            </div>
        </div>
    </div>
    <script src="app.js"></script>
</body>
</html>
