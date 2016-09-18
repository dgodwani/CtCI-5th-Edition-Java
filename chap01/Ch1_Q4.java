package Strings;

public class Ch1_Q4 {
	
	public static String replaceSpaces(char[] charset,int length){	
		
		int index = charset.length;		
		for(int i=length-1;i>=0;i--){
			if(charset[i]==' '){
				charset[--index]='0';
				charset[--index]='2';
				charset[--index]='%';
			}
			else{
				charset[--index]=charset[i];
			}
		}
		return new String(charset);
	}
	
	public static void main(String[] args) {
		char charInput[] = {'a','p','p','l','e',' ','i','s',' ','a',' ','f','r','u','i','t',' ',' ',' ',' ',' ',' '};
		System.out.println(replaceSpaces(charInput,16));
	}

}

