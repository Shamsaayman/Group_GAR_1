/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package washnahorder;

import java.io.*;
import java.util.*;

public class WashnahOrder {

        static String[] UsersOrders = {"#2428", "14-5-2021"};
        static String[][] OrdersHistory = {{"#3678", "7-9-2020"},{"#8795", "10-1-2020"}};
        static int numOfProduct = 0; 
        // an array for the proudcts
        static Product[] UserProducts = new Product[10];
    public static void main(String[] args){
        
        //Take Info. From Users
        Scanner sc = new Scanner(System.in);
         //-----------------------------------------------------------------------          
        char view =' ';
        while(!(view == 'S')){
                      System.out.print(" |-------------------------|" + "\n"
                                     + " |         VIEW ITEM       |" + "\n"
                                     + " |-------------------------|" + "\n"
                                     + " |    A -- Rod             |" + "\n"
                                     + " |    B -- Water Tank      |" + "\n"
                                     + " |    C -- SlimLine Tank   |" + "\n"
                                     + " |    D -- Water pipes     |" + "\n"
                                     + " |    E -- Water filters   |" + "\n"
                                     + " |    F -- Tools           |" + "\n"
                                     + " |    S -- STOP SHOPPING   |" + "\n"
                                     + " |    -----------------    |" + "\n"
                                     + " |     Your Choice: ");
                
                    view = sc.next().toUpperCase().charAt(0);
                    String item = "";
                    
                    //Rod Item
                    switch (view) {
                        case 'A': 
                            item = "Rod";
                     System.out.print(" |-------------------------|" + "\n"
                                    + " |      DISPALY PRODUCT    |" + "\n"
                                    + " |-------------------------|" + "\n"
                                    + " |           Rod           |" + "\n"
                                    + " |    -----------------    |" + "\n"
                                    + " |       M -- Metal        |" + "\n"
                                    + " |       S -- Steel        |" + "\n"
                                    + " |       W -- Wood         |" + "\n"
                                    + " |       P -- Plastic      |" + "\n"
                                    + " |    -----------------    |" + "\n"
                                    + " |     Your Choice: ");
                            char Type = sc.next().toUpperCase().charAt(0);
                            String type = "";
                            switch (Type) {
                                case 'M': type = "Metal";   break;
                                case 'S': type = "Steel";   break;
                                case 'W': type = "Wood";    break;
                                case 'P': type = "Plastic"; break;
                                
                                }
                            if(!(Type == 'M' || Type == 'S' || Type == 'W' || Type == 'P')){
                                System.out.println(" |-------------------------|"  + "\n"
                                                 + " |      (Wrong Choice)     |" + "\n" + "        Please try again");
                                break;
                            }
                            
                     System.out.print(" |-------------------------|" + "\n"
                                    + " |         MESURMENT       |" + "\n"
                                    + " |-------------------------|" + "\n"
                                    + " |         1 -- 1m         |" + "\n"
                                    + " |         2 -- 2m         |" + "\n"
                                    + " |         3 -- 3m         |" + "\n"
                                    + " |         4 -- 4m         |" + "\n"
                                    + " |         5 -- 5m         |" + "\n"
                                    + " |    -----------------    |" + "\n"
                                    + " |     Your Choice: ");
                            int Mesure = sc.nextInt();
                            if(!(0 < Mesure && Mesure < 6)){
                                System.out.println(" |-------------------------|"  + "\n"
                                                 + " |      (Wrong Choice)     |"+ "\n" + "        Please try again");
                                break;
                            }
                            
                            
                     System.out.print(" |    -----------------    |" + "\n"
                                    + " |       Quintity: ");
                            int Quintity = sc.nextInt();
                            if(Quintity < 1){
                                System.out.println(" |-------------------------|"  + "\n"
                                                 + " |      (Wrong Choice)     |"+ "\n" + "        Please try again");
                                break;
                            }
                            
                     System.out.print(" |    -----------------    |" + "\n"
                                    + " |       A -- Add To Cart  |" + "\n"
                                    + " |       C -- Cancel       |" + "\n"
                                    + " |    -----------------    |" + "\n"
                                    + " |     Your Choice: ");
                            char FMC = sc.next().toUpperCase().charAt(0);

                            switch (FMC) {
                                case 'A':
                                    UserProducts[numOfProduct]= new Product((numOfProduct+1), item, type, Mesure, Quintity);
                                    numOfProduct++;
                                    break;
                                case 'C': break;
                            }
                            break;
                            
                        case 'B':
                            item = "Water Tank";
                            break;
                        case 'C':
                            item = "SlimLine Tank";
                            break;
                        case 'D':
                            item = "Water pipes";
                            break;
                        case 'E':
                            item = "Water filters";
                            break;
                        case 'F':
                            item = "Tools";
                            break;
                        case 'S':
                            break;
                        default: 
                            System.out.println(" |-------------------------|"  + "\n"
                                             + " |      (Wrong Choice)     |"+ "\n" + "        Please try again");
                    }
                    System.out.println(" \\-------------------------/" + "\n");
            
        }
        //the final order that have all the customer wanted products
        Order order = new Order(UserProducts);     
         //------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------
        
        char Ch1 = '-';
        while(!(Ch1=='E')){
                System.out.print(  " /-------------------------\\" + "\n"
                                 + " |        Home Page        |" + "\n"
                                 + " |-------------------------|" + "\n"
                                 + " |   P -- Manage Product   |" + "\n"
                                 + " |   O -- Manage Order     |" + "\n"
                                 + " |   E -- Exit             |" + "\n"
                                 + " |    -----------------    |" + "\n"
                                 + " |      Your Choice: ");  
                Ch1 = sc.next().toUpperCase().charAt(0);
                
                //Manage Product
                if(Ch1 == 'P') {
                    System.out.print(  " |-------------------------|" + "\n"
                                     + " |       Manage Product    |" + "\n"
                                     + " |-------------------------|" + "\n"
                                     + " |      D -- Display       |" + "\n"
                                     + " |      A -- Add           |" + "\n"
                                     + " |      R -- Remove        |" + "\n"
                                     + " |    -----------------    |" + "\n"
                                     + " |     Your Choice: ");  
                     

                    char Ch3 = sc.next().toUpperCase().charAt(0);
                    
                    //Display Choice
                    if(Ch3 == 'D'){
                        
                        System.out.print(  " |-------------------------|" + "\n"
                                         + " |         Display         |" + "\n"
                                         + " |-------------------------|" + "\n");
                                                        
                        if(UserProducts[0] == null){
                            System.out.println(" |-------------------------|"  + "\n"
                                                 + " |        (No Order)       |");
                        }
                        //Loop all Products
                        for (int i = 0; i < UserProducts.length; i++) {
                         if(UserProducts[i] != null){
                            //Display
                            System.out.println(" |    -----------------    |");
                            System.out.printf(" |  Product No:  %-10.8s | \n ",UserProducts[i].getproductNum());
                            System.out.printf("|     Product:  %-9.8s | \n ", UserProducts[i].getItemName());
                            System.out.printf("|        Type:   %-5.4s    | \n ", UserProducts[i].getItemType());
                            System.out.printf("|  Mesurement:   %-5.4s    | \n ", UserProducts[i].getItemMesure());
                            System.out.printf("|    Quintity:   %-5.4s    | \n ", UserProducts[i].getItemQuintity());
                         }
                        }
                    }
                    
                    //Add Product
                    else if(Ch3 == 'A'){
                         if(UserProducts[0] == null){
                            System.out.println(" |-------------------------|"  + "\n"
                                                 + " |        (No Order)       |");
                        }else{
                        System.out.print(  " |---------------------------|" + "\n"
                                         + " |              Add          |" + "\n"
                                         + " |---------------------------|" + "\n"
                                         + " | Enter the order number    | " + "\n"
                                         + " | to increas quintity by one| " + "\n"
                                         + " |---------------------------|" + "\n"
                                         + " |     Order No: ");   
                        int Ch4 = sc.nextInt();
                        for (int i = 0; i < UserProducts.length; i++) {
                            if(UserProducts[i] != null && UserProducts[i].getproductNum() == Ch4){
                                UserProducts[i].setItemQuintity((UserProducts[i].getItemQuintity()+1));
                               System.out.println(" |    -----------------    |");
                               System.out.println(" |    Added Successfully   |");
                            }
                        }
                        
                        }  
                    }
                    
                    else if(Ch3 == 'R'){
                        if(UserProducts[0] == null){
                            System.out.println(" |-------------------------|"  + "\n"
                                                 + " |        (No Order)       |");
                        }else{
                        System.out.print(  " |---------------------------|" + "\n"
                                         + " |            Remove         |" + "\n"
                                         + " |---------------------------|" + "\n"
                                         + " | Enter the product number  | " + "\n"
                                         + " | to decreas quintity by one| " + "\n"
                                         + " |---------------------------|" + "\n"
                                         + " |     Product No: ");  
                        
                        int Ch5 = sc.nextInt();                     
                          for (int i = 0; i < UserProducts.length; i++) {
                            if(UserProducts[i] != null && UserProducts[i].getproductNum() == Ch5){
                                UserProducts[i].setItemQuintity((UserProducts[i].getItemQuintity()-1));
                               System.out.println(" |    -----------------    |");
                               System.out.println(" |   Removed Successfully  |");
                            }
                        }
                    }
                    }
                    
                    else{
                        System.out.println(" |-------------------------|"  + "\n"
                                         + " |      (Wrong Choice)     |" + "       Please try again");
                    }
                    
                }
                
    //-----------------------------------Manage Order-----------------------------------
                
                else if(Ch1 == 'O'){
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |       Manage Order      |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |    D -- Order Details   |" + "\n"
                                   + " |    H -- Order History   |" + "\n"
                                   + " |    C -- Cancel Order    |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     Your Choice: ");
                    char Ch4 = sc.next().toUpperCase().charAt(0);
                    
                    if(!(Ch4 == 'D' || Ch4 == 'H' || Ch4 == 'C')){
                                System.out.println(" |-------------------------|"  + "\n"
                                                 + " |      (Wrong Choice)     |" + "       Please try again");
                                break;
                    }
                    
                    
                    
                    switch(Ch4){
                        case 'D':                
                            
                            System.out.print(" |      Order Detalis      |" + "\n"
                                           + " |-------------------------|" + "\n");
                            
                            if(order.getProudcts()[0] != null){
                                
                            System.out.printf("|  Order No:  %-11.10s | \n ", order.getOrderNum());
                            System.out.printf("|      Date:  %-11.10s | \n ", order.getDate());
                            
                            //Loop all Products
                            for (int i = 0; i < UserProducts.length; i++) {
                            if( UserProducts[i] != null){
                            //Display
                            System.out.println(" |    -----------------    |");
                            System.out.printf("|       - Product No:  %-2.1s | \n ", UserProducts[i].getproductNum());
                            System.out.printf("|       - Product:  %-5.4s | \n ", UserProducts[i].getItemName());
                            System.out.printf("|       - Type:   %-4.3s    | \n ", UserProducts[i].getItemType());
                            System.out.printf("|       - Mesurement:   %-1.0s    | \n ", UserProducts[i].getItemMesure());
                            System.out.printf("|       - Quintity:   %-1.0s    | \n ", UserProducts[i].getItemQuintity());    
                        }
                            }
                            }
                            else{
                                System.out.println(" |-------------------------|"  + "\n"
                                                 + " |        (No Order)       |");
                            }
                            break;
                        case 'H': 
                            System.out.print(" |-------------------------|" + "\n"
                                           + " |      Order History      |" + "\n"
                                           + " |-------------------------|" + "\n");
                                
                            for (int i = 0; i < UserProducts.length; i++) {
                                int r = 0;
                                System.out.println(" |    -----------------    |");
                                System.out.printf("|  Order No:  %-11.10s | \n ", OrdersHistory[i][r]);
                                System.out.printf("|      Date:  %-11.10s | \n ", OrdersHistory[i][r+1]);
                            }
                            
                            //History order details
//                            //Loop all Products
//                            for (int i = 0; i < UsersProducts.length; i++) {
//                            //To Search the array
//                            int r = 0;
//                            
//                            //Display
//                            System.out.println(" |    -----------------    |");
//                            System.out.printf("|       - Product No:  %-2.1s | \n ", UsersProducts[i][r]);
//                            System.out.printf("|       - Product:  %-5.4s | \n ", UsersProducts[i][r+1]);
//                            System.out.printf("|       - Type:   %-4.3s    | \n ", UsersProducts[i][r+2]);
//                            System.out.printf("|       - Mesurement:   %-1.0s    | \n ", UsersProducts[i][r+3]);
//                            System.out.printf("|       - Quintity:   %-1.0s    | \n ", UsersProducts[i][r+4]);
//                            
                            break;
                        case 'C': 
                            
                            String[] copy = new String[UsersOrders.length - 2];

                            for (int i = 0; i < copy.length; i++) {
                                    copy[i] = UsersOrders[i];
                            }
                            
                            UsersOrders = copy;
                           
                            //Arrays.copyOf(UsersOrders, UsersOrders.length-2);
                            break;
                    }
                    
                }
                else{

                   System.out.println(" |-------------------------|"  + "\n"
                                    + " |      (Wrong Choice)     |"+ "\n" + "       Please try again");
                    }
                    System.out.println(" \\-------------------------/" + "\n");   
            }

        
    }
    
}
