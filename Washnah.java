
package OrderingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Washnah {

    static String[] UsersOrders = {"#2428", "14-5-2021"};
    static String[][] OrdersHistory = {{"#3678", "7-9-2020", "Rod", "Wood", "3m", "4"}, {"#8795", "10-1-2020", "Tank", "Slimline Tank", "1000L", "1"}};
    
    //public so Tesing Class can arrive to it.
    public static ArrayList<Product> UserProducts = new ArrayList<Product>();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            //Home page
            System.out.print(" /-------------------------\\" + "\n"
                           + " |        Home Page        |" + "\n"
                           + " |-------------------------|" + "\n"
                           + " |   S -- Start Shopping   |" + "\n"
                           + " |   P -- Manage Product   |" + "\n"
                           + " |   O -- Manage Order     |" + "\n"
                           + " |   E -- Exit             |" + "\n"
                           + " |    -----------------    |" + "\n"
                           + " |      Your Choice: ");
            
            //Choice
            char Ch = sc.next().toUpperCase().charAt(0);
            
            //Design Output
            System.out.println(" \\-------------------------/\n");
            
            //switch for call method
            switch(Ch){
                
                //------------ View Categories & Add -----------
                case 'S': 
                    View_Add vd = new View_Add();
                    vd.ViewCategories();
                    break;
                
                //--------------- Manage Product ---------------
                case 'P': 
                    Product p = new Product();
                    p.ManageProduct();
                    break;
                 
                //---------------- Manage Order ----------------
                case 'O': 
                    Order o = new Order(UserProducts);
                    o.ManageOrder();
                    break;
                
                //-------------------- Exit --------------------
                case 'E': 
                    System.exit(0);break;
                    
                    
            }//Switch
        
        }//while
        
    }//main
    
}//Class
