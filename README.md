# 🔁 Palindrome Checker App (Java)

A **console-based Java application** that demonstrates multiple approaches to validate whether a given string is a **palindrome**.
This project progressively explores **core programming concepts, data structures, recursion, object-oriented design, and design patterns** through 13 structured use cases.

---

## 📌 What is a Palindrome?

A **palindrome** is a word, phrase, number, or sequence that reads the same **forward and backward**.

Examples:

* `madam`
* `racecar`
* `level`
* `Never Odd Or Even` *(ignoring spaces and case)*

---

# 🚀 Project Objectives

The **PalindromeChecker App** aims to:

* Strengthen **Java programming fundamentals**
* Demonstrate **multiple algorithmic approaches**
* Apply **data structures** such as Stack, Queue, Deque, and Linked List
* Practice **Object-Oriented Programming (OOP)**
* Implement **Design Patterns**
* Compare **algorithm performance**

---

# 🧠 Implemented Use Cases

| Use Case | Feature                          | Concepts Used                          |
| -------- | -------------------------------- | -------------------------------------- |
| **UC1**  | Basic Palindrome Checker         | String comparison                      |
| **UC2**  | Input validation                 | Conditionals                           |
| **UC3**  | String Reverse Palindrome        | Loops, String immutability             |
| **UC4**  | Character Array Palindrome       | `char[]`, Two-pointer technique        |
| **UC5**  | Stack-based Palindrome           | Stack (LIFO)                           |
| **UC6**  | Queue + Stack Comparison         | Queue (FIFO), Stack                    |
| **UC7**  | Deque-based Palindrome           | Double-ended queue                     |
| **UC8**  | Linked List Palindrome           | Singly Linked List, Fast/Slow pointers |
| **UC9**  | Recursive Palindrome             | Recursion, Call Stack                  |
| **UC10** | Case-insensitive & space ignored | String preprocessing, Regex            |
| **UC11** | Object-Oriented Service          | Encapsulation, SRP                     |
| **UC12** | Strategy Pattern Algorithms      | Interfaces, Polymorphism               |
| **UC13** | Performance Comparison           | `System.nanoTime()`                    |

---

# 🧩 Algorithms Implemented

The project demonstrates several algorithmic approaches:

* Reverse String Method
* Character Array Two-Pointer Method
* Stack-based Palindrome Check
* Queue vs Stack Comparison
* Deque Optimization
* Linked List Comparison
* Recursive Palindrome Algorithm
* Strategy Pattern Algorithm Selection
* Performance Benchmarking

---

# 🏗 Project Structure

```
PalindromeCheckerApp
│
├── UseCase1PalindromeCheckerApp.java
├── UseCase2PalindromeCheckerApp.java
├── UseCase3PalindromeCheckerApp.java
├── UseCase4PalindromeCheckerApp.java
├── UseCase5PalindromeCheckerApp.java
├── UseCase6PalindromeCheckerApp.java
├── UseCase7PalindromeCheckerApp.java
├── UseCase8PalindromeCheckerApp.java
├── UseCase9PalindromeCheckerApp.java
├── UseCase10PalindromeCheckerApp.java
├── UseCase11PalindromeCheckerApp.java
├── UseCase12PalindromeCheckerApp.java
└── UseCase13PalindromeCheckerApp.java
```

---

# ⚙️ How to Run

### 1️⃣ Compile the Java file

Example:

```
javac UseCase5PalindromeCheckerApp.java
```

### 2️⃣ Run the program

```
java PalindromeCheckerApp
```

---

# 💻 Example Output

```
Enter a string:
racecar

The given string is a Palindrome
```

---

# 📊 Performance Comparison (UC13)

The project also measures execution time of different algorithms using:

```
System.nanoTime()
```

Example Output:

```
Reverse Method: true | Time: 5200 ns
Stack Method: true | Time: 6800 ns
Deque Method: true | Time: 4300 ns
```

---

# 🧱 Technologies Used

* **Java**
* **Java Collections Framework**
* Stack
* Queue
* Deque
* Linked List
* Recursion
* Design Patterns (Strategy Pattern)

---

# 🎓 Learning Outcomes

By completing this project, you will understand:

* Efficient **string manipulation**
* Practical **data structure applications**
* **Algorithm design and comparison**
* **Object-Oriented Design Principles**
* **Strategy Pattern implementation**
* Performance benchmarking techniques

---

# ⭐ Future Improvements

* GUI version using **Java Swing / JavaFX**
* Support for **Unicode characters**
* Palindrome detection in **files and large datasets**
* Visualization of algorithms

---

# 📚 Author

Developed as part of a **Data Structures & Java Programming practice project** to explore different approaches for solving the **Palindrome Problem**.

---

⭐ If you found this project useful, feel free to **star the repository!**
