package testing;

public class FirstIndex {

	public static  int firstIndex(String haystack,String needle) {
		int hashL =haystack.length();
		int needL =needle.length();
		int pointer=-1;
		for(int i=0;i<hashL-needL+1;i++) {
			if(haystack.substring(i, i+needL).contains(needle) && pointer==-1) {
				pointer=i;	
			}
		}
		return pointer;
		
	}
	public static void main (String[] args) {
		System.out.println(firstIndex("sadbutsad", "sad"));

	}
}
