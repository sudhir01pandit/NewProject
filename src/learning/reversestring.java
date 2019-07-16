package learning;

public class reversestring {
	
	public static void main(String args[])
	{
	
        String s = "Sudhir";
        
        String r = "";
        
        int i =s.length();
        System.out.println(i);
        
        for(i=s.length()-1;i>=0;i--) {
        	
        	r = r+s.charAt(i);
        }
        
        System.out.println(r);
        }
		
//		StringBuffer se = new StringBuffer(s);
//		
//		 System.out.println(se.reverse());
//	}			
    
}
