//@author Developer
//@version 5


public class OOPSBannerApp{
	public static void main(String[] args){

		String[] lines = {
			String.join(" ", "   ****   ", "   *****   "),
			String.join(" ", " **    ** ", "   **      "),
			String.join(" ", " **    ** ", "   **      "),
			String.join(" ", " **    ** ", "   *****   "),
			String.join(" ", " **    ** ", "      **   "),
			String.join(" ", " **    ** ", "      **   "),
			String.join(" ", "   ****   ", "   *****   ")
		};
		
		for(String s : lines){

			System.out.println(s);

		}

	}	
}
 