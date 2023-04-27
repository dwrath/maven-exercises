import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String userInput = scanner.nextLine();
        System.out.println("You Entered: \"" + userInput + "\"");

        if (StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is a number");
        } else {
            System.out.println("\"" + userInput + "\" is not a number");
        }

        String flippedCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + flippedCase);

        String reversed = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reversed);
    }
}
