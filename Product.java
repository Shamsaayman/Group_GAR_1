package washnah;

import java.util.*;
import static washnah.Washnah.UsersProducts;
 
public class Product {
  /**
 *
 * @author Bushra
 */

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
    
    
    //Display Method
    public void Display(){
        
        System.out.print(" |-------------------------|" + "\n"
                       + " |         Display         |" + "\n"
                       + " |-------------------------|" + "\n");

              for (int i = 0; i < UsersProducts.length; i++) {
                     int r = 0;
                            
                           
                      System.out.println(" |    -----------------    ");
            System.out.println(" |    - Product No: " + UsersProducts[i][r]);
            System.out.println(" |    - Product: " + UsersProducts[i][r+1]);
            System.out.println(" |    - Type:    " + UsersProducts[i][r+2]);
            System.out.println(" |    - Mesurement: " + UsersProducts[i][r+3]);
            System.out.println(" |    - Quintity:   " + UsersProducts[i][r+4]);
            System.out.println(" |-------------------------");
        }
        
    }
    
    
    //Add Method
    public void Add(int amount) {
                       for (int i = 0; i < UsersProducts.length; i++) {
                            if(Integer.parseInt(UsersProducts[i][0]) == amount){
                               int n = Integer.parseInt(UsersProducts[i][4]);
                               n++;
                               String s = n +"";
                               UsersProducts[i][4] = s;
                               System.out.println(" |    -----------------    |");
                               System.out.println(" |    Added Successfully   |");
                               System.out.println(" |   -----------------     |");
                               System.out.println(" \\-------------------------/" + "\n");
                            }
                        }

        
    }

    
    //Remove Method
    public void remove(int amount){
                            for (int i = 0; i < UsersProducts.length; i++) {
                            if(Integer.parseInt(UsersProducts[i][0]) == amount){
                               int n = Integer.parseInt(UsersProducts[i][4]);
                               n--;
                               String s = n +"";
                               UsersProducts[i][4] = s;
                               System.out.println(" |    -----------------    |");
                               System.out.println(" |    Removed Successfully   |");
                               System.out.println(" |   -----------------     |");
                               System.out.println(" \\-------------------------/" + "\n");
                            }/*else if(Integer.parseInt(UsersProducts[i][4]) == amount)
                System.out.println(" |---------------------------|");
                System.out.println("   Sorry you cant remove,\n   the quantity will become 0!");
                System.out.println(" |---------------------------|\n");*/

    }
}
}
    