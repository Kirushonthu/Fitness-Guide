public enum Level {
    BEGINNER("Start with basic exercises and light intensity"),
    INTERMEDIATE("Increase intensity, moderate weights, and volume"),
    ADVANCED("High-intensity workouts, advanced techniques, progressive overload");

    private String suggestion;

    Level(String suggestion){
        this.suggestion = suggestion;
    }

    public String getSuggestion(){
        return suggestion;
    }
}
