public class NonVegDiet extends Diet {
    public NonVegDiet(String name, int calories, String[] items){
        super(name, calories, items);
    }

    @Override
    public void displayDiet() {
        System.out.println("Non-Vegetarian Diet:");
        super.displayDiet();
    }
}
