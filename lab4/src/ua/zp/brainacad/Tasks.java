package ua.zp.brainacad;

// 1 задание
/* а) true;
   b) false;
   c) false;
   d) false.
 */

// 2 задание

public class Tasks {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("нечётное");
            } else {
                System.out.println("чётное");
            }
        }

// 3 задание

        switch ("пятница") {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                System.out.println("Это рабочий день");
                break;
            case "суббота":
            case "воскресенье":
                System.out.println("Это выходной!");
                break;
            default:
                System.out.println("Unknown value");

        }

        // 4 задание

        int n = 10;
        int sum = 1;
        for (int j = 1; j < n + 1; j++ ) {
            sum *= j;
            if (sum > 1000) {
                System.out.println("Достигнут максимально возможный результат");
                return;
            }

        }
    }
}
