package ru.vbugaenko.stackoverflow;

import java.util.Scanner;

/**
 * Проверка на вводимый тип: если ввести число, то сообщение "необходим именно String".
 * https://ru.stackoverflow.com/questions/954129/
 *
 * @since 08.03.2019
 */

class CheckStringTypeFromScanner {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.print("Available commands:\n 1. Read\n 2. Write\n\n");

        String getCommand;
        Scanner sc = new Scanner(System.in);

        //RegEx
        //while (sc.hasNext("-?\\d+(\\.\\d+)?"))

        while ( sc.hasNextLong() || sc.hasNextDouble() )
        {
            System.out.println("Please, enter only string:");
            sc.next();
        }
        getCommand = sc.nextLine();
        System.out.println(getCommand);

    }
}