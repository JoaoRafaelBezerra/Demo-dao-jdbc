package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "Livros");
		Seller obj2 = new Seller(1,"Bruno Lange","Bruno@gmail.com",new Date(),1000.0,obj);;
		
		System.out.println(obj);
		System.out.println(obj2);
	}

}
