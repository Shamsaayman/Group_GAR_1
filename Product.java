package washnah;

import java.util.Scanner;
import static washnah.Washnah.UserProducts;
 
public class Product {

    private int productNum;
    private String itemName;
    private String itemType;
    private int itemMesure;
    private int itemQuintity;

    public Product() {
    }

    public Product(int productNum, String itemName, String itemType, int itemMesure, int itemQuintity) {
        this.productNum = productNum+1;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemMesure = itemMesure;
        this.itemQuintity = itemQuintity;
    }

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
    //-------------------------------(Display)---------------------------
    //-------------------------------------------------------------------
    public void Display(){
        
        System.out.print(" |-------------------------|" + "\n"
                       + " |         Display         |" + "\n"
                       + " |-------------------------|" + "\n");

        //for (int i = 0; i < UserProducts.size(); i++) {
            System.out.println(" |    -----------------    |");
            System.out.printf(" |  Product No:  %-10.7s| \n "   , this.getproductNum());
            System.out.printf("|     Product:  %-9.8s | \n "     , this.getItemName());
            System.out.printf("|        Type:   %-5.4s    | \n " , this.getItemType());
            System.out.printf("|  Mesurement:   %-5.4s    | \n " , this.getItemMesure());
            System.out.printf("|    Quintity:   %-5.4s    | \n " , this.getItemQuintity());
        //}
        
    }
    
    
    //-------------------------------------------------------------------
    //---------------------------------(Add)-----------------------------
    //-------------------------------------------------------------------
    public void Add(int amount) {
       

        //if Product number exit
            this.setItemQuintity((this.getItemQuintity() + amount));
            System.out.println(" |   -----------------     |");
            System.out.println(" |   Added Successfully    |");
            System.out.println(" |   -----------------     |");
            System.out.println(" \\-------------------------/" + "\n");
        
    }//Add

    
    //-------------------------------------------------------------------
    //--------------------------------(Remove)---------------------------
    //-------------------------------------------------------------------
    public void remove(int amount){
        
            //if removing will makr product 0
            if (this.getItemQuintity() - amount == 0) {
                //UserProducts.remove(i);
                System.out.println(" |---------------------------|");
                System.out.println("   Sorry you cant remove,\n   the quantity will become 0!");
                System.out.println(" |---------------------------|\n");
            } 
            
            //remove
            else {
                this.setItemQuintity((this.getItemQuintity() - amount));
                System.out.println(" |    -----------------    |");
                System.out.println(" |   Removed Successfully  |");
                System.out.println(" |-------------------------|\n");
            }
        
    }//remove
    
}//class
    
    
    
    

           



