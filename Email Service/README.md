# Email Microservice
## Uber Backend Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

This project is an API built using **Java, Java Spring, AWS Simple Email Service.**

## Installation

1. Clone this repository:

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=******
aws.accessKeyId=******
aws.secretKey=****
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "teste@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```