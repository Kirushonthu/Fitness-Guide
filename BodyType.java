public enum BodyType {
    LEAN("Focus on building muscle and strength"),
    FAT("Focus on fat loss and controlled diet"),
    SKINNY("Focus on gaining muscle mass with proper nutrition");

    // Field to store suggestion
    private String suggestion;

    // Constructor
    BodyType(String suggestion){
        this.suggestion = suggestion;
    }

    // Getter method
    public String getSuggestion(){
        return suggestion;
    }
}
