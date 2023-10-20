
public class Question4a {

	public static void main(String[] args) {
		//				1,5   
		//			2,4 	2,6 
		//		3,3 	3,5 	3,7
		//	4,2 	4,4 	4,6 	4,8
		//5,1 	5,3 	5,5 	5,7 	5,9
		int n =5;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<(n-i);j++) {
				System.out.print(" ");				
			}
			for(int k=1; k<=i;k++) {
				System.out.print("* ");				
			}
			
			System.out.println("");
		}
	}

}
