<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fitness Tracker App</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 2em;
        }

        section {
            padding: 2em;
        }

        h1, h2 {
            color: #333;
        }

        .cta-button {
            display: inline-block;
            padding: 1em 2em;
            margin: 1em;
            text-decoration: none;
            color: #fff;
            background-color: #4CAF50;
            border-radius: 5px;
        }

        .features {
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
        }

        .feature {
            text-align: center;
            margin: 1em;
        }

        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 1em;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>

<body>

    <header>
        <h1>Fitness Tracker App</h1>
        <p>Your personal fitness companion</p>
    </header>

    <section>
        <h2>Track Your Fitness Journey with Ease</h2>
        <p>Stay motivated and achieve your fitness goals with our intuitive fitness tracking app.</p>
        <a href="#cta" class="cta-button">Get Started</a>
    </section>

    <section class="features">
        <div class="feature">
            <img src="icon1.png" alt="Feature 1">
            <h3>Track Workouts</h3>
            <p>Log and analyze your workouts with detailed statistics.</p>
        </div>
        <div class="feature">
            <img src="icon2.png" alt="Feature 2">
            <h3>Set Goals</h3>
            <p>Define your fitness goals and monitor your progress.</p>
        </div>
        <div class="feature">
            <img src="icon3.png" alt="Feature 3">
            <h3>Stay Connected</h3>
            <p>Connect with friends, share achievements, and stay motivated together.</p>
        </div>
    </section>

    <section id="cta">
        <h2>Start Your Fitness Journey Today!</h2>
        <p>Download our app and take the first step towards a healthier lifestyle.</p>
        <a href="#download" class="cta-button">Download Now</a>
    </section>

    <footer>
        <p>&copy; 2023 Fitness Tracker App. All rights reserved.</p>
    </footer>

</body>

</html>
