package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		Department department = new Department(2,null);
		/*List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		
		List<Seller> list = sellerDao.findAll();
		
		for(Seller sel : list) {
			System.out.println(sel);
		}*/
		
		Seller seller2 = new Seller(null,"GREG","GREG@GMAIL.COM",new Date(),400.0,department);
		sellerDao.insert(seller2);
		System.out.println("Inserted" + seller2.getId());
	}

}
