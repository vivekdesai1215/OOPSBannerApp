

public class OOPSBannerApp{
	public static void main(String[] args){
		CharacterPatternMap[] charMaps = createCharacterPatternMap();
		String message = "OOPS";
		printMessage(message,charMaps);
		
	}
	static class CharacterPatternMap{
		Character character;
		String[] pattern;
		
		public CharacterPatternMap(char ch, String[] pattern){
			this.character = ch;
			this.pattern = pattern;
		}	
	}
	
	public static CharacterPatternMap[] createCharacterPatternMap(){
		char[] chars = {'O','O','P','S'};
		String[][] patterns = {
			{
				"  ***  ",
				" ** ** ",
				"**   **",
				"**   **",
				" ** ** ",
				"  ***  "
			},
			{
				"  ***  ",
				" ** ** ",
				"**   **",
				"**   **",
				" ** ** ",
				"  ***  "
			},
			{
				"*******",
				"**   **",
				"**   **",
				"****** ",
				"**     ",
				"**     "
			},
			{
				"*******",
				"**     ",
				"**     ",
				"*******",
				"     **",
				"*******"
			}
		};
		
		CharacterPatternMap[] cp = new CharacterPatternMap[4];
		for(int i=0;i<4;i++){
			cp[i] = new CharacterPatternMap(chars[i],patterns[i]);
		}
		
		return cp;
	}
	
	
	public static void printMessage(String message,CharacterPatternMap[] charMaps){
		if(message.equals("OOPS")){
			for(CharacterPatternMap cp : charMaps){
				String[] str = cp.pattern;
				
				for(String s : str){
					System.out.println(s );
				}
			}
		}
	}
}
 