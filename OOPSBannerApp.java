//@author Developer
//@version 6


public class OOPSBannerApp{
	public static void main(String[] args){

		String[] pattern = getPattern();
		for(String s: pattern){
			System.out.println(s);
		}
	};	
	public static String[] getPattern(){
		return new String[]{
			"  ***  ",
			" ** ** ",
			"**   **",
			"**   **",
			" ** ** ",
			"  ***  "
		};
	};
}
 