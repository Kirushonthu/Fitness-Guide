public enum SplitType {
    FULLBODY("Train all major muscle groups in one session, 3x/week"),
    UPPERLOWER("Alternate upper body and lower body workouts, 4x/week"),
    PUSHPULLLEGS("Push muscles, pull muscles, legs, 6x/week"),
    CARDIOONLY("Focus on cardio workouts, ideal for fat loss or endurance");

    // Field to store description
    private String description;

    // Constructor
    SplitType(String description){
        this.description = description;
    }

    // Getter for description
    public String getDescription(){
        return description;
    }
}
