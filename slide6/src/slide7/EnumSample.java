package slide7;

public class EnumSample {

    enum Weekday {
        MON(2), TUE(3), WED(4), THUR(5), FRI(6), SAT(7), SUN(8);
        int day;

        Weekday(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }
    };

    public static void main(String[] args) {
        for (Weekday wd : Weekday.values()) {
            System.out.println(wd);
        }
        System.out.println(Weekday.MON.compareTo(Weekday.TUE));
    }
}
