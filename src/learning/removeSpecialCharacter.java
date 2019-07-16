package learning;

public class removeSpecialCharacter {

	public static void main(String[] args) {
		
		String s = "!@#$%^sudhir$%^%$#Pandit@#$%^;";
				
			s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
