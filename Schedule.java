public class Schedule {

    private ScheduleData scheduleData;

    // Constructor
    public Schedule(User user){
        // Initialize ScheduleData with user
        this.scheduleData = new ScheduleData(user);
    }

    // Display full weekly plan
    public void displayWeeklyPlan(){
        ScheduleData.DayPlan[] weekPlan = scheduleData.getWeeklyPlan();
        System.out.println("\n=== Weekly Fitness Plan ===");

        for(ScheduleData.DayPlan day : weekPlan){
            day.displayPlan();
        }
    }
}
