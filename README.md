# Calculator

A straightforward and robust calculator application built using Java. This project serves as a foundational example of Java programming applied to simple mathematical logic, providing users with the ability to perform core arithmetic operations quickly and reliably.

## Project Overview

The **Calculator** is designed to handle the four fundamental mathematical operations: addition, subtraction, multiplication, and division. Whether implemented as a command-line tool or a simple Graphical User Interface (GUI), the focus is on performance, accuracy, and a clean, maintainable codebase written entirely in Java.

## Key Features

* **Fundamental Arithmetic:** Capable of executing the four primary mathematical operations:
    * **Addition (`+`)**: Computes the sum of two numbers.
    * **Subtraction (`-`)**: Determines the difference between two numbers.
    * **Multiplication (`*`)**: Calculates the product of two numbers.
    * **Division (`/`)**: Finds the quotient, including basic handling for division by zero.
* **Ease of Use:** Designed with a simple, intuitive user experience in mind.
* **Modular Code:** The logic for each operation is distinctly separated, making the code easy to read, test, and extend for future features (e.g., modulus, exponentiation).
* **Platform Independence:** As a pure Java application, it can be run on any platform with a compatible Java Virtual Machine (JVM).

## Technologies Used

* **Java:** The core programming language.
* **JDK (Java Development Kit):** Required for compiling and running the application.

## Getting Started

To get a local copy of this project up and running, follow these simple steps.

### Prerequisites

You must have the **Java Development Kit (JDK) 8 or higher** installed on your system.

### Installation

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/raymondoyondi/Calculator.git](https://github.com/raymondoyondi/Calculator.git)
    cd Calculator
    ```

2.  **Compile the Source Code:**
    Navigate to the directory containing the source files and compile the Java classes.
    ```bash
    # Assuming source files are in a 'src' directory
    javac src/*.java 
    ```

3.  **Run the Application:**
    Execute the compiled code, replacing `MainClass` with the name of the application's main class (e.g., `Calculator`).
    ```bash
    java MainClass
    ```

## Usage

Once running, the application will typically prompt the user for input.

### Command-Line Usage

In a typical command-line setup, the application will request inputs sequentially:

1.  Enter the first number.
2.  Enter the desired operator (`+`, `-`, `*`, `/`).
3.  Enter the second number.

The calculator will then display the final result of the operation.

**Example Session:**

`Enter first number: 15`

`Enter operator (+, -, *, /): /` 

`Enter second number: 3` 

`Result: 5.0`

## Contributing

We welcome contributions to make this calculator even better! If you have suggestions or find any bugs, please follow these steps:

1.  Fork the repository (`https://github.com/raymondoyondi/Calculator/fork`).
2.  Create your feature branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add a fantastic new feature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request detailing your changes.

## License

This project is open source and available under the **MIT License**. See the `LICENSE` file in the repository for full details.

