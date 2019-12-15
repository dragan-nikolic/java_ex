package gd.belgrade.school;

import java.util.Scanner;

public class LuckyNumber {
    final static int LN_LENGTH = 6;

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
    public static boolean isMyTicketLucky(String ticketNumber) throws Exception {
        if (ticketNumber.length() != LN_LENGTH) {
            throw new Exception("Invalid ticket " + ticketNumber + "! Length must be " + LN_LENGTH);
        }

        for (char c: ticketNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new Exception("Invalid ticket " + ticketNumber + "! Ticket number must have digits only.");
            }
        }

        int fh = 0;
        int sh = 0;
        for (int i=0; i<LN_LENGTH/2; i++) {
            fh += Character.getNumericValue(ticketNumber.charAt(i));
            sh += Character.getNumericValue(ticketNumber.charAt(i+LN_LENGTH/2));
        }

        return (fh == sh);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ticketNumber = "";

        do {
            System.out.print("Please enter: ");
            ticketNumber = in.nextLine();

            try {
                boolean result = isMyTicketLucky(ticketNumber);
                System.out.println("Ticket " + ticketNumber + " is " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while(!ticketNumber.isEmpty());

        System.out.println("Goodbye!");
        in.close();
    }
}
