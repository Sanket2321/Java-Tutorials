public class VowelExtractor {

    public static void main(String[] args) {
        String input = "my name is sanket";
        String vowel = extractVowel(input);
        System.out.println("vowel: " + vowel);
    }

    public static String extractVowel(String str) {
        StringBuilder v = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                v.append(ch);
            }
        }
        return v.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
