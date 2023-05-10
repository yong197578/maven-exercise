import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userInput = input.nextLine();
        System.out.println("You Entered: \"" + userInput + "\"");

        if(!StringUtils.isNumeric(userInput)){
            System.out.println("\"" + userInput + "\" is not a number" );
        }else {
            System.out.println("\"" + userInput + "\" is number");
        }

        String output = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + output);

        String reverse = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverse);

        String[] splitJoin = StringUtils.split(userInput);
            ArrayUtils.reverse(splitJoin);
            String newSentence = StringUtils.join(splitJoin," ");

        System.out.println("Backward: " + newSentence);
        String[] words = userInput.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (i % 2 == 0) {
                word = StringUtils.capitalize(words[i]);

            }
            System.out.println(word);

        }


    }
}
