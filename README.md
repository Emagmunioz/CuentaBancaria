# Bank Account System - TDD Example

A Java implementation of a bank account system developed using Test-Driven Development (TDD) with Maven, JUnit 5 and Hamcrest.

## Features

- **Account** (Abstract base class)
  - Deposit/withdraw money
  - Calculate monthly interest
  - Generate monthly statements

- **SavingsAccount**
  - Active when balance ≥ $10,000
  - Additional fees after 4 withdrawals/month

- **CurrentAccount**
  - Supports overdraft
  - Deposits reduce overdraft first

## Development Approach

- Strict TDD workflow (Red-Green-Refactor)
- One commit per test/implementation
- 100% test coverage (verified with JaCoCo)

## Technologies

- Java 11
- Maven
- JUnit 5
- Hamcrest matchers



mvn clean install



## Coverage

![image](https://github.com/user-attachments/assets/d093b5be-13b2-41aa-b8fb-9d3018c2c936)

## UML Diagram

![image](https://github.com/user-attachments/assets/a2e6be6e-0374-4e98-a4dd-2d1b82bc48fc)


## Example Usage

// Savings Account

SavingsAccount savings = new SavingsAccount(15000f, 0.05f);

savings.deposit(3000f);

savings.withdraw(5000f);


// Current Account 

CurrentAccount current = new CurrentAccount(5000f, 0.08f);

current.withdraw(6000f); // Creates $1000 overdraft

current.deposit(3000f); // Reduces overdraft


# License
MIT






