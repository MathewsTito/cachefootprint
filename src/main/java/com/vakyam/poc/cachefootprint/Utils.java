package com.vakyam.poc.cachefootprint;

import java.util.Random;

public class Utils {

    private static String mychars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXWZ '";
    private static String mynums = "0123456789";


    public static String generateRandomNumber(int length){
        int max = mynums.length();
        char[] mycharsArray = mynums.toCharArray();
        int min = 1;
        Random r = new Random();

        StringBuffer sb = new StringBuffer();

        for (int i=0;i<length;i++){

            int rInt = r.nextInt((max - min) + 1) + min;
            sb.append(mycharsArray[rInt-1]);
        }

        return sb.toString();

    }
}
