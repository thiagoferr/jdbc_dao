package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SellerDao sellerDao = DaoFactory.createSellerDao();
//		int id = 1;
//		System.out.println(sellerDao.findById(id));
//		List<Seller> list = sellerDao.findByDepartment(new Department(1,"Eletronics"));
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Seller> list = new ArrayList<>();
		
//		System.out.println("Name: ");
//		String name = ler.nextLine();
//		System.out.println("Email: ");
//		String email = ler.nextLine();
//		System.out.println("Birth date: ");
//		String birthDate = ler.nextLine();
//		System.out.println("Base Salary: ");
//		Double BaseSalary = ler.nextDouble();
//		System.out.println("Department Id: ");
//		int DepartmentId = ler.nextInt();
		
//		Seller seller = new Seller(list.size(),"Alex Ribeiro","alex@gmail.com",sdf.parse("10/02/1972"),3290.0, new Department(2,null));
//		sellerDao.insert(seller);
		
//		Seller seller = new Seller(null,"Daniel D. Alves","ddalves@yahoo.com",sdf.parse("16/07/1945"),7800.0, new Department(3,null));
//		sellerDao.update(seller);
//		sellerDao.deleteById(121);
		list = sellerDao.findAll();
		 System.out.println();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
