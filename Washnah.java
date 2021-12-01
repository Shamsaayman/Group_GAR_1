package washnah;
        
import java.io.*;
import java.util.*;
public class Washnah {

    static String[] UsersOrders = {"#2428", "14-5-2021"};
    static String[][] OrdersHistory = {{"#3678", "7-9-2020", "Rod", "Wood", "3m", "4"}, {"#8795", "10-1-2020", "Tank", "Slimline Tank", "1000L", "1"}};
    public static ArrayList<Product> UserProducts = new ArrayList<Product>();

    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        char Ch1 = '-';
        char view = ' ';
                
        //-------------------------------------------------------------------
        //---------------------------(view categories)-----------------------
        //-------------------------------------------------------------------
        Order order = new Order();
        order.ViewCategories(sc, view);    //Method to display categories
        order = new Order(UserProducts);   //Make an order after adding products

        
        //-------------------------------------------------------------------
        //------------------------(Manage Product&Order)---------------------
        //-------------------------------------------------------------------

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
            
            
            //-----------------------(Manage Product)---------------------
            
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
                
                    //-----------------------(Display)---------------------
                    if(Ch2=='D'){
                        for (int i = 0; i < UserProducts.size(); i++) {
                            UserProducts.get(i).Display();
                        }
                        System.out.println("\\-------------------------/" + "\n");
                        
                    }
                
                    //-------------------------(Add)-----------------------
                    else if(Ch2=='A'){
                        System.out.print(" |-------------------------|" + "\n"
                                + " |           Add           |" + "\n"
                                + " |-------------------------|" + "\n"
                                + " |     Product No: ");
                        int Ch4 = sc.nextInt();
                        
                        System.out.print(" |   amount of increase: ");
                        int amount = sc.nextInt();
        
                        UserProducts.get(Ch4-1).Add(amount);
                                              
                    }
                
                    //------------------------(Remove)---------------------
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
        
                        UserProducts.get(Ch5-1).remove(amount);
                          
                    }
                
                    //---------------------(Wrong Choice)------------------
                    else{
                       System.out.println(" |-------------------------|\n"
                                        + " |      (Wrong Choice)     |\n" 
                                        + "      Please try again");
                    }
                    
                
                
            }//Manage Product
            
            //------------------------(Manage Order)---------------------
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
                    
                    //---------------------(Details)------------------
                    if (Ch3 == 'D') {
                        order.Details();
                    } 
                    
                    //---------------------(History)------------------
                    else if (Ch3 == 'H') {
                        order.History();
                    } 
                    
                    //----------------------(Cancel)------------------
                    else if (Ch3 == 'C') {
                        order.Cancel();
                    }
                    
                    else{
                       System.out.println(" |-------------------------|\n"
                                        + " |      (Wrong Choice)     |\n" 
                                        + "      Please try again");
                    }        
                    
            }//Manage Order
            
        }//While
        
    }//Main
    
}//Class
