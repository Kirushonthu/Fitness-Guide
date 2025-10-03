public class Utils {

    // -------------------- Unit Conversions --------------------
    public static double cmToMeter(double cm){
        return cm / 100.0;
    }

    public static double kgToLbs(double kg){
        return kg * 2.20462;
    }

    public static double lbsToKg(double lbs){
        return lbs / 2.20462;
    }

    // -------------------- BMI Calculation --------------------
    public static double calculateBMI(double weightKg, double heightCm){
        double heightM = cmToMeter(heightCm);
        return weightKg / (heightM * heightM);
    }

    public static String getBMICategory(double bmi){
        if(bmi < 18.5) return "Underweight";
        else if(bmi < 24.9) return "Normal weight";
        else if(bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    // -------------------- Simple Validators --------------------
    public static boolean isPositive(double number){
        return number > 0;
    }

    public static boolean isNonEmptyString(String text){
        return text != null && !text.trim().isEmpty();
    }

    // -------------------- Formatting Helpers --------------------
    public static String capitalize(String text){
        if(text == null || text.isEmpty()) return text;
        return text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
    }

    public static String formatDouble(double value, int decimals){
        return String.format("%." + decimals + "f", value);
    }
}
