package com.andreisecuqa.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    static Random random = new Random();

    public static int getRandomInt(int startLimit, int endLimit) {
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + startLimit;
        return randomNumber;
    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    public static String getRandomEmail(String emailDomain) {
        return UUID.randomUUID() + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain) {
        return prefix + getRandomInt(99999999) + emailDomain;
    }
}