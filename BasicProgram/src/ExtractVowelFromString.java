
public class ExtractVowelFromString {
 public static void main(String args[])
 {
	 String input="sanket";
	 String Vowel=extractVowel(input);
	 System.out.println("Vowel is:"+Vowel);
 }
 public static String extractVowel(String str)
 {
	 return str.replaceAll("[^aeiou]", "");
 }
}
