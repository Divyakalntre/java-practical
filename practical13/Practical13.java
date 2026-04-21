public class Practical13 {

    public static void main(String[] args) {

        // Check minimum arguments
        if (args.length < 2) {
            System.out.println("Error: Please provide exactly 2 arguments.");
            return;
        }

        // Inform user about extra arguments
        if (args.length > 2) {
            System.out.println("Warning: Extra arguments detected. Ignoring extras...");
        }

        String charInput = args[0];
        String str = args[1];

        // Validate first argument (must be single character)
        if (charInput.length() != 1) {
            System.out.println("Error: First argument must be a single character.");
            return;
        }

        char ch = charInput.charAt(0);

        // Approach 1: Using loop
        System.out.println("Approach 1 (Loop):");
        repeatUsingLoop(ch, str);

        // Approach 2: Using String.replace()
        System.out.println("Approach 2 (replace method):");
        repeatUsingReplace(ch, str);

        // Approach 3: Using recursion
        System.out.println("Approach 3 (Recursion):");
        repeatUsingRecursion(str, ch, 0);
    }

    // Approach 1: Loop
    static void repeatUsingLoop(char ch, String str) {
        for (char c : str.toCharArray()) {
            if (c == ch) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    // Approach 2: replace()
    static void repeatUsingReplace(char ch, String str) {
        String result = str.replaceAll("[^" + ch + "]", "");
        System.out.println(result);
    }

    // Approach 3: Recursion
    static void repeatUsingRecursion(String str, char ch, int index) {
        if (index >= str.length()) return;

        if (str.charAt(index) == ch) {
            System.out.print(ch + " ");
        }

        repeatUsingRecursion(str, ch, index + 1);
    }
}