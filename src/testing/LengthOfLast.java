package testing;

public class LengthOfLast {

	public static String lastWord(String s) {
		String[] arr =s.strip().split("[' ']+");
		return arr[arr.length-1];
	}
	public static void main(String[] args) {
		System.out.println(lastWord("   fly me   to   the moon  "));
		System.out.println(lastWord("Hello World"));
		System.out.println(lastWord("luffy is still joyboy"));
		
	}
}
