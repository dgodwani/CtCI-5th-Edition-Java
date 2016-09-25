package Strings;

public class Ch1_Q8 {
	
	public static boolean isRotation(String s1,String s2){
		if(s1.length()!=s2.length() && s1.length()==0)
			return false;
		String str = s1+s1;
		return str.contains(s2);
	}
	
	public static void main(String[] args) {
		System.out.println(isRotation("waterbottle", "bottlewater"));
	}

}
