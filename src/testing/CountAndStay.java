package testing;

public class CountAndStay {
	
	public static String countAndStay(String value) {
		StringBuilder result= new StringBuilder();
		char[] arr = value.toCharArray();
		int i=0;
		int j=0;
		int count=0;
		while(i<value.length() ) {
			if(j<value.length() && arr[i]==arr[j] ){
				count++;
				j++;
			}
			else {
				result.append(count+""+arr[i]);
				i=j;
				count=0;
			}
		}
		return new String(result);
		
	}
	
	public static String countAndLoop(int n) {
		String[] arr= new String[30];
		for(int i=0;i<n;i++) {
			if(i==0) {
				arr[i]="1";
			}else {
				arr[i]=countAndStay(arr[i-1]);
			}
		}
		return arr[n-1];
	}
	
	public static void main(String[] args) {
		System.out.println(countAndLoop(4));
	}

}
