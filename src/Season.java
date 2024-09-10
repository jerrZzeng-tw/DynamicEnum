public enum Season {
    SPRING("spring", "BEAR"), SUMMER("summer", "HOT"), AUTUMN(
            "autumn", "WITHERED");
;
    private final String key;
    // 季節特徵
    private final String sp;
    private Season(String key, String sp) {
        this.key = key;
        this.sp = sp;
    }
    public String getKey() {
        return this.key;
    }
    public String getSeasonPattern() {
        return sp;
    }
}