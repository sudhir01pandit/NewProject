package learning;

public class swapstring {

	public static void main(String[] args) {
		
		String a = "Sudhir";
		String b = "Pandit";
		
		
		a = a+b;
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		
		System.out.println(b);

	}

}
