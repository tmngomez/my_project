package za.co.wethinkcode.fizzbuzz;

import java.util.*;

public class FizzBuzz {
    public static String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( (number % 3 == 0) && (number % 5 == 0) ) {
            return "FizzBuzz";
        }

        else if (number % 3 == 0){
            return "Fizz";
        }

        else if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    public static String countTo(int number) {
        StringBuffer list = new StringBuffer("[");
        String newString = "";
        int i;

        for (i = 1; i <= number -1; i++) {
            newString = newString + checkNumber(i) + ", ";
        }
        if (i == number) {
            newString = newString + checkNumber(i);
            list.append(newString);
            list.append("]");
        }
        System.out.print(list);
        return list.toString();
    }

    public static void main(String[] args) {
        countTo(7);
    }
}
