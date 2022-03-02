# Banking Console App - Project 0

## Description
The Bank app is a console-based application that simulates banking operations. 
Users can login via the command line and interact with the system.
A customer can apply for an account, view their balance, and make withdrawals and deposits. 
An employee can approve or deny accounts and view account balances for their customers.

## Purpose
We want to see that you can meet deadlines and that you can code.
The basic structure of the application has been created for you already.
You are expected to complete the requirements below and submit your code for review.

The project will be split into 2 parts and you will be given feedback on your progress after each part.
Additionally, test cases are implemented to score your completion of the requirements and to measure
your progress. Each passing test gives you a certain number of points as noted in the test case. 

## Tech Stack
* Java 8
* Maven
* JUnit 4.12
* Log4j 1.2
* Mockito 3.7

## Setup
Step 1: Use GitHub Classroom assignment link to setup your repo

Step 2: Clone the repository locally

Step 3: Import the project into workspace
* File > Open Projects From File System... (this will auto-detect which kind of project you're importing)
* Click "Directory" and find the location of the folder
* Note: your workspace directory must be different than the project directory.

Step 4: Start developing!

## Requirements - Part 1 (Check-in)

The first part of the project should be completed by **Wednesday of Week 2** of training. The items below are guidelines
as to what you should have done by the date to keep you on track. Regardless of functionality completed, you must have your
code pushed to your `master` branch on Github). We'll review your submission and give you any feedback to keep you on track 
for the final deadline.

1. Implement enough of the user stories below to score 15 points in your test cases
2. Data is read from and written to a file system 
3. All file integration tests pass
4. All user input is received using the `java.util.Scanner` class
5. Use the project structure given in your starter code. Only modify test classes if you need to refactor tests.

## Requirements - Part 2

You must complete these requirements by **Wednesday of Week 3** of training.

1. All unit tests should be passing at this point
2. All database integration tests pass
3. Refactor your data access to read / write from a database instead of file system
4. Log4j is implemented to log events to a file. Appropriate log levels should be used.
5. Configuration should be externalized (e.g. read in from a file or environment variable) instead of hard-coded

## User Stories - Core Requirements
Total Points: 35 points

* As a user, I can register with a username and password
  * 1 point
* As the system, I reject registration attempts for usernames that already exist
  * 1 point
* As a user, I can login with a username and password
  * 2 points
* As the system, I reject login attempts with invalid credentials
  * 1 point
* As a customer, I can apply for a new bank account with a starting balance.
  * 3 points
* As a customer, I can view the balance of a specific account
  * 1 point
* As a customer, I can make a deposit to a specific account
  * 2 points
* As a customer, I can make a withdrawal from a specific account
  * 2 points
* As the system, I reject and prevent overdrafts
  * 1 points
* As the system, I reject deposits or withdrawals of negative money
  * 2 points
* As the system, I reject any transactions of unapproved accounts
  * 1 point
* As an employee, I can approve or reject an account.
  * 2 points
* As a customer, I can post a money transfer to another account.
  * 3 points
* As the system, I reject invalid transfers (negative amounts or overdrafts)
  * 1 point
* As an employee, I can view a log of all transactions.
  * 2 points
* File I/O integration tests
  * 10 points
* Database integration tests
  * NOTE: database tests are ignored for scoring purposes, but you should still run the tests locally to 
  help you validate your JDBC code

### Branches, Pull Requests, and Testing
When working on a feature or portion of the project, you should use git branches. The `master` branch should always
contain fully working code, not incomplete or broken code. You can work on the codebase in your own branch, and once
you have completed the feature and passed the relevant tests, merge your branch into `master`.

When you push to the `master` branch on Github, a pull request will be opened automatically and the unit tests 
will be run which report on the state of the project. In the pull request your trainer and QC member can provide 
feedback on your code as you progress. If you finish the project before the deadline, push up your code early so 
that we can give you feedback on your code as soon as possible.

Avoid making unnecessary pushes to the `master` branch on Github as this will waste limited compute resources we can
use in Github Actions. Instead, test your code locally (`mvn test`, or in your IDE) to see if your tests are passing.

> NOTE: when you run `mvn test`, look for **PROJECT SCORE** in the console output to view your current score for the project.

Feel free to modify or refactor the tests if they don't fit with the application code you're writing. The tests
are provided as an example so you can see how to setup and assert conditions properly. Make sure any tests you write or refactor
make sense in the context of testing the behavior you want to implement.

> If you find errors in the starter tests or project code, feel free to change it and open a ticket on the Github repo

### Troubleshooting
If you run into a problem you can't resolve during development, be resourceful. Here are some ideas to help you:
* Proofread your code (look for typos or logical errors)
* Review API documentation
* Ask a colleague for advice or help (do NOT copy code, though)
* Search StackOverflow or Google
* Use print statements or a debugger

Finally, if nothing else - push your code to Github and ask your trainer or QC to review it and give you feedback. It's
always important that you provide as much context and ask precise questions so that others can best assist you.

## Extra
You are welcome to add additional functionality beyond the base requirements, but you should have the core functionality finished first. Also,
don't forget to re-run your unit tests when you add new features to check that you aren't introducing regressions into the codebase. Below are 
some sample stretch goals to aim for.

### Stretch Goals
* Savings accounts have an enforced limit of 5 transactions per month
* Employees can blacklist a customer
* Blacklisted customers cannot login or perform transactions
* Transactions can be filtered by user, account, type of transaction, or amount
* Transactions above a configurable limit are flagged for fraud and rejected
* Record customer emails and send a notification when a transaction exceeds a configurable amount (HINT: look into Javamail API)
* Write some unit tests for any of these bonus features you've completed

Good luck :)
