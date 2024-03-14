package testing;

import java.util.ArrayList;
import java.util.List;

public class Testing2 { 
	
	public static void giveAllCombinations(List<String> list,int i,int j,String s) {
		if(i==0 && j==0) {
			list.add(s);
			return; 
		}
		if(i>0) {
			giveAllCombinations(list,i-1,j, s+"(");			
		}
		if(j>i) {
			giveAllCombinations(list, i, j-1, s+")");
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		giveAllCombinations(list, 3, 3,"");
		list.stream().forEach(x->System.out.println(x));;
	}
}
