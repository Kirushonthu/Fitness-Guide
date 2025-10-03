public class Motivation {

    public static String getMotivation(Level level, Goal goal){
        String msg = "Stay consistent and push your limits!";

        switch(level){
            case BEGINNER:
                msg = "Start strong, stay consistent, track your progress daily!";
                break;
            case INTERMEDIATE:
                msg = "Focus on technique and progressive overload!";
                break;
            case ADVANCED:
                msg = "Push harder, refine your nutrition and recovery!";
                break;
        }

        switch(goal){
            case BULK:
                msg += " Eat enough protein to build muscle.";
                break;
            case CUT:
                msg += " Keep your calorie deficit in check.";
                break;
            case RECOMP:
                msg += " Balance workouts with nutrition.";
                break;
            case CARDIO:
                msg += " Stay active and improve endurance!";
                break;
        }

        return msg;
    }
}
