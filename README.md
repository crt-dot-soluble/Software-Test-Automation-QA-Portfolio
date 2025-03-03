# Software Testing Portfolio

This portfolio demonstrates my work in software testing automation through assignments completed throughout the course as well as a report containing a summary and reflection.

# Reflection

## Code Functionality and Security

To ensure functionally correct and secure code, I implemented a rather comprehensive testing strategy which includes multiple layers of validation. My testing approach included:
- Thorough unit testing to verify individual components' behavior
- Input validation to prevent the submission of invalid or improperly formatted data
- Exceptions to allow for graceful error handling
- Easy to read and maintain code

As demonstrated in the Contact, ContactService, and associated test files, each function includes a concise, easy-to-understand name and proper validation checks and error handling.

## Understanding and Implementing Requirements

Interpreting requirements is essential when writing software and in testing. To effectively write tests, you must know what criteria you are testing against. This can involve:
- Breaking down requirements into individual components
- Creating rules for validation that align with the given expectations
- Ensuring edge cases are covered

This is displayed in all the files present in the project but is shown very clearly in the Contact class where nearly each member has a requirement to be met before setting
the value. Take for example the PhoneNumber field is required to be exactly 10 numeric characters and having any other amount or type should throw an exception.

## My Approach
In order take make sure my code and tests are effective and extendable, I kept a few things in mind when writing them. Firtly, writing clean and readable code is extremely
important for understanding the changes you are making if at any point you must return to and modify the code. It also allows others to easily understand it, should they ever need to.
In terms of the tests themselves I make sure each test is testing for one thing and modularize all of my testing and code as best I can in a manner where each function does exactly 
one thing where possible. This helps ensure each test is working correctly, each test is free of outside influence and code is being reused where possible.

## Additions
If I were to make any additions, at a minimum, I would make sure to include some type of security or vulnerability testing. Anytime there's user information being used or especially stored
it's incredibly important to make sure that information is safe and obfuscated in a way that meets today's standard. It was not specifically stated, but because we were developing a mobile app with
user information, it is likely that information will need to leave a device at one point or another and making sure that the information leaves and enters the app securely will give customers
piece of mind.
