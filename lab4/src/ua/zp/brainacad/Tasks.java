package ua.zp.brainacad;

// 1 задание
/* а) true;
   b) false;
   c) false;
   d) false.
 */

// 2 задание

import static java.lang.System.*;

public class Tasks {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                out.println("нечётное");
            } else {
                out.println("чётное");
            }
        }

// 3 задание

        switch ("суббота") {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                out.println("Это рабочий день");
                break;
            case "суббота":
            case "воскресенье":
                out.println("Это выходной!");
                break;
            default:
                out.println("Unknown value");

        }

// 4 задание

        int n = 7;
        int result = 1;
        for (int j = 1; j < n + 1; j++) {
            result *= j;
            if (result > 1000) {
                out.println("Достигнут максимально возможный результат");
                continue;
            }
            out.println(result);
        }
// 5 задание

        for (int u = 1; u < 30; u++) {
            if (u%3 == 0) {
                out.println(u);
            }
        }
    }
}
