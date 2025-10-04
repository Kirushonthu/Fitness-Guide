# 🏋️‍♂️ Fitness Guide – OOP Java Project

> “A single source for all your fitness needs.”

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Principles-blue?style=for-the-badge)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)
![Contributions welcome](https://img.shields.io/badge/Contributions-Welcome-green?style=for-the-badge)
---

## ✨ Overview

**Fitness Guide** is a **console-based Java application** built entirely using **Object-Oriented Programming (OOP)** principles.  
It provides everything a user needs to start and maintain a fitness journey — from personalized workouts to diet plans and progress tracking.

---

## 💪 What It Offers

- 🧍 **User Input:** Personal details & preferences  
- 🏋 **Workouts:** Beginner → Advanced  
- 🥗 **Diet Plans:** Veg & Non-Veg  
- ⚖ **BMI Calculation:** Automatically calculates and categorizes BMI  
- 📈 **Progress Tracking:** Saves user data and updates progress  
- 🧠 **Personalized Guidance:** Based on body type, goal, and training split  

---

## 🧩 Features

| Feature | Description |
|----------|-------------|
| 👤 **User Input** | Name, Age, Weight, Height, Body Type, Goal, Level, Split, Veg/Non-Veg |
| 🏋️ **Workouts** | PUSH/PULL/LEGS, Upper/Lower, Full Body, Cardio |
| 🥘 **Diet Plans** | Daily meal plans for all levels & preferences |
| 📂 **Progress Tracking** | Saves user progress in `progress.txt` |
| ⚙ **OOP Concepts** | Encapsulation, Inheritance, Polymorphism, Abstraction, Enums, Composition |
| ⚖ **BMI Calculation** | Computes BMI and displays corresponding category |

---
## 🏗 Project Structure

```java
FitnessGuide/
├── 📁 core/
│   ├── BodyType.java
│   ├── Goal.java
│   ├── Level.java
│   ├── SplitType.java
│   ├── User.java
│
├── 📁 workouts/
│   ├── Workout.java
│   ├── GymWorkout.java
│   ├── HomeWorkout.java
│   ├── ExerciseGuide.java
│
├── 📁 diet/
│   ├── Diet.java
│   ├── VegDiet.java
│   ├── NonVegDiet.java
│   ├── DietData.java
│
├── 📁 schedule/
│   ├── Schedule.java
│   ├── ScheduleData.java
│
├── 📁 progress/
│   ├── ProgressTracker.java
│   ├── FileHandler.java
│
├── 📁 utils/
│   ├── Utils.java
│   ├── Motivation.java
│
├── Main.java
└── .gitignore

---

## ⚡ How It Works

1. 👤 **User Input:** The user enters personal details (name, age, height, weight, etc.).  
2. ⚖ **BMI Calculation:** The app calculates BMI and identifies the category.  
3. 🏋 **Workout & Diet Plan:** Based on inputs, a customized plan is generated.  
4. 📈 **Progress Tracking:** The app saves user progress in `progress.txt`.  
5. 🔁 **Repeat & Track:** Users can update progress and view previous records.

---

## 🧠 OOP Concepts Demonstrated

| Concept | Description |
|----------|-------------|
| 🔒 **Encapsulation** | Private fields with public getters/setters |
| 📚 **Inheritance** | `VegDiet` and `NonVegDiet` inherit from abstract `Diet` |
| 🔄 **Polymorphism** | Arrays of type `Diet` store both Veg & Non-Veg objects |
| 🏛 **Abstraction** | `Diet` serves as an abstract base class |
| 📌 **Enums** | `BodyType`, `Goal`, `Level`, `SplitType` improve code readability |
| 🧩 **Composition** | `User` has `Goal`, `Level`, `SplitType`; `ProgressTracker` has `User` |

---

## 🚀 Future Enhancements

- ✅ Dynamic tracking of completed workouts  
- 🥩 Macro & nutrition calculator  
- 💡 Daily motivational tips  
- 🏠 More home workout variations  
- 🎨 GUI-based version for enhanced interactivity  

---

## ⚙️ Installation & Setup

### 🧰 Prerequisites
- Java JDK 17 or higher
- A code editor (IntelliJ IDEA, Eclipse, VS Code, etc.)

### 🔽 Steps
1. Clone this repository:
   ```bash
   git clone https://github.com/Kirushonthu/FitnessGuide.git

## ⚙️ Compile & Run

### 🧰 Prerequisites
- **Java JDK 17** or higher  
- **Command Line Interface** (Terminal, CMD, or PowerShell)  
- Optional: **IDE** (IntelliJ IDEA, Eclipse, or VS Code)

---

### 🏃 Running from the Command Line (Basic Setup)

If all your `.java` files are in the same directory:

```bash
# Step 1: Compile
javac Main.java

# Step 2: Run
java Main


## 🧑‍💻 Contributors
Kirushonthu

##📜 License

This project is open-source under the MIT License.
---------
