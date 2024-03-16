package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoupAnagrams {
	
	public static List<List<String>> groupAnagrams(List<String> list){
		Map<String, List<String>> checkMap = new HashMap<String, List<String>>();
		List<List<String>> listFinal = new ArrayList<List<String>>();
		for(String s:list) {
			char[] arr =s.toCharArray();
			Arrays.sort(arr);
			String string = new String(arr);
			if(checkMap.containsKey(string)) {
				checkMap.get(string).add(s);
			}
			else {
				List<String> list1 = new ArrayList<String>();
				list1.add(s);
				checkMap.put(string,list1);
			}
			
		}
		for(Map.Entry<String, List<String>> map: checkMap.entrySet()) {
			listFinal.add(map.getValue());
		}
		return listFinal;
	}
		
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(Arrays.asList(strs)));
	}
}
