# Spring Boot JWT Authentication Example 😊🚀

This Spring Boot project demonstrates JWT authentication implementation using Spring Security.

## Table of Contents

- # introduction
- # features
- # prerequisites
- # getting-started
- # step-1-create-a-new-spring-boot-project
- # step-2-add-dependencies
- # step-3-implement-in-memory-user-authentication
- # step-4-configure-jwt-authentication
- # step-5-create-jwt-authentication-filter
- # usage
- # contributing
- # license

## Introduction

This project showcases how to implement JWT (JSON Web Token) authentication in a Spring Boot application. JWT authentication provides a secure way to manage user authentication and authorization without the need for sessions.

## Features

- In-memory user authentication using Spring Security.
- JWT token generation and validation.
- Custom JWT authentication filter for token-based authentication.

## Prerequisites

Before getting started, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Maven
- IDE (IntelliJ IDEA, Eclipse etc.)

## Getting Started

Follow these steps to set up the project:

### Step 1: Create a New Spring Boot Project

- Go to [Spring Initializr](https://start.spring.io/).
- Fill in the required project metadata.
- Add dependencies for Spring Web and Spring Security.

### Step 2: Add Dependencies 😊

Step 3: Implement In-Memory User Authentication 😊
Create a UserDetailsService bean to provide user details.
Implement in-memory user authentication using Spring Security.

Step 4: Configure JWT Authentication 😊
Create a CustomConfig class to define custom beans.
Define beans for PasswordEncoder and AuthenticationManager.
Implement JWT token generation and validation logic.

Step 5: Create JWT Authentication Filter 😊
Implement a JWTAuthenticationFilter class extending OncePerRequestFilter.
Override the method to handle JWT authentication logic.

Usage
Once the project is set up, you can run it locally and access the following endpoints:

/login: API to accept username and password and return a JWT token upon successful authentication.

