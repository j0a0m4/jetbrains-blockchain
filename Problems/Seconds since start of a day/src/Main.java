import java.time.LocalTime;
import java.util.Optional;
import java.util.Scanner;

class MainIn {
    public static Scanner scanner = new Scanner(System.in);
    int number;

    public MainIn() {
        readNumber();
    }

    private void readNumber() {
        this.number = scanner.nextInt();
    }

    public Optional<Integer> getNumber() {
        return number <= 0
                ? Optional.empty()
                : Optional.of(number);
    }
}


class Main {

    private static String getSeconds(int number) {
        return LocalTime
                .of(0, 0, 0)
                .plusSeconds(number)
                .toString();
    }

    public static void main(String[] args) {
        var number = new MainIn()
                .getNumber();

        if (number.isPresent()) {
            var result = getSeconds(number.get());
            System.out.println(result);
        }
    }
}