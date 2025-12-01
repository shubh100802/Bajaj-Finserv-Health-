# BFH Webhook Solver

This is a Spring Boot application that solves the Bajaj Finserv Health coding challenge for the JAVA track.

## Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher

## Configuration

Update the following properties in `src/main/resources/application.yml`:

```yaml
user:
  name: "Your Name"
  email: "your.email@example.com"
  registration: "YOUR_REG_NUMBER"
```

## Building the Application

```bash
mvn clean package
```

The executable JAR file will be generated at:
`target/bfh-webhook-solver-1.0.0.jar`

## Running the Application

```bash
java -jar target/bfh-webhook-solver-1.0.0.jar
```

## How It Works

1. On startup, the application will automatically:
   - Send a POST request to generate a webhook URL
   - Solve the SQL problem based on your registration number
   - Submit the solution to the provided webhook URL

2. The solution is determined by the last digit of your registration number:
   - Odd: Solves Question 1
   - Even: Solves Question 2

## Logs

Check the application logs to see the progress and any potential errors.

## Note

Make sure you have a stable internet connection as the application makes HTTP requests to external services.
