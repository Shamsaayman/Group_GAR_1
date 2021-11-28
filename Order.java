package washnah;

import java.util.*;
import static washnah.Washnah.UsersProducts;
import static washnah.Washnah.OrdersHistory;
import static washnah.Washnah.UsersOrders;

public class Order {
 /**
 *
 * @author Bushra
 */

//Details Method
    public void Details(){
        System.out.println(" |-------------------------|" + "\n"
                         + " |      Order Detalis      |" + "\n"
                         + " |-------------------------|");
     
             if(UsersOrders.length > 1) {  

                            for (int i = 0; i < UsersProducts.length; i++) {
                            int r = 0;
                              System.out.println(" |  Order No: " + UsersOrders[0]);
            System.out.println(" |  Date:  " + UsersOrders[1]);
            System.out.println(" |    -----------------    ");
            System.out.println(" |    - Product No: " + UsersProducts[i][r]);
            System.out.println(" |    - Product: " + UsersProducts[i][r+1]);
            System.out.println(" |    - Type:    " + UsersProducts[i][r+2]);
            System.out.println(" |    - Mesurement: " + UsersProducts[i][r+3]);
            System.out.println(" |    - Quintity:   " + UsersProducts[i][r+4]);
            System.out.println(" |-------------------------");

                        }
                            }
                            else{
                                System.out.println(" |-------------------------|"  + "\n"
                                                 + " |        (No current Order)       |");
                            }
        
    }

//History Method
    public void History() {
        System.out.print(" |-------------------------|" + "\n"
                       + " |      Order History      |" + "\n"
                       + " |-------------------------|" + "\n");

        for (int i = 0; i < OrdersHistory.length; i++) {
            int r = 0;
            System.out.println(" |  Order No: " + OrdersHistory[i][r]);
            System.out.println(" |  Date:  " + OrdersHistory[i][r + 1]);
            System.out.println(" |    -----------------    ");
            System.out.println(" |    - Product: " + OrdersHistory[i][r + 2]);
            System.out.println(" |    - Type:    " + OrdersHistory[i][r + 3]);
            System.out.println(" |    - Mesurement: " + OrdersHistory[i][r + 4]);
            System.out.println(" |    - Quintity:   " + OrdersHistory[i][r + 5]);
            System.out.println(" |-------------------------");

        }
        System.out.println(" |-------------------------|\n");
    }


    //cancel Method
    public void Cancel() {
        
      String[] copy = new String[UsersOrders.length - 2];

                            for (int i = 0; i < copy.length; i++) {
                                    copy[i] = UsersOrders[i];
                            }
                            
                            UsersOrders = copy;
                            
    
            System.out.println(" |-------------------------|");
            System.out.println(" |  Your Order is Canceled |");
            System.out.println(" \\-------------------------/\n");
    }
        }
        
       
        
    
