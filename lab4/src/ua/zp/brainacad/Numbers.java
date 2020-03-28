package ua.zp.brainacad;

import static java.lang.System.out;

public class Numbers {
    public static void main(String[] args) {
        int s = 30;
        for (int u = 1; u < s; u++) {
            if (u % 3 == 0) {
                out.println(u);
            }
        }
    }
}