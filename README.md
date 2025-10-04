🏋‍♂ Fitness Guide – OOP Java Project

✨ Project Overview

Fitness Guide is a console-based Java application built entirely with Object-Oriented Programming (OOP) concepts.

It provides everything a user needs to start fitness training:

💪 Workouts: Beginner → Advanced

🥗 Diet plans: Veg & Non-Veg

⚖ BMI calculation and category

📈 Progress tracking

🧠 Personalized guidance based on body type, fitness goal, and split

“A single source for all your fitness needs.”

🎯 Features
Feature	Description
👤 User Input	Name, Age, Weight, Height, Body Type, Goal, Level, Split, Veg/Non-Veg
🏋‍♂ Workouts	PUSH/PULL/LEGS, Upper/Lower, Full Body, Cardio
🥘 Diet Plans	Daily meals for all levels & preferences
📂 Progress Tracking	Saves user progress to progress.txt
⚙ OOP Concepts	Encapsulation, Inheritance, Polymorphism, Abstraction, Enums, Composition
⚖ BMI	Automatic calculation & category
🏗 Project Structure
FitnessGuide/
├── BodyType.java
├── Goal.java
├── Level.java
├── SplitType.java
├── User.java
├── Workout.java
├── GymWorkout.java
├── HomeWorkout.java
├── Diet.java
├── VegDiet.java
├── NonVegDiet.java
├── DietData.java
├── Schedule.java
├── ScheduleData.java
├── ExerciseGuide.java
├── ProgressTracker.java
├── Utils.java
├── FileHandler.java
├── motivation.java
├── Main.java
└── .gitignore

⚡ How It Works

👤 User inputs personal details and fitness preferences

⚖ Program calculates BMI and shows category

🏋 Program displays custom workout & diet plans

📈 User progress is tracked and saved

🧩 OOP Concepts Demonstrated

🔒 Encapsulation: Private fields with getters/setters

📚 Inheritance: VegDiet & NonVegDiet inherit from Diet

🔄 Polymorphism: Diet array stores both VegDiet and NonVegDiet

🏛 Abstraction: Diet is abstract class

📌 Enums: BodyType, Goal, Level, SplitType

🧩 Composition: User has Goal, Level, SplitType; ProgressTracker has User

🚀 Future Enhancements

✅ Track completed workouts dynamically

🥩 Macro/Nutrition calculator

💡 Daily motivational tips

🏠 More home workout variations

🎨 GUI version for better interactivity

📜 License

This project is open-source (MIT License).
