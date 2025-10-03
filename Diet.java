public class Diet {
    protected String name;        // Meal name
    protected int calories;       // Calories in meal
    protected String[] items;     // List of food items

    // Constructor
    public Diet(String name, int calories, String[] items){
        this.name = name;
        this.calories = calories;
        this.items = items;
    }

    // Display diet
    public void displayDiet() {
        System.out.println("Meal: " + name);
        System.out.println("Calories: " + calories);
        System.out.print("Items: ");
        for(String item : items){
            System.out.print(item + ", ");
        }
        System.out.println("\n-------------------");
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }

    public String[] getItems() { return items; }
    public void setItems(String[] items) { this.items = items; }
}
