import java.time.LocalTime;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    private static final Function<String, LocalTime> toLocalTime = LocalTime::parse;

    private static int secondsDiff(LocalTime before, LocalTime after) {
        return after.toSecondOfDay() - before.toSecondOfDay();
    }

    private static int timeDiff(LocalTime time1, LocalTime time2) {
        return time1.isAfter(time2)
                ? secondsDiff(time2, time1)
                : secondsDiff(time1, time2);
    }

    public static void main(String[] args) {
        var input = new MainIn();

        var result = timeDiff(
                toLocalTime.apply(input.getTime1()),
                toLocalTime.apply(input.getTime2())
        );

        System.out.println(result);
    }
}

class MainIn {
    public static Scanner scanner = new Scanner(System.in);
    private String time1;
    private String time2;

    public MainIn() {
        read();
    }

    public String getTime1() {
        return time1;
    }

    public String getTime2() {
        return time2;
    }

    private void read() {
        time1 = scanner.nextLine();
        time2 = scanner.nextLine();
    }
}