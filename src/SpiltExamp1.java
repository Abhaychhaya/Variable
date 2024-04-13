
public class SpiltExamp1 {

	public static void main(String[] args) {
	
		String s = "Abhay Singh";
		
		System.out.println(s);
		
		String[] arr = s.split(" ");
		for(int i = arr.length-1; i>=0;i--) {
			
			System.out.println(arr[i] + " ");
		}
 
	}

}
