
package OrderingSystem;

import static OrderingSystem.CheckOut.OrderCheckOut;
import static OrderingSystem.Washnah.OrdersHistory;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order {
    
    static int orderNum;
    static ArrayList<Product> UserProducts;
    static Date date;

    //-------------------------------------------------------------------
    //--------------------------(Empty Constructor)----------------------
    //-------------------------------------------------------------------
    public Order() {
    }

    //-------------------------------------------------------------------
    //------------------------------(Construcor)-------------------------
    //-------------------------------------------------------------------
    public Order(ArrayList<Product> proudcts) {
        this.orderNum = (int)(Math.random()*10000);
        this.UserProducts = proudcts;
        this.date = new Date();
    }

    //-------------------------------------------------------------------
    //---------------------------(Getter & Setter)-----------------------
    //-------------------------------------------------------------------
    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public static ArrayList<Product> getUserProducts() {
        return UserProducts;
    }

    public void setUserProducts(ArrayList<Product> UserProducts) {
        this.UserProducts = UserProducts;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    //-------------------------------------------------------------------
    //-----------------------------(Homepage)----------------------------
    //-------------------------------------------------------------------
    public void ManageOrder(){
        
        Scanner sc = new Scanner(System.in);
        
        char Ch1 = '-';
        
        while (!(Ch1 == 'E')) {
            
            System.out.print(" /-------------------------\\\n"
                           + " |       Manage Order      |\n"
                           + " |    -----------------    |\n"
                           + " |    D -- Order Details   |\n"
                           + " |    H -- Order History   |\n"
                           + " |    C -- Cancel Order    |\n"
                           + " |    E -- Exit            |\n"
                           + " |    -----------------    |\n"
                           + " |     Your Choice: ");

            char Ch2 = sc.next().toUpperCase().charAt(0);
                
            //-----------------------(Details)---------------------
            if (Ch2 == 'D') {
                Details();
            } 

            //-----------------------(History)---------------------
            else if (Ch2 == 'H') {
                History();
            }
           
            //-----------------------(Cancel)----------------------
            else if (Ch2 == 'C') {
               Cancel();
            }
            
            //------------------------(Exit)-----------------------
            else if(Ch2 == 'E'){
                System.out.println(" \\-------------------------/\n");
                break;
            }
            
            //---------------------(Wrong Choice)------------------
            else {
                System.out.println(" |-------------------------|\n"
                                 + " |      (Wrong Choice)     |\n"
                                 + " |    Please try again     |");
            }
            
            System.out.println(" \\-------------------------/" + "\n");

        }//while
        
    }
    
    //-------------------------------------------------------------------
    //-----------------------------(Detail)------------------------------
    //-------------------------------------------------------------------
    public void Details(){
        System.out.println(" |-------------------------|" + "\n"
                         + " |      Order Detalis      |" + "\n"
                         + " |-------------------------|");
        //If Order not empty
        if (!Order.getUserProducts().isEmpty()) {  
            
            //Order Info
            System.out.println(" | Order No: " + orderNum + "          |");
            System.out.println(" |     Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + "      |");
            
            if (!UserProducts.isEmpty()) {
                
                //Every product in the order 
                for (int i = 0; i < UserProducts.size(); i++) {
                    System.out.println(" |    -----------------    |");
                    System.out.printf(" |   - Product No: %-6.2s  |%n" , UserProducts.get(i).getproductNum());
                    System.out.printf(" |   - Product:    %-4s    |%n" , UserProducts.get(i).getItemName());
                    System.out.printf(" |   - Type: %13s |%n"          , UserProducts.get(i).getItemType());
                    System.out.printf(" |   - Mesurement: %-8s|%n"     , UserProducts.get(i).getItemMesure());
                    System.out.printf(" |   - Quintity:   %-6.2s  |%n" , UserProducts.get(i).getItemQuintity());
                
                }
            }
        }//if
        
        //If order Empty
        else {
            System.out.println(" |    (No current Order)   |");
        }
        
        
    }//Details Method

    //-------------------------------------------------------------------
    //----------------------------(History)------------------------------
    //-------------------------------------------------------------------
    public void History() {
        System.out.print(" |-------------------------|" + "\n"
                       + " |      Order History      |" + "\n"
                       + " |-------------------------|" + "\n");

        for (int i = 0; i < OrdersHistory.length; i++) {
            int r = 0;
             System.out.printf(" |  Order No:  %-12s|%n" , OrdersHistory[i][r]);
             System.out.printf(" |      Date:  %-12s|%n" , OrdersHistory[i][r + 1]);
            System.out.println(" |    -----------------    |");
             System.out.printf(" |   - Product:    %-4s    |%n" , OrdersHistory[i][r + 2]);
             System.out.printf(" |   - Type: %13s |%n"         , OrdersHistory[i][r + 3]);
             System.out.printf(" |   - Mesurement: %-8s|%n" , OrdersHistory[i][r + 4]);
             System.out.printf(" |   - Quintity:   %-6.2s  |%n" , OrdersHistory[i][r + 5]);

        }
        
        
    }//History Method

    //-------------------------------------------------------------------
    //-----------------------------(Cancel)------------------------------
    //-------------------------------------------------------------------
    public void Cancel() {
        
        if(UserProducts.size() < 1){
            System.out.println(" |-------------------------|");
            System.out.println(" |    No Order to cancel   |");
        }
        else{
            for (int i = 0; i < UserProducts.size(); i++) {
                UserProducts.clear();
                OrderCheckOut.clear();
            }
        
            System.out.println(" |-------------------------|");
            System.out.println(" |  Your Order is Canceled |");
        }
        
    }//Cancel    
    
}
