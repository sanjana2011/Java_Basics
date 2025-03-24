package javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
public static void main(String[] args) throws ParseException {
	Date d = new Date ();
	System.out.println(d);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(sdf);
	
	String Dob = "25/04/2003";
	Date myDob = sdf.parse(Dob);
	System.out.println("myDob = "+ myDob);
}
}
