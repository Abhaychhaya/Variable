
public class SplitExamp2 {

	public static void main(String[] args) {
		String S = "Name=Abhay Age=28 Gender=Mail";
		String[] words = S.split("\\s"); //splits the string based on whitespace
		for(String w :words) {
			
			System.out.println(w);
		}

	}

}
