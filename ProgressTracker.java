public class ProgressTracker {

    private User user;

    public ProgressTracker(User user){
        this.user = user;
    }

    // Display simple progress info
    public void displayProgress(){
        System.out.println("User: " + user.getName());
        System.out.println("Current Weight: " + user.getWeight() + " kg");
        System.out.println("Body Type: " + user.getBodyType());
        System.out.println("Goal: " + user.getGoal());
        System.out.println("Level: " + user.getLevel());
        System.out.println("Split: " + user.getSplit());
        System.out.println("Veg: " + (user.isVeg() ? "Yes" : "No"));
        System.out.println("Progress: Track your workouts and diet daily for best results!");
    }
}
