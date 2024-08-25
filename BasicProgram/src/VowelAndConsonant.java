
public class VowelAndConsonant {
	public static void main(String args[])
	{ 
		String str="sanket";
		int vowel=0;
		int consonant=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
				{
					vowel++;
				}else
				{
					consonant++;
				}
			}
			
			
		}
		System.out.println("vowel:"+vowel);
		System.out.println("consonat:"+consonant);
	}

}
