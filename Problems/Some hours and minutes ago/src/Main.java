import java.time.LocalTime;
import java.util.Scanner;
import java.util.function.Function;

class Main {
    private static final Function<String, LocalTime> toLocalTime = LocalTime::parse;

    private static LocalTime timeDiff(LocalTime pointAfter, int hour, int minute) {
        return pointAfter
                .minusHours(hour)
                .minusMinutes(minute);
    }

    public static void main(String[] args) {
        var input = new MainIn();

        var result = timeDiff(
                toLocalTime.apply(input.getPointAfter()),
                input.getHour(),
                input.getMin());

        System.out.println(result);
    }
}

class MainIn {
    public static Scanner scanner = new Scanner(System.in);
    private String pointAfter;
    private int hour;
    private int min;

    public MainIn() {
        read();
    }

    public String getPointAfter() {
        return pointAfter;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    private void read() {
        pointAfter = scanner.nextLine();
        hour = scanner.nextInt();
        min = scanner.nextInt();
    }
}