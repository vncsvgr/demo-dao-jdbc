package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(1985, 05, 02), 3000.0, obj);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
