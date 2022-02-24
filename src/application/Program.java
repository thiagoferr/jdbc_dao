package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		Department dep = new Department(1,"book");
		System.out.println(dep);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		Date date = new Date ();
		Seller sell = new Seller(312,"Joseph Mann","jalmiks@outlook.com",sdf.parse("10/11/2006"),2400.0,dep);
		System.out.println(sell);
//				System.out.println(sdf.format(sdf.parse("10/11/2006")));
	
	}

}
