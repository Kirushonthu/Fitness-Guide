public class HomeWorkout extends Workout {
    private boolean requiresSpace; // True if needs open space

    public HomeWorkout(String name, int duration, int caloriesBurned, boolean requiresSpace){
        super(name, duration, caloriesBurned);
        this.requiresSpace = requiresSpace;
    }

    public boolean isRequiresSpace() { return requiresSpace; }
    public void setRequiresSpace(boolean requiresSpace) { this.requiresSpace = requiresSpace; }

    @Override
    public void displayWorkout() {
        System.out.println("Home Workout: " + name);
        System.out.println("Duration: " + duration + " mins | Calories: " + caloriesBurned);
        System.out.println("Requires Open Space: " + (requiresSpace ? "Yes" : "No"));
        System.out.println("-------------------");
    }
}
