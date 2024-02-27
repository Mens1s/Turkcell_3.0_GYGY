package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Değer tipi örneği: int
        int x = 10; // x, doğrudan değeri (10) içerir
        int y = x;  // y, x'in değerini kopyalar

        System.out.println("Değer Tipi Örneği:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // x'in değerini değiştirmek, y'i etkilemez
        x = 20;

        System.out.println("x: " + x); // x: 20
        System.out.println("y: " + y); // y: 10 (y, x'in eski değerini içerir)

        // Referans tipi örneği: String
        int[] array = new int[]{0,1,2,3,4,5,6};
        int[] protectedArray = array;

        // location
        System.out.println(array);
        System.out.println(protectedArray);

        System.out.println(protectedArray[1]);

        array[1]= 55;

        System.out.println(protectedArray[1]);
    }
}