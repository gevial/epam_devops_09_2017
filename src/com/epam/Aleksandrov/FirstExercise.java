package com.epam.Aleksandrov;

public class FirstExercise {
    public static void main(String[] args) {
        // TODO:
        // args count
        // avg len of arg
        float avgLen;
        if (args.length == 0) {
            avgLen = 0;
        } else {
            float totalLen = 0;
            for (String arg: args) {
                totalLen += arg.length();
            }
            avgLen = totalLen / args.length;
        }
        System.out.println(args.length);
        System.out.println(avgLen);
    }
}
