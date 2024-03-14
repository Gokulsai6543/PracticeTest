package testing;
import java.util.regex.Pattern;

public class TestingMethod {
	
	public static boolean test(char c) {
	  return Pattern.matches("[a-zA-Z0-9]", String.valueOf(c));
	}
	
	
	public static String reverseSting(String s)
	{
		char[] arr=s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			if(test(arr[i]) && test(arr[j])) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}if(!test(arr[i])) {
				i++;
			}if(!test(arr[j])) {
				j--;
			}
		}
		return new String(arr);
	}
	public static void main (String[] args) {
		System.out.println(reverseSting("H$llo"));
	}
}
