# 🎓 Student Management System (Java - JCF Based)

A simple **console-based Java application** that manages student records using the **Java Collections Framework (HashMap & TreeMap)**.

---

## 📌 Features

* ➕ Add Student
* ❌ Delete Student
* 🔍 Search Student by ID
* 📋 Display All Students
* 🔃 Sort Students by ID
* 🚪 Exit System

---

## 🛠️ Technologies Used

* ☕ Java
* 📦 Java Collections Framework (JCF)

  * `HashMap`
  * `TreeMap`
* 🖥️ Console-based UI

---

## 📂 Project Structure

```
StudentManagement/
│
├── Student.java          // Student class (data model)
├── StudentManagement.java // Main application logic
└── README.md             // Project documentation
```

---

## 🧠 Concepts Covered

* Object-Oriented Programming (OOP)
* Encapsulation (Student class)
* HashMap for fast data storage & retrieval
* TreeMap for sorting
* Exception Handling (`try-catch`)
* Looping (`do-while`)
* Switch Expressions (Java 8+)

---

## 🚀 How It Works

1. User selects an option from the menu.
2. Based on input:

   * Data is added, removed, searched, or displayed.
3. Student data is stored using:

   ```
   HashMap<Integer, Student>
   ```
4. Sorting is done using:

   ```
   TreeMap<Integer, Student>
   ```

---

## ▶️ Sample Output

```
Choose any option below:
1. Add Student
2. Delete Student
3. Search Student
4. Display All Students
5. Sort Students by ID
0. Exit

Enter your choice: 1

Enter ID: 101
Enter Name: John

Student added successfully!
```

---

## ⚠️ Limitations

* Data is stored in memory (not persistent)
* No GUI (console-based only)
* No validation for duplicate IDs

---

## 🔮 Future Improvements

* 💾 Add file storage (data persistence)
* 🗄️ Connect to database (MySQL)
* 🔍 Search by name
* 📊 Sort by name using Comparator
* 🎨 Add GUI (Java Swing / JavaFX)

---

## 👨‍💻 Author

**Biswa**

---

## ⭐ Final Note

This project is a great beginner-friendly implementation of:

* Java fundamentals
* Collections Framework
* Real-world CRUD operations

---


