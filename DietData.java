public class DietData {

    // ------------------ BULK ------------------
    private static VegDiet[] bulkVeg = {
        new VegDiet("Breakfast", 500, new String[]{"Oats", "Milk", "Banana"}),
        new VegDiet("Lunch", 700, new String[]{"Rice", "Paneer", "Vegetables"}),
        new VegDiet("Snack", 300, new String[]{"Peanut Butter Sandwich", "Milk"}),
        new VegDiet("Dinner", 600, new String[]{"Quinoa", "Tofu", "Salad"})
    };

    private static NonVegDiet[] bulkNonVeg = {
        new NonVegDiet("Breakfast", 550, new String[]{"Eggs", "Oats", "Milk"}),
        new NonVegDiet("Lunch", 750, new String[]{"Chicken Breast", "Rice", "Vegetables"}),
        new NonVegDiet("Snack", 350, new String[]{"Greek Yogurt", "Nuts"}),
        new NonVegDiet("Dinner", 650, new String[]{"Fish", "Sweet Potato", "Salad"})
    };

    // ------------------ CUT ------------------
    private static VegDiet[] cutVeg = {
        new VegDiet("Breakfast", 300, new String[]{"Poha", "Green Tea"}),
        new VegDiet("Lunch", 400, new String[]{"Salad", "Lentils"}),
        new VegDiet("Snack", 150, new String[]{"Fruits"}),
        new VegDiet("Dinner", 350, new String[]{"Vegetable Soup", "Salad"})
    };

    private static NonVegDiet[] cutNonVeg = {
        new NonVegDiet("Breakfast", 300, new String[]{"Egg White Omelette", "Green Tea"}),
        new NonVegDiet("Lunch", 450, new String[]{"Grilled Chicken", "Salad"}),
        new NonVegDiet("Snack", 200, new String[]{"Boiled Eggs", "Fruits"}),
        new NonVegDiet("Dinner", 400, new String[]{"Grilled Fish", "Vegetables"})
    };

    // ------------------ RECOMP ------------------
    private static VegDiet[] recompVeg = {
        new VegDiet("Breakfast", 400, new String[]{"Oats", "Soy Milk", "Berries"}),
        new VegDiet("Lunch", 600, new String[]{"Brown Rice", "Paneer", "Vegetables"}),
        new VegDiet("Snack", 250, new String[]{"Nuts", "Fruits"}),
        new VegDiet("Dinner", 500, new String[]{"Quinoa", "Tofu", "Salad"})
    };

    private static NonVegDiet[] recompNonVeg = {
        new NonVegDiet("Breakfast", 400, new String[]{"Eggs", "Whole Grain Toast", "Milk"}),
        new NonVegDiet("Lunch", 650, new String[]{"Chicken", "Brown Rice", "Vegetables"}),
        new NonVegDiet("Snack", 300, new String[]{"Greek Yogurt", "Nuts"}),
        new NonVegDiet("Dinner", 550, new String[]{"Fish", "Quinoa", "Salad"})
    };

    // ------------------ CARDIO ------------------
    private static VegDiet[] cardioVeg = {
        new VegDiet("Breakfast", 250, new String[]{"Smoothie", "Banana"}),
        new VegDiet("Lunch", 350, new String[]{"Salad", "Lentils"}),
        new VegDiet("Snack", 150, new String[]{"Fruits"}),
        new VegDiet("Dinner", 300, new String[]{"Vegetable Soup", "Salad"})
    };

    private static NonVegDiet[] cardioNonVeg = {
        new NonVegDiet("Breakfast", 250, new String[]{"Egg Whites", "Smoothie"}),
        new NonVegDiet("Lunch", 400, new String[]{"Grilled Chicken", "Salad"}),
        new NonVegDiet("Snack", 200, new String[]{"Boiled Eggs", "Fruits"}),
        new NonVegDiet("Dinner", 350, new String[]{"Grilled Fish", "Vegetables"})
    };

    // ------------------ GET DIET BY GOAL AND PREFERENCE ------------------
    public static Diet[] getDietForGoal(Goal goal, boolean isVeg){
        switch(goal){
            case BULK: return isVeg ? bulkVeg : bulkNonVeg;
            case CUT: return isVeg ? cutVeg : cutNonVeg;
            case RECOMP: return isVeg ? recompVeg : recompNonVeg;
            case CARDIO: return isVeg ? cardioVeg : cardioNonVeg;
            default: return null;
        }
    }
}
