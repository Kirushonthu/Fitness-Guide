public class ExerciseGuide {

    // -------------------- Display Weekly Workouts --------------------
    public static void displayWeeklyWorkout(User user){
        System.out.println("\n=== Weekly Workout Plan for " + user.getName() + " ===");

        // Get weekly plan from ScheduleData
        ScheduleData scheduleData = new ScheduleData(user);
        ScheduleData.DayPlan[] weekPlan = scheduleData.getWeeklyPlan();

        for(ScheduleData.DayPlan day : weekPlan){
            day.displayPlan();
        }
    }

    // -------------------- Display Exercise Tips --------------------
    public static void displayExerciseTips(){
        System.out.println("\n=== Exercise Tips ===");
        System.out.println("1. Always start with a 5-10 min warm-up.");
        System.out.println("2. Maintain proper form to avoid injuries.");
        System.out.println("3. Focus on progressive overload for muscle gain.");
        System.out.println("4. Rest at least 1-2 min between sets (adjust based on goal).");
        System.out.println("5. Include stretching or mobility exercises daily.");
    }

    // -------------------- Display Split Guide --------------------
    public static void displaySplitGuide(){
        System.out.println("\n=== Workout Splits Guide ===");
        System.out.println("FULL_BODY: Train all muscle groups every session (3x/week recommended).");
        System.out.println("UPPER_LOWER: Upper body and lower body split (4x/week).");
        System.out.println("PUSH_PULL_LEGS: Push, pull, and leg-focused workouts (6x/week).");
        System.out.println("CARDIO_ONLY: Focus on cardio and endurance training.");
    }

    // -------------------- Display Motivation --------------------
    public static void displayMotivation(User user){
        String msg = Motivation.getMotivation(user.getLevel(), user.getGoal());
        System.out.println("\n=== Motivation ===");
        System.out.println(msg);
    }

    // -------------------- Central Method to Display Full Guide --------------------
    public static void showFullExerciseGuide(User user){
        displayExerciseTips();
        displaySplitGuide();
        displayWeeklyWorkout(user);
        displayMotivation(user);
    }
}
