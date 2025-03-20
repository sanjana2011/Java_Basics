package javacore;

public class HeapAndLeteral {
   public static void main (String[] args){
	   String s1 = "sanjana";
	   String s2 =  "sanjana";
	   String s3 =  new String ("shreya");
	   String s4 =  new String ("shreya");
	    
	   System.out.println(s1.equals(s4));
	   System.out.println(s1==s4);
	   
	   
   }
}
