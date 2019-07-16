package learning;

public class largestSmallestNumbers {

	public static void main(String[] args) {
	
		int num[] = {19,20,30,40,80};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i=1;i<num.length;i++) {
			
			if(num[i]>largest) {
				
				largest =num[i];
			}
			else if(num[i]<smallest){
				
				smallest=num[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
		
		

	}

}
