package practicePrograms;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveRepeats(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0)); // Add first character

        for (int i = 1; i < input.length(); i++) {
            // Add character only if it's different from previous one
            if (input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "aaayyyzzza";
        String b = "andfsadfg";

        System.out.println(removeConsecutiveRepeats(a)); // Output: ayz
        System.out.println(removeConsecutiveRepeats(b)); // Output: andfsg
    }
}

