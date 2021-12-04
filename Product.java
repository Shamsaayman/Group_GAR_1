/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderingSystem;

import java.util.ArrayList;
import java.util.Scanner;
import static OrderingSystem.Washnah.UserProducts;

public class Product {
    
    private int productNum;
    private String itemName;
    private String itemType;
    private int itemMesure;
    private int itemQuintity;
    //static ArrayList<Product> UserProducts;

    //-------------------------------------------------------------------
    //--------------------------(Empty Construcor)-----------------------
    //-------------------------------------------------------------------
    public Product() {
        
    }

    //-------------------------------------------------------------------
    //----------------------------(Constructor)--------------------------
    //-------------------------------------------------------------------
    public Product(int productNum, String itemName, String itemType, int itemMesure, int itemQuintity) {
        this.productNum = productNum+1;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemMesure = itemMesure;
        this.itemQuintity = itemQuintity;
    }
    
    //-------------------------------------------------------------------
    //--------------------------(Geeter & Setter)------------------------
    //-------------------------------------------------------------------
    public int getproductNum() {
        return productNum;
    }

    public void setproductNum(int productNum) {
        this.productNum = productNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemMesure() {
        return itemMesure;
    }

    public void setItemMesure(int itemMesure) {
        this.itemMesure = itemMesure;
    }

    public int getItemQuintity() {
        return itemQuintity;
    }

    public void setItemQuintity(int itemQuintity) {
        this.itemQuintity = itemQuintity;
    }


    //-------------------------------------------------------------------
    //----------------------------(Home Page)----------------------------
    //-------------------------------------------------------------------
    public void ManageProduct(){
        
        Scanner sc = new Scanner(System.in);
        
        char Ch1 = '-';
        
        while (!(Ch1 == 'E')) {
            
            System.out.print(" /-------------------------\\\n"
                           + " |       Manage Product    |\n"
                           + " |-------------------------|\n"
                           + " |       D -- Display      |\n"
                           + " |       A -- Add          |\n"
                           + " |       R -- Remove       |\n"
                           + " |       C -- Check Out    |\n"
                           + " |       E -- Exit         |\n"
                           + " |    -----------------    |\n"
                           + " |     Your Choice: ");

            char Ch2 = sc.next().toUpperCase().charAt(0);
                
            //-----------------------(Display)---------------------
            if (Ch2 == 'D') {
                Display();
            } 

            //-------------------------(Add)-----------------------
            else if (Ch2 == 'A') {
                System.out.print(" |-------------------------|" + "\n"
                               + " |           Add           |" + "\n"
                               + " |-------------------------|" + "\n");

                //If Product not Empty
                if (!UserProducts.isEmpty()) {
                    
                    //Get Product No
                    System.out.print(" |     Product No: ");
                    int ProductNo = sc.nextInt();

                    //if Product number exit
                    if (ProductNo <= UserProducts.size()) {
                        
                        //Get Amount of Increase
                        System.out.print(" |   Amount of increase: ");
                        int Amount = sc.nextInt();
                        
                        //Adding
                        Add(ProductNo, Amount);
                    
                    } 
                    
                    //Product not existed
                    else 
                        System.out.println(" |  (Product not existed)  |");
                    

                //No Products
                } else 
                    System.out.println(" |  (No current Product)   |");
                
                
            }
           
            //------------------------(Remove)---------------------
            else if (Ch2 == 'R') {
                
                System.out.print(" |-------------------------|" + "\n"
                               + " |          Remove         |" + "\n"
                               + " |-------------------------|" + "\n");

                //If Products not Empty
                if (!UserProducts.isEmpty()) {
                    
                    //Get Product No
                    System.out.print(" |     Product No: ");
                    int ProductNo = sc.nextInt();

                    //if Product number exit
                    if (ProductNo <= UserProducts.size()) {
                        
                        //Amount of decrease
                        System.out.print(" |   Amount of decrease: ");
                        int Amount = sc.nextInt();

                        //Removing
                        Remove(ProductNo, Amount);
                        
                    }
                    //Product not existed
                    else 
                    System.out.println(" |  (Product not existed)  |");
                    
                }
                //No Products
                else 
                    System.out.println(" |  (No current Product)   |");
                
            }//Remove
            
            //-----------------------(Check Out)---------------------
            else if(Ch2 == 'C'){
                CheckOut c = new CheckOut();
                c.CheckOutMethod();
            }
            
            //-------------------------(Exit)------------------------
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

    }//Manage Order
        
    public void Display(){
        
       System.out.print(" |-------------------------|" + "\n"
                      + " |         Display         |" + "\n"
                      + " |-------------------------|" + "\n");
        
        //If UserProducts not empty
        if (!UserProducts.isEmpty()) {  
            
            //Every product in the order 
            for (int i = 0; i < UserProducts.size(); i++) {
                System.out.println(" |    -----------------    |");
                System.out.printf(" |   - Product No: %-6.2s  |%n", UserProducts.get(i).getproductNum());
                System.out.printf(" |   - Product:    %-5s   |%n", UserProducts.get(i).getItemName());
                System.out.printf(" |   - Type: %13s |%n", UserProducts.get(i).getItemType());
                System.out.printf(" |   - Mesurement: %-8s|%n", UserProducts.get(i).getItemMesure());
                System.out.printf(" |   - Quintity:   %-6.2s  |%n" , UserProducts.get(i).getItemQuintity());
            }
            
        }
        
        //If UserProducts Empty
        else {
            System.out.println(" |  (No current Product)   |");
        }
                
    }
    
    
    //-------------------------------------------------------------------
    //---------------------------------(Add)-----------------------------
    //-------------------------------------------------------------------
    public void Add(int ProductNo, int Amount) {
                
                UserProducts.get(ProductNo - 1).setItemQuintity((UserProducts.get(ProductNo - 1).getItemQuintity() + Amount));
                System.out.println(" |   ------------------    |");
                System.out.println(" |   Added Successfully    |");
                System.out.println(" |   ------------------    |");            
        
    }//Add

    
    //-------------------------------------------------------------------
    //--------------------------------(Remove)---------------------------
    //-------------------------------------------------------------------
    public void Remove(int ProductNo, int Amount){
        
        int total = UserProducts.get(ProductNo - 1).getItemQuintity()  - Amount;
                        
                //if removing will makr product 0
                if (total == 0) {
                    //UserProducts.Remove(i);
                    System.out.println(" |---------------------------|");
                    System.out.println(" |   Sorry you cant remove,  |\n"
                                     + " |   Quantity will become 0! |");
                
                //remove
                } else {
                    UserProducts.get(ProductNo - 1).setItemQuintity(total);
                    System.out.println(" |   --------------------  |");
                    System.out.println(" |   Removed Successfully  |");
                    System.out.println(" |   --------------------  |");
                }             
            
    }//remove
    
}
