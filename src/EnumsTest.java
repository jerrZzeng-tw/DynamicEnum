public class EnumsTest {


    public static void main(String[] args) {
        System.out.println("原始資料：");
        for (Season season : Season.values()) {
            System.out.println(season.name()+","+season.getKey()+","+season.getSeasonPattern()+","+season.ordinal());
        }
        System.out.println("-----------------------------");
        DynamicEnumUtils.addEnum(Season.class, "WINTER", new Class[] {
                String.class, String.class }, new Object[] {
                "winter", "SNOW" });
        DynamicEnumUtils.addEnum(Season.class, "SUMMER", new Class[] {
                String.class, String.class }, new Object[] {
                "summer", "SO_HOT" });
        System.out.println("新增後的資料：");
        for (Season season : Season.values()) {
            System.out.println(season.name()+","+season.getKey()+","+season.getSeasonPattern()+","+season.ordinal());
        }
        System.out.println("-----------------------------");
        Season season = Season.valueOf("SUMMER");
        System.out.println("新增的列舉類型可以正常使用：");
        System.out.println(season.name());
        System.out.println(season.getKey());
        System.out.println(season.getSeasonPattern());
    }
}