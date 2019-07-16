package learning;

public class test {

	public static void main(String[] args) {
		

		int a[] = {1,2,4,5};
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<a.length; i++) {
			
			 sum = sum+a[i];
		}
		
		System.out.println(sum);
		
		for(int j=0; j<=5; j++) {
			
			 sum1 = sum1+j;
		}
		
		System.out.println(sum1);
		
		
		System.out.println(sum1-sum);
		
	}		
	
	
	}
