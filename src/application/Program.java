package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.creatDepartmentDao();
		
		Department dep = new Department(3,"Putaria");
		//depDao.insert(dep);
		//dep.setNome("Sports");
		//depDao.update(dep);
	}

}



/*SellerDao sellerDao = DaoFactory.createSellerDao();

Seller seller = sellerDao.findById(3);

System.out.println(seller);

Department department = new Department(2,null);
List<Seller> list = sellerDao.findByDepartment(department);

for(Seller sel : list) {
	System.out.println(sel);
}


List<Seller> list = sellerDao.findAll();

for(Seller sel : list) {
	System.out.println(sel);
}

Seller seller2 = new Seller(null,"GREG","GREG@GMAIL.COM",new Date(),400.0,department);
//sellerDao.insert(seller2);
//System.out.println("Inserted" + seller2.getId());
//sellerDao.update(seller2);
sellerDao.deleteById(8);
sellerDao.deleteById(9);
sellerDao.deleteById(10);
*/
