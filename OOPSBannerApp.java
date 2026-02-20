import java.util.*;

public class OOPSBannerApp{
	public static void main(String[] args){
		HashMap<Character, String[]> charMaps = createCharacterPatternMap();
		String message = "OOPS";
		printMessage(message,charMaps);
		
	}
	
	public static HashMap<Character, String[]> createCharacterPatternMap(){
			
			HashMap<Character, String[]> map = new HashMap<>();
			
			map.put('O',new String[]{
				"  ***  ",
				" ** ** ",
				"**   **",
				"**   **",
				" ** ** ",
				"  ***  "
			});
			
			map.put('P',new String[]{
				"*******",
				"**   **",
				"**   **",
				"****** ",
				"**     ",
				"**     "
			});
			
			map.put('S',new String[]{
				"*******",
				"**     ",
				"**     ",
				"*******",
				"     **",
				"*******"
			});
			
			return map;
		};

	
	
	public static void printMessage(String message,HashMap<Character, String[]> charMaps){
		// if(message.equals("")) System.out.println("The message is empty");
		
		//for(char c : message.toCharArray()){
		//	String[] str = charMaps.get(c);
		//	for(String s : str){
		//		System.out.println(s);
		//	}
		// }
		
		StringBuilder[] pattern = createPattern(message, charMaps);
		
		for(StringBuilder s : pattern){
			System.out.println(s);
		}
	}
	
	public static StringBuilder[] createPattern(String str, HashMap<Character, String[]> map){
		int length = 6;
		StringBuilder[] pattern = new StringBuilder[6];
		
		for (int i = 0; i < pattern.length; i++) {
			pattern[i] = new StringBuilder();  
		}

		for(int i=0;i<length;i++){
			for(char c : str.toCharArray()){
				String st = map.get(c)[i];
				pattern[i].append(st).append(" | ");
			}
		}
		
		return pattern;
	}
}

 