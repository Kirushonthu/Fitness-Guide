public class ScheduleData {

    private User user;

    // Constructor
    public ScheduleData(User user){
        this.user = user;
    }

    // Get full weekly plan
    public DayPlan[] getWeeklyPlan(){
        DayPlan[] week = new DayPlan[7]; // 7 days
        for(int day = 1; day <= 7; day++){
            // Get workouts based on user split & level
            Workout[] workouts = WorkoutData.getWorkouts(user.getLevel(), user.getSplit(), day);
            // Get diet based on goal & preference
            Diet[] diet = DietData.getDietForGoal(user.getGoal(), user.isVeg());
            // Create DayPlan object
            week[day - 1] = new DayPlan(getDayName(day), workouts, diet);
        }
        return week;
    }

    // Helper method to get day name
    private String getDayName(int day){
        switch(day){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Unknown";
        }
    }

    // ------------------ Inner Class ------------------
    public static class DayPlan {
        private String dayName;
        private Workout[] workouts;
        private Diet[] diet;

        public DayPlan(String dayName, Workout[] workouts, Diet[] diet){
            this.dayName = dayName;
            this.workouts = workouts;
            this.diet = diet;
        }

        public void displayPlan(){
            System.out.println("\n=== " + dayName + " ===");

            // Display Workouts
            if(workouts != null && workouts.length > 0){
                System.out.println("Workouts:");
                for(Workout w : workouts){
                    if(w != null) w.displayWorkout();
                }
            } else {
                System.out.println("Rest Day / No Workouts");
            }

            // Display Diet
            if(diet != null && diet.length > 0){
                System.out.println("Diet Plan:");
                for(Diet d : diet){
                    if(d != null) d.displayDiet();
                }
            }
        }
    }
}
