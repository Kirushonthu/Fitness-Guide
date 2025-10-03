public class WorkoutData {

    // ------------------ BEGINNER ------------------
    private static GymWorkout[] beginnerPush = {
        new GymWorkout("Bench Press", 45, 300, "Barbell"),
        new GymWorkout("Shoulder Press", 30, 200, "Dumbbells")
    };
    private static GymWorkout[] beginnerPull = {
        new GymWorkout("Pull Ups", 20, 120, "Bodyweight"),
        new GymWorkout("Dumbbell Row", 25, 150, "Dumbbells")
    };
    private static GymWorkout[] beginnerLegs = {
        new GymWorkout("Squats", 40, 250, "Barbell"),
        new GymWorkout("Leg Press", 35, 220, "Machine")
    };
    private static HomeWorkout[] beginnerCardio = {
        new HomeWorkout("Jumping Jacks", 15, 100, true),
        new HomeWorkout("Burpees", 10, 120, true)
    };
    private static Workout[] beginnerFullBody = mergeArrays(beginnerPush, mergeArrays(beginnerPull, beginnerLegs));

    // ------------------ INTERMEDIATE ------------------
    private static GymWorkout[] intermediatePush = {
        new GymWorkout("Incline Bench Press", 45, 350, "Barbell"),
        new GymWorkout("Overhead Press", 35, 250, "Dumbbells")
    };
    private static GymWorkout[] intermediatePull = {
        new GymWorkout("Weighted Pull Ups", 25, 200, "Weights"),
        new GymWorkout("Bent Over Row", 30, 250, "Barbell")
    };
    private static GymWorkout[] intermediateLegs = {
        new GymWorkout("Deadlift", 50, 400, "Barbell"),
        new GymWorkout("Lunges", 30, 180, "Dumbbells")
    };
    private static HomeWorkout[] intermediateCardio = {
        new HomeWorkout("Mountain Climbers", 15, 120, true),
        new HomeWorkout("Jump Rope", 20, 150, true)
    };
    private static Workout[] intermediateFullBody = mergeArrays(intermediatePush, mergeArrays(intermediatePull, intermediateLegs));

    // ------------------ ADVANCED ------------------
    private static GymWorkout[] advancedPush = {
        new GymWorkout("Weighted Dips", 25, 220, "Weights"),
        new GymWorkout("Incline Dumbbell Press", 40, 300, "Dumbbells")
    };
    private static GymWorkout[] advancedPull = {
        new GymWorkout("Weighted Pull Ups", 25, 250, "Weights"),
        new GymWorkout("T-Bar Row", 35, 300, "Barbell")
    };
    private static GymWorkout[] advancedLegs = {
        new GymWorkout("Barbell Squat", 50, 400, "Barbell"),
        new GymWorkout("Romanian Deadlift", 40, 350, "Barbell")
    };
    private static HomeWorkout[] advancedCardio = {
        new HomeWorkout("HIIT Circuit", 20, 200, true),
        new HomeWorkout("Burpees Challenge", 15, 180, true)
    };
    private static Workout[] advancedFullBody = mergeArrays(advancedPush, mergeArrays(advancedPull, advancedLegs));

    // ------------------ PUBLIC METHOD ------------------
    public static Workout[] getWorkouts(Level level, SplitType split, int day){
        switch(level){
            case BEGINNER: return getWorkoutsBySplit(beginnerPush, beginnerPull, beginnerLegs, beginnerCardio, beginnerFullBody, split, day);
            case INTERMEDIATE: return getWorkoutsBySplit(intermediatePush, intermediatePull, intermediateLegs, intermediateCardio, intermediateFullBody, split, day);
            case ADVANCED: return getWorkoutsBySplit(advancedPush, advancedPull, advancedLegs, advancedCardio, advancedFullBody, split, day);
            default: return null;
        }
    }

    // ------------------ HELPER METHOD ------------------
    private static Workout[] getWorkoutsBySplit(Workout[] push, Workout[] pull, Workout[] legs, Workout[] cardio, Workout[] fullBody, SplitType split, int day){
        switch(split){
            case FULLBODY: return fullBody;
            case PUSHPULLLEGS:
                switch(day){
                    case 1: return push;   // Monday
                    case 2: return pull;   // Tuesday
                    case 3: return legs;   // Wednesday
                    case 4: return cardio; // Thursday
                    case 5: return push;   // Friday
                    case 6: return pull;   // Saturday
                    case 7: return null;   // Sunday rest
                    default: return null;
                }
            case UPPERLOWER:
                if(day % 2 != 0) return mergeArrays(push, pull); // Upper
                else return legs; // Lower
            case CARDIOONLY: return cardio;
            default: return null;
        }
    }

    // ------------------ ARRAY MERGE HELPER ------------------
    private static Workout[] mergeArrays(Workout[] a, Workout[] b){
        Workout[] merged = new Workout[a.length + b.length];
        int index = 0;
        for(Workout w : a) merged[index++] = w;
        for(Workout w : b) merged[index++] = w;
        return merged;
    }
}
