package Strings;

public class Ch1_Q1 {
	
	public static boolean isAllUniqueChars(String str){
		if(str.length()>256)
			return false;
		boolean charset[] = new boolean[256];
		
		for(int i=0 ; i<str.length();i++){
			if(charset[str.charAt(i)])
				return false;
			else
				charset[str.charAt(i)] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "apple";
		String s2 = "character";
		String s3 = "abcdefghiklmnpqrs";
		System.out.println(isAllUniqueChars(s1));
		System.out.println(isAllUniqueChars(s2));
		System.out.println(isAllUniqueChars(s3));
		
	}

}
