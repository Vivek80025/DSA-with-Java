//time complexity:O(n)
//space complexity:O(n)
import java.util.*;
public class ConstructStr{
	public static boolean constructOrNot(String ransomNote,String magazine){
		HashMap<Character,Integer> hm1 = new HashMap<>();
		HashMap<Character,Integer> hm2 = new HashMap<>();
		for(int i=0;i<ransomNote.length();i++){
			if(hm1.containsKey(ransomNote.charAt(i))){
				hm1.put(ransomNote.charAt(i),hm1.get(ransomNote.charAt(i))+1);
			}
			else{
				hm1.put(ransomNote.charAt(i),1);
			}
		}
		for(int i=0;i<magazine.length();i++){
			if(hm2.containsKey(magazine.charAt(i))){
				hm2.put(magazine.charAt(i),hm2.get(magazine.charAt(i))+1);
			}
			else{
				hm2.put(magazine.charAt(i),1);
			}
		}
		for(int i=0;i<ransomNote.length();i++){
			if(!hm2.containsKey(ransomNote.charAt(i)) || hm1.get(ransomNote.charAt(i))>hm2.get(ransomNote.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		String ransomNote = "aa";
		String magazine = "ab";
		System.out.println("ransomNote can be constructed by a latters of magzine?: "+constructOrNot(ransomNote,magazine));
	}
}