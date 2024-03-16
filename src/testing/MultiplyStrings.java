package testing;

import java.util.Arrays;

public class MultiplyStrings {
	
	public static String multiplyStrings(String num1,String num2) {
		char[] arr1 = num1.toCharArray();
		char[] arr2 = num2.toCharArray();
		int m = arr1.length;
		int n = arr2.length;
		int[] arr = new int[m+n];
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				int result = (arr1[i]-'0')*(arr2[j]-'0');
				int carry =result+arr[i+j+1];
				arr[i+j+1]+=carry%10;
				arr[i+j]+=carry/10;
			}
		}
		for(int a : arr) {
			if(a>0 ||stringBuilder.length()>0) {
				stringBuilder.append(a);
			}
		}
		return new String(stringBuilder);
	}
	

	public static void main(String[] args) {
		System.out.println(multiplyStrings("12", "31"));
	}
}
