package testing;

import java.util.regex.Pattern;

public class Testing3 {

	
	public static void main (String[] args) {
		String s = "-42 is the number";
		String[] list = s.strip().split(" ");
		for(String s1:list) {
			if(Pattern.matches("-?[1-9][0-9]*",s1)) {
			  System.out.println(s1);
			  break;
			}
		}
	}
}
