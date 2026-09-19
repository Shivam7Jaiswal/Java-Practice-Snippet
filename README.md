# ☕ Java Snippets

A collection of small, focused Java code snippets covering core concepts and beyond. Each snippet is short, self-contained, and easy to run, so it works as both a quick reference and a revision aid.

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![Snippets](https://img.shields.io/badge/Type-Code%20Snippets-6C5CE7)
![Status](https://img.shields.io/badge/Status-Actively%20Updated-2ea44f)

---

## 📚 What's Inside

Snippets are grouped by topic. Each folder contains standalone `.java` files, one concept per file.

| Folder | Topics |
|---|---|
| `basics/` | Data types, operators, control flow, loops, arrays |
| `strings/` | String methods, `StringBuilder`, immutability, string pool |
| `oop/` | Classes, inheritance, polymorphism, abstraction, interfaces |
| `collections/` | `ArrayList`, `LinkedList`, `HashMap`, `HashSet`, iterators |
| `exceptions/` | try/catch/finally, custom exceptions, try-with-resources |
| `multithreading/` | Threads, `Runnable`, synchronization, executors |
| `java8/` | Lambdas, streams, `Optional`, functional interfaces |

> 📝 Update this table to match the folders that actually exist in the repo.

---

## 🗂️ Project Structure

```
java-snippets/
├── basics/
├── strings/
├── oop/
├── collections/
├── exceptions/
├── multithreading/
├── java8/
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- **JDK 17 or higher** ([download](https://adoptium.net/))
- Any editor or IDE (IntelliJ IDEA, Eclipse, VS Code)

Check your setup:

```bash
java -version
javac -version
```

### Clone the repo

```bash
git clone https://github.com/Shivam7Jaiswal/<repo-name>.git
cd <repo-name>
```

### Run a snippet

Compile and run any file directly:

```bash
cd collections
javac HashMapDemo.java
java HashMapDemo
```

Or, on JDK 11+, run a single-file program without a separate compile step:

```bash
java HashMapDemo.java
```

---

## 🧩 Snippet Format

Each file follows the same simple pattern so it's quick to scan:

```java
// Topic: HashMap basics
// Concept: Storing and retrieving key-value pairs

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Java", 90);
        marks.put("SQL", 85);

        System.out.println(marks.get("Java")); // 90
    }
}
```

---

## 🎯 Goals

- Build a personal, searchable library of Java concepts
- Keep every snippet small enough to read in under a minute
- Grow from core Java into advanced Java, SQL/JDBC, and Spring Boot

---

## 🤝 Contributing

Suggestions and corrections are welcome. If you spot a mistake or have a snippet idea:

1. Fork the repo
2. Create a branch: `git checkout -b add-snippet-name`
3. Commit your change: `git commit -m "Add: snippet name"`
4. Push and open a Pull Request

---
