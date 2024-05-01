//time complexity: O(m*nlogn) m-->size of input strs and n-->sizd of each string
// space complexity: O(m)
import java.util.*;
public class GrpAnagrams{
	public static List<List<String>> grpAnagrams(String[] strs){
		if(strs == null || strs.length == 0){
			return new ArrayList<>();
		}
		HashMap<String,List<String>> map = new HashMap<>();
		for(String s : strs){
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String sortedString = String.valueOf(ca);
			if(!map.containsKey(sortedString)){
				map.put(sortedString,new ArrayList<String>());
			}
			map.get(sortedString).add(s);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args){
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println("anagrams groups is: "+grpAnagrams(strs)); 
	}
}
