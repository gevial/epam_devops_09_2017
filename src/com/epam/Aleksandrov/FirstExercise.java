package com.epam.Aleksandrov;

public class FirstExercise {
    public static void main(String[] args) {
        // TODO:
        // args count
        // avg len of arg
        float avgLen;
        float totalLen = 0;
        for (int i = 0; i < args.length; i++) {
            totalLen += args[i].length();
        }
        if (args.length == 0) {
            avgLen = 0;
        } else {
            avgLen = totalLen / args.length;
        }
        System.out.println(args.length);
        System.out.println(avgLen);
    }
}
