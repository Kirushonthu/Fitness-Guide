public class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private BodyType bodyType;
    private Goal goal;
    private Level level;
    private boolean isVeg;
    private SplitType split;

    // Constructor
    public User(String name, int age, double weight, double height,
                BodyType bodyType, Goal goal, Level level){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bodyType = bodyType;
        this.goal = goal;
        this.level = level;
        this.isVeg = true; // default
        this.split = SplitType.FULLBODY; // default
    }

    // ------------------ Getters & Setters ------------------
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public BodyType getBodyType() { return bodyType; }
    public Goal getGoal() { return goal; }
    public Level getLevel() { return level; }
    public boolean isVeg() { return isVeg; }
    public SplitType getSplit() { return split; }

    public void setVeg(boolean veg) { isVeg = veg; }
    public void setSplit(SplitType split) { this.split = split; }
}
