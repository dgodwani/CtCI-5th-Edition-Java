package Strings;

public class Ch1_Q5 {
	
	public static String compress(String str){
		if(str==null || str.isEmpty()) 
			return str;
		
		int size = getCompressedLength(str);
		
		if(size>=str.length())
			return str;
		
		int count = 1;
		int index = 0;
		char last = str.charAt(0);
		char charset[] = new char[size];
		
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i)==last)
				count++;
			else{
				index = updateCmprString(charset,index,last,count);
				count = 1;
				last = str.charAt(i);
			}
		}
		updateCmprString(charset, index, last, count);
		return new String(charset);
	}

	private static int updateCmprString(char[] charset, int index, char ch, int count) {
		char strCount[] = String.valueOf(count).toCharArray();
		charset[index] = ch;
		for(char c:strCount){
			charset[++index]=c;
		}
		return index+1;
	}

	private static int getCompressedLength(String str) {
		int size = 0;
		int count = 1;
		char last = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if(last==str.charAt(i))
				count++;
			else{
				size += String.valueOf(count).length()+1;
				last = str.charAt(i);
				count = 1;
			}
		}
		size += String.valueOf(count).length()+1;
		return size;
	}
	
	public static void main(String[] args) {
		System.out.println(compress("aabcccccaaa"));
	}

}
