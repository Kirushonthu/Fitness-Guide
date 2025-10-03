public enum Goal {
    BULK("Focus on gaining muscle mass with high protein and calories"),
    CUT("Focus on fat loss with calorie deficit and cardio"),
    RECOMP("Build muscle while losing fat, maintain balanced diet"),
    CARDIO("Improve endurance and cardiovascular health");

    private String suggestion;

    Goal(String suggestion){
        this.suggestion = suggestion;
    }

    public String getSuggestion(){
        return suggestion;
    }
}
