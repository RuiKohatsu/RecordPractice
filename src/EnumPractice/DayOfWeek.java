package EnumPractice;
import java.util.Calendar;

public enum DayOfWeek {
    MON("月曜日"), TUE("火曜日"), WED("水曜日"), THU("木曜日"), SAT("土曜日"), SUN("日曜日");

    private final String label;

    DayOfWeek(String label) {
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    public DayOfWeek getDayOfWeek(String day) {
        Calendar.get(Calendar.DAY_OF_WEEK);
//        String result = calendar.substring(6, 11);
        for (DayOfWeek dow : values()) {
            if (dow.label.equals(label)) {
                return dow;
            }
        }
        throw new IllegalArgumentException("Invalid DayOfWeek label: " + label);
    }
}
