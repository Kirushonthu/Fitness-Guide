public class VegDiet extends Diet {
    public VegDiet(String name, int calories, String[] items){
        super(name, calories, items);
    }

    @Override
    public void displayDiet() {
        System.out.println("Vegetarian Diet:");
        super.displayDiet();
    }
}
