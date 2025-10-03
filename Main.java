import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Fitness Guide ===");

        // -------------------- User Info --------------------
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your Height (cm): ");
        double height = sc.nextDouble();
        sc.nextLine(); // consume newline

        // -------------------- Body Type --------------------
        BodyType bodyType = null;
        while(bodyType == null){
            System.out.println("Choose Body Type: LEAN, FAT, SKINNY");
            try { bodyType = BodyType.valueOf(sc.nextLine().toUpperCase()); }
            catch(Exception e){ System.out.println("Invalid input."); }
        }

        // -------------------- Goal --------------------
        Goal goal = null;
        while(goal == null){
            System.out.println("Choose Goal: BULK, CUT, RECOMP, CARDIO");
            try { goal = Goal.valueOf(sc.nextLine().toUpperCase()); }
            catch(Exception e){ System.out.println("Invalid input."); }
        }

        // -------------------- Level --------------------
        Level level = null;
        while(level == null){
            System.out.println("Choose Level: BEGINNER, INTERMEDIATE, ADVANCED");
            try { level = Level.valueOf(sc.nextLine().toUpperCase()); }
            catch(Exception e){ System.out.println("Invalid input."); }
        }

        // -------------------- Split --------------------
        SplitType split = null;
        while(split == null){
            System.out.println("Choose Split: FULLBODY, UPPERLOWER, PUSHPULLLEGS, CARDIOONLY");
            try { split = SplitType.valueOf(sc.nextLine().toUpperCase()); }
            catch(Exception e){ System.out.println("Invalid input."); }
        }

        // -------------------- Veg Preference --------------------
        Boolean isVeg = null;
        while(isVeg == null){
            System.out.println("Are you Veg? (true/false)");
            String input = sc.nextLine().toLowerCase();
            if(input.equals("true")) isVeg = true;
            else if(input.equals("false")) isVeg = false;
            else System.out.println("Invalid input.");
        }

        // -------------------- Create User --------------------
        User user = new User(name, age, weight, height, bodyType, goal, level);
        user.setSplit(split);
        user.setVeg(isVeg);

        // -------------------- Display BMI --------------------
        double bmi = Utils.calculateBMI(user.getWeight(), user.getHeight());
        System.out.println("\nYour BMI: " + Utils.formatDouble(bmi, 2) + " (" + Utils.getBMICategory(bmi) + ")");

        // -------------------- Exercise Guide --------------------
        ExerciseGuide.showFullExerciseGuide(user);

        // -------------------- Progress Tracker --------------------
        ProgressTracker tracker = new ProgressTracker(user);
        tracker.displayProgress();

        // -------------------- Save Progress --------------------
        String progress = "User: " + user.getName() + " | Weight: " + user.getWeight() + "kg | Goal: " + user.getGoal();
        FileHandler.appendLine("progress.txt", progress);
        System.out.println("\nProgress saved to progress.txt");

        sc.close();
    }
}
