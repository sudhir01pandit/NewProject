package learning;

public class missingNumberArray {

	public static void main(String[] args) {

		int a[] = {1,2,4,5};
		int sum = 0;
		int sum1 = 0;
		
		for (int i=0; i<a.length;i++) {
			
			sum = sum+a[i];
		}
	         System.out.println("value is"+sum);
	         
	    for (int j=1; j<=5;j++) {
	 			
	 		sum1 = sum1+j;
	 		}
	 	         System.out.println("value is"+sum1);
	 	         
	 	        System.out.println("missing number is" + (sum1-sum));
 
	}
	
	

}
