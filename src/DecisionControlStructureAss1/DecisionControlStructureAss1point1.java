package DecisionControlStructureAss1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DecisionControlStructureAss1point1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter year: ");
        String input = reader.readLine();
        int year = Integer.parseInt(input);

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + "is a leap year. ");

        } else {
            System.out.println(year + "is not a leap year. ");
        }
    }
}