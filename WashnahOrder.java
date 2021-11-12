import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WashnahOrder {

        static String[] UsersOrders = {"#2428", "14-5-2021"};
        static String[][] OrdersHistory = {{"#3678", "7-9-2020"},{"#8795", "10-1-2020"}};    
        
    public static void main(String[] args) throws FileNotFoundException {
        
        //Take Info. From Users
        Scanner sc = new Scanner(System.in);
        
        String[][] UsersProducts = {{"1", "Rod", "Metal" ,"1", "2"}, {"2", "Water Tank", "Wood" ,"2", "3"}};
            
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
                     

                    char Ch2 = sc.next().toUpperCase().charAt(0);
                    
                    //Display Choice
                    if(Ch2 == 'D'){
                        
                        System.out.print(  " |-------------------------|" + "\n"
                                         + " |         Display         |" + "\n"
                                         + " |-------------------------|" + "\n");
                                
                        //Loop all Products
                        for (int i = 0; i < UsersProducts.length; i++) {
                            //To Search the array
                            int r = 0;
                            
                            //Display
                            System.out.println(" |    -----------------    |");
                            System.out.printf(" |  Product No:  %-10.8s | \n ", UsersProducts[i][r]);
                            System.out.printf("|     Product:  %-9.8s | \n ", UsersProducts[i][r+1]);
                            System.out.printf("|        Type:   %-5.4s    | \n ", UsersProducts[i][r+2]);
                            System.out.printf("|  Mesurement:   %-5.4s    | \n ", UsersProducts[i][r+3]);
                            System.out.printf("|    Quintity:   %-5.4s    | \n ", UsersProducts[i][r+4]);
                        }
                    }
                    
                    //Add Product
                    else if(Ch2 == 'A'){
                        System.out.print(  " |-------------------------|" + "\n"
                                         + " |            Add          |" + "\n"
                                         + " |-------------------------|" + "\n"
                                         + " |     Product No: ");  
                        
                        int Ch3 = sc.nextInt();
                        
                        for (int i = 0; i < UsersProducts.length; i++) {
                            if(Integer.parseInt(UsersProducts[i][0]) == Ch3){
                               int n = Integer.parseInt(UsersProducts[i][4]);
                               n++;
                               String s = n +"";
                               UsersProducts[i][4] = s;
                               System.out.println(" |    -----------------    |");
                               System.out.println(" |    Added Successfully   |");
                            }
                        }
                        
                        
                    }
                    
                    else if(Ch2 == 'R'){
                        System.out.print(  " |-------------------------|" + "\n"
                                         + " |          Remove         |" + "\n"
                                         + " |-------------------------|" + "\n"
                                         + " |     Product No: ");  
                        
                        int Ch3 = sc.nextInt();
                        
                        for (int i = 0; i < UsersProducts.length; i++) {
                            if(Integer.parseInt(UsersProducts[i][0]) == Ch3){
                               int n = Integer.parseInt(UsersProducts[i][4]);
                               n--;
                               String s = n +"";
                               UsersProducts[i][4] = s;
                               System.out.println(" |    -----------------    |");
                               System.out.println(" |   Removed Successfully  |");
                            }
                        }
                    }
                    
                    else{
                        System.out.println(" |-------------------------|"  + "\n"
                                         + " |      (Wrong Choice)     |");
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
                                                 + " |      (Wrong Choice)     |");
                                break;
                    }
                    
                    
                    
                    switch(Ch4){
                        case 'D':                
                            
                            System.out.print(" |      Order Detalis      |" + "\n"
                                           + " |-------------------------|" + "\n");
                            
                            if(UsersOrders.length > 1){
                                
                            System.out.printf("|  Order No:  %-11.10s | \n ", UsersOrders[0]);
                            System.out.printf("|      Date:  %-11.10s | \n ", UsersOrders[1]);
                            
                            //Loop all Products
                            for (int i = 0; i < UsersProducts.length; i++) {
                            //To Search the array
                            int r = 0;
                            
                            //Display
                            System.out.println(" |    -----------------    |");
                            System.out.printf("|       - Product No:  %-2.1s | \n ", UsersProducts[i][r]);
                            System.out.printf("|       - Product:  %-5.4s | \n ", UsersProducts[i][r+1]);
                            System.out.printf("|       - Type:   %-4.3s    | \n ", UsersProducts[i][r+2]);
                            System.out.printf("|       - Mesurement:   %-1.0s    | \n ", UsersProducts[i][r+3]);
                            System.out.printf("|       - Quintity:   %-1.0s    | \n ", UsersProducts[i][r+4]);
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
                                
                            for (int i = 0; i < UsersProducts.length; i++) {
                                //To Search the array
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
            
                
            }

        
    }
    
}
