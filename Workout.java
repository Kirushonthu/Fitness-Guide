public abstract class Workout {
    protected String name;       // Name of exercise
    protected int duration;      // Duration in minutes
    protected int caloriesBurned;

    // Constructor
    public Workout(String name, int duration, int caloriesBurned){
        this.name = name;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    // Abstract method to display workout details
    public abstract void displayWorkout();

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(int caloriesBurned) { this.caloriesBurned = caloriesBurned; }
}
