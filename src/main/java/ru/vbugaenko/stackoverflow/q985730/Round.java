package ru.vbugaenko.lottery;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Округление числа до знака.
 * https://ru.stackoverflow.com/questions/985730/
 *
 * @since 26.05.2019
 */

public class Round {

    public static void main(String[] args) {

        double num = 43.300008;
        double newDouble = new BigDecimal(num).setScale(1, RoundingMode.DOWN).doubleValue();
        System.out.println("New double: " + newDouble);

    }
}
