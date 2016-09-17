package Strings;

public class Ch1_Q2 {
	
	public static String reverse(String str){
		if(str.length()==0)
			return str;
		
		char charset[] = str.toCharArray();
		
		int start = 0;
		int end = str.length()-1;
		
		while(start<end){
			char temp = charset[start];
			charset[start] = charset[end];
			charset[end] = temp;
			start++;
			end--;
		}
		
		return new String(charset);
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("sdlskdslk"));
	}

}
