package washnah;
        
import java.io.*;
import java.util.*;

public class Washnah {
 /**
 *
 * @author Bushra
 */

    static String[] UsersOrders = {"#2428", "14-5-2021"};
    static String[][] OrdersHistory = {{"#3678", "7-9-2020", "Rod", "Wood", "3m", "4"}, {"#8795", "10-1-2020", "Tank", "Slimline Tank", "1000L", "1"}};
    static String[][] UsersProducts = {{"1", "Rod", "Metal" ,"1", "2"}, {"2", "Water Tank", "Wood" ,"2", "3"}};

    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        char Ch1 = '-';
        
        Order order = new Order();
         Product product=new Product();
        


        while (!(Ch1 == 'E')) {
            System.out.print(" /-------------------------\\" + "\n"
                           + " |        Home Page        |" + "\n"
                           + " |-------------------------|" + "\n"
                           + " |   P -- Manage Product   |" + "\n"
                           + " |   O -- Manage Order     |" + "\n"
                           + " |   E -- Exit             |" + "\n"
                           + " |    -----------------    |" + "\n"
                           + " |      Your Choice: ");
            Ch1 = sc.next().toUpperCase().charAt(0);
            
            
            //ManageProduct
            
            if (Ch1 == 'P') {
                
                    System.out.print(" |-------------------------|\n"
                                   + " |       Manage Product    |\n"
                                   + " |-------------------------|\n"
                                   + " |      D -- Display       |\n"
                                   + " |      A -- Add           |\n"
                                   + " |      R -- Remove        |\n"
                                   + " |    -----------------    |\n"
                                   + " |     Your Choice: ");

                    char Ch2 = sc.next().toUpperCase().charAt(0);
                
                    //call display method
                    if(Ch2=='D'){
                          product.Display();
                        System.out.println("\\-------------------------/" + "\n");
                        
                    }
                
                   //call add method
                    else if(Ch2=='A'){
                        System.out.print(" |-------------------------|" + "\n"
                                + " |           Add           |" + "\n"
                                + " |-------------------------|" + "\n"
                                + " |     Product No: ");
                        int Ch4 = sc.nextInt();
                        
                        System.out.print(" |   amount of increase: ");
                        int amount = sc.nextInt();
                       product.Add(amount);
                                              
                    }
                
                    //call remove method
                    else if(Ch2=='R'){
                        System.out.print(" |-------------------------|" + "\n"
                                + " |          Remove         |" + "\n"
                                + " |-------------------------|" + "\n"
                                + " |  Enter product number   | " + "\n"
                                + " |  and amount of decrease | " + "\n"
                                + " |-------------------------|" + "\n"
                                + " |     Product No: ");
                        int Ch5 = sc.nextInt();
                        
                        System.out.print(" |   amount of decrease: ");
                        int amount = sc.nextInt();
        
                       product.remove(amount);
                          
                    }
                    else{
                       System.out.println(" |-------------------------|\n"
                                        + " |      (Wrong Choice)     |\n" 
                                        + "      Please try again");
                    }
                    
                
                
            }
      //-----------------------------------------------------------------------------------------------------------------
            
            ////ManageProduct
            else if (Ch1 == 'O') {
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |       Manage Order      |\n"
                                   + " |    -----------------    |\n"
                                   + " |    D -- Order Details   |\n"
                                   + " |    H -- Order History   |\n"
                                   + " |    C -- Cancel Order    |\n"
                                   + " |    -----------------    |\n"
                                   + " |     Your Choice: ");
                    char Ch3 = sc.next().toUpperCase().charAt(0);
                    
                    //call details method
                    if (Ch3 == 'D') {
                        order.Details();
                    } 
                    
                    //call history method
                    else if (Ch3 == 'H') {
                        order.History();
                    } 
                    
                    //call cancel method
                    else if (Ch3 == 'C') {
                        order.Cancel();
                    }
                    
                    else{
                       System.out.println(" |-------------------------|\n"
                                        + " |      (Wrong Choice)     |\n" 
                                        + "      Please try again");
                    }        
                    
            }
            
        }
        
    }
    
}