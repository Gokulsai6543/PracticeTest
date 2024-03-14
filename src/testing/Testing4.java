package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testing4 {

	
	public static List<StringBuilder> tryAllCombination(String s){
		Map<Character,List<Character>> checkList = new HashMap<Character, List<Character>>();
		
		checkList.put('2',List.of('a','b','c'));
		checkList.put('3',List.of('d','e','f'));
		checkList.put('4',List.of('g','h','i'));
		checkList.put('5',List.of('j','k','l'));
		checkList.put('6',List.of('m','n','o'));
		checkList.put('7',List.of('q','r','s','p'));
		checkList.put('8',List.of('t','u','v'));
		checkList.put('9',List.of('w','x','y','z'));
		List<StringBuilder> finalList = new ArrayList<StringBuilder>();
		List<StringBuilder> solList = new ArrayList<StringBuilder>();
		
		goingInTOLoop(checkList, s, solList, finalList);
		return finalList;
	}
	
	public static void goingInTOLoop(Map<Character,List<Character>> CheckList,String n,List<StringBuilder> solList,List<StringBuilder>finalList) {
		List<StringBuilder> solBackUp = new ArrayList<StringBuilder>();

		if(n.length()==1) {
			System.out.println(solList);
			for(StringBuilder b: solList) {
				System.out.println();
				for(Character c :CheckList.get(n.charAt(0))) {
					finalList.add(new StringBuilder(String.valueOf(b+""+c)));
				}
			}
		}
		else {
			char val = n.charAt(0);
			if(solList.isEmpty()) {
			   for(Character c:CheckList.get(val)) {
				   System.out.println(c);
				   solBackUp.add(new StringBuilder(c.toString()));
			   }
			}
			else {
			for(Character c :CheckList.get(val)) {
				for(StringBuilder s: solList) {
					solBackUp.add(new StringBuilder(String.valueOf(s+""+c)));
				}
			}
		}
			goingInTOLoop(CheckList,n.substring(1),solBackUp,finalList);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		List<StringBuilder> finalList = tryAllCombination("245");
		for(StringBuilder s : finalList) {
			System.out.println(s);
		}
	}
}

