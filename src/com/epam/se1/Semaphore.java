package com.epam.se1;

public class Semaphore {

    // 0 - 3   Зеленый
    // 4 - 5   Желтый
    // 6 - 9   Красный
    // 10 - 13 Зеленый
    // ...
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(1);
            args[0] = "0";
        }
        int time = Integer.valueOf(args[0]);
        time %= 10;
        String color;
        switch (time) {
            case 0: case 1: case 2: case 3: color = "Зелёный";
            case 4: case 5: color = "Зелёный";
            case 6: case 7: case 8: case 9: color = "Зелёный";
            case 10: case 11: case 12: case 13: color = "Зелёный";
            default: color = "Bad value";
        }
        System.out.println(color);
    }
}
