import java.util.Scanner;

public class CharacterConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Call the method to convert the string
        String result = replaceVowelsWithUnderscores(input);

        // Print the result
        System.out.println("Output: " + result);
    }

    public static String replaceVowelsWithUnderscores(String input) {
        StringBuilder output = new StringBuilder();
        String vowels = "AEIOUaeiou";  // Set of vowels

        // Iterate through the characters of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int position = i + 1;  // Position is 1-based

            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                // Number of underscores to replace, maximum is 5
                int underscoreCount = Math.min(position, 5);
                // Append the underscores
                for (int j = 0; j < underscoreCount; j++) {
                    output.append('_');
                }
            } else {
                // Append the character if it's not a vowel
                output.append(ch);
            }
        }

        return output.toString();
    }
}
