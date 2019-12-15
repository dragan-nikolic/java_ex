package gd.belgrade.school;

import java.util.Scanner;

public class LuckyNumber {
    /**
     * 1. Ticket number is an input of the method
     * 2. Valid ticket number (or ticket id) has length of 6 (always)
     * 3. Each element of a valid ticket number is a digit (e.g. 123456 or 404404)
     * 4. The method shall return true if sum of the first three digits is equal
     *      to sum of the last three digits, and false if that's not the case.
     * 
     * Examples:
     *  a. 123456 -> false | 1+2+3 != 4+5+6
     *  b. 123321 -> true  | 1+2+3 == 3+2+1 
     */
    public static boolean isMyTicketLucky(String ticketNumber) {
        return false;
    }

    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print("Please enter: ");

        String s1 = in.nextLine();

        System.out.println("Entered: " + s1);

        in.close();
    }
}
