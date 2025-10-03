public class GymWorkout extends Workout {
    private String equipment; // Equipment needed

    public GymWorkout(String name, int duration, int caloriesBurned, String equipment){
        super(name, duration, caloriesBurned);
        this.equipment = equipment;
    }

    public String getEquipment() { return equipment; }
    public void setEquipment(String equipment) { this.equipment = equipment; }

    @Override
    public void displayWorkout() {
        System.out.println("Gym Workout: " + name);
        System.out.println("Duration: " + duration + " mins | Calories: " + caloriesBurned);
        System.out.println("Equipment: " + equipment);
        System.out.println("-------------------");
    }
}
