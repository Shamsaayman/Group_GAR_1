package washnah;

import java.util.*;
import static washnah.Washnah.UserProducts;
import static washnah.Washnah.OrdersHistory;

public class Order {
    static int orderNum;
    static ArrayList<Product> proudcts;
    static Date date;

    public Order() {
    }

    public Order(ArrayList<Product> proudcts) {
        this.orderNum = (int)(Math.random()*10000);
        this.proudcts = proudcts;
        this.date = new Date();
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public static ArrayList<Product> getProudcts() {
        return proudcts;
    }

    public void setProudcts(ArrayList<Product> proudcts) {
        this.proudcts = proudcts;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    //-------------------------------------------------------------------
    //------------------------------(View)-------------------------------
    //-------------------------------------------------------------------
    public void ViewCategories(Scanner sc,char view){
        
        while (!(view == 'S')) {
            System.out.print(" |-------------------------|" + "\n"
                           + " |        Categories       |" + "\n"
                           + " |-------------------------|" + "\n"
                           + " |    A -- Rod             |" + "\n"
                           + " |    B -- Tank            |" + "\n"
                           + " |    C -- Water           |" + "\n"
                           + " |    -----------------    |" + "\n"
                           + " |    S -- STOP SHOPPING   |" + "\n"
                           + " |    -----------------    |" + "\n"
                           + " |     Your Choice: ");
            view = sc.next().toUpperCase().charAt(0);
            String item = "";

            
            switch (view) {
                
                //---------------------------(Rod)------------------------
                case 'A':
                    item = "Rod";
                    
                    //-----------------------(Type)-----------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |          Types          |" + "\n"
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
                        case 'M': type = "Metal"; break;
                        case 'S': type = "Steel"; break;
                        case 'W': type = "Wood"; break;
                        case 'P': type = "Plastic"; break;
                    }
                    
                    //Wrong Choice
                    if (!(Type == 'M' || Type == 'S' || Type == 'W' || Type == 'P')) {
                        System.out.println(" |-------------------------|" + "\n"
                                         + " |      (Wrong Choice)     |" + "\n" 
                                         + "      Please try again");
                        break;
                    }
                    
                    //------------------(Measurements)-------------------
                    System.out.print(" |-------------------------|" + "\n"
                            + " |       Measurements      |" + "\n"
                            + " |-------------------------|" + "\n"
                            + " |         1 -- 1m         |" + "\n"
                            + " |         2 -- 2m         |" + "\n"
                            + " |         3 -- 3m         |" + "\n"
                            + " |         4 -- 4m         |" + "\n"
                            + " |         5 -- 5m         |" + "\n"
                            + " |    -----------------    |" + "\n"
                            + " |     Your Choice: ");
                    int Measure = sc.nextInt();
                    
                    //Wrong Choice
                    if (!(0 < Measure && Measure < 6)) {
                        System.out.println(" |-------------------------|" + "\n"
                                         + " |      (Wrong Choice)     |" + "\n" 
                                         + " |     Please try again");
                        break;
                    }

                    
                    //--------------------(Quintity)---------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |       Quintity: ");
                    int Quantity = sc.nextInt();
                    
                    //while Quantity lower than 1
                    while (Quantity < 1) {
                        System.out.println(" |    -----------------    |" + "\n"
                                       +   " | quantity must be above 0|" + "\n"
                                       +   " |    (Please try again)   |" + "\n"
                                       +   " |    -----------------    |" + "\n"
                                       +" |       Quintity: ");
                        Quantity = sc.nextInt();
                    }
                    
                    Cart(sc, item, type, Measure, Quantity);
                    break;

                    
                //--------------------------(Tank)------------------------
                case 'B':
                    item = "Tank";
                    
                    //-----------------------(Type)-----------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |          TYPES          |" + "\n"
                                   + " |-------------------------|" + "\n"
                                   + " |           Tank          |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     W -- Water Tank     |" + "\n"
                                   + " |     S -- Slimline Tank  |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     Your Choice: ");
                    Type = sc.next().toUpperCase().charAt(0);
                    type = "";
                    
                    switch (Type) {
                        case 'W': type = "Water Tank";    break;
                        case 'S': type = "Slimline Tank"; break;
                    }
                    
                    //Wrong Choice
                    if (!(Type == 'W' || Type == 'S')) {
                        System.out.println(" |-------------------------|" + "\n"
                                         + " |      (Wrong Choice)     |" + "\n" 
                                         + " |     Please try again    |");
                        break;
                    }

                    
                    //------------------(Measurements)-------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |         MESURMENT       |" + "\n"
                                   + " |-------------------------|" + "\n"
                                   + " |       1 -- 600L         |" + "\n"
                                   + " |       2 -- 800L         |" + "\n"
                                   + " |       3 -- 1000L        |" + "\n"
                                   + " |       4 -- 1500L        |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     Your Choice: ");
                    Measure = sc.nextInt();
                    
                    //Wrong Choice
                    if (!(0 < Measure && Measure < 5)) {
                        System.out.println(" |-------------------------|" + "\n"
                                         + " |      (Wrong Choice)     |" + "\n" 
                                         + " |     Please try again    |");
                        break;
                    }

                    //--------------------(Quintity)---------------------
                    System.out.print(" |    -----------------    |" + "\n"
                                   + " |       Quintity: ");
                    Quantity = sc.nextInt();
                    
                    //while Quantity lower than 1
                    while (Quantity < 1) {
                        System.out.println(" |    -----------------    |" + "\n"
                                       +   " | quantity must be above 0|" + "\n"
                                       +   " |    (Please try again)   |" + "\n"
                                       +   " |    -----------------    |" + "\n"
                                       +" |       Quintity: ");
                        Quantity = sc.nextInt();
                    }
                    Cart(sc ,item,type, Measure,Quantity);
                    break;
                    
                
                //--------------------------(Water)-----------------------
                case 'C':
                    item = "Water";
                    
                    //-----------------------(Type)-----------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |          TYPES          |" + "\n"
                                   + " |-------------------------|" + "\n"
                                   + " |           Water         |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |    P -- Water Pipes     |" + "\n"
                                   + " |    F -- Water Filters   |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     Your Choice: ");
                    Type = sc.next().toUpperCase().charAt(0);
                    type = "";
                    
                    switch (Type) {
                        case 'P': type = "Water Pipes";   break;
                        case 'F': type = "Water Filters"; break;

                    }
                    
                    //Wrong Choice
                    if (!(Type == 'P' || Type == 'F')) {
                        System.out.println(" |-------------------------|" + "\n"
                                         + " |      (Wrong Choice)     |" + "\n" 
                                         + " |     Please try again    |");
                        break;
                    }

                    
                    //------------------(Measurements)-------------------
                    System.out.print(" |-------------------------|" + "\n"
                            + " |         MESURMENT       |" + "\n"
                            + " |-------------------------|" + "\n"
                            + " |   1 -- 15mm (1/2 inch)  |" + "\n"
                            + " |   2 -- 20mm (3/4 inch)  |" + "\n"
                            + " |   3 -- 25mm (1 inch)    |" + "\n"
                            + " |   4 -- 50mm (2 inch)    |" + "\n"
                            + " |    -----------------    |" + "\n"
                            + " |     Your Choice: ");
                    Measure = sc.nextInt();
                    
                    // Wrong Choice
                    if (!(0 < Measure && Measure < 5)) {
                        System.out.println(" |-------------------------|" + "\n"
                                         + " |      (Wrong Choice)     |" + "\n" 
                                         + " |     Please try again    |");
                        break;
                    }

                     //--------------------(Quintity)---------------------
                    System.out.print(" |    -----------------    |" + "\n"
                                   + " |       Quintity: ");
                    Quantity = sc.nextInt();
                    
                    //while Quantity lower than 1
                    while (Quantity < 1) {
                        System.out.println(" |    -----------------    |" + "\n"
                                       +   " | quantity must be above 0|" + "\n"
                                       +   " |    (Please try again)   |" + "\n"
                                       +   " |    -----------------    |" + "\n"
                                       +" |       Quintity: ");
                        Quantity = sc.nextInt();
                    }
                    Cart(sc ,item,type, Measure,Quantity);
                    break;
                    
                case 'D': item = "Water pipes";   break;
                case 'E': item = "Water filters"; break;
                case 'F': item = "Tools";         break;
                case 'S':                         break;
                default:
                    System.out.println(" |-------------------------|" + "\n"
                                     + " |      (Wrong Choice)     |" + "\n" 
                                     + " |     Please try again    |");
            
            }//View Switch
            
            System.out.println(" \\-------------------------/" + "\n");
        
        }//while
        
    }//View Method
    
    
    //-------------------------------------------------------------------
    //------------------------------(Cart)-------------------------------
    //-------------------------------------------------------------------
    public void Cart(Scanner sc ,String item,String type, int Measure,int Quantity){
        
        System.out.print(" |-------------------------|" + "\n"
                       + " |     A -- Add To Cart    |" + "\n"
                       + " |     C -- Cancel         |" + "\n"
                       + " |    -----------------    |" + "\n"
                       + " |     Your Choice: ");
        char FMC = sc.next().toUpperCase().charAt(0);

        switch (FMC) {
            
            //------------------(Add to Cart)-------------------
            case 'A':
                Product p = new Product(UserProducts.size(),item, type, Measure, Quantity);
                UserProducts.add(p);
                System.out.println(" |    -----------------    |" + "\n"
                                 + " |  Product Successfully   | " + "\n"
                                 + " |     added to cart       |");
                break;
                
            //--------------------(Cancel)---------------------
            case 'C':
                break;
        }
        for (int i = 0; i < UserProducts.size(); i++) {
            System.out.println("P: " + UserProducts.get(i).getproductNum());
        }
        
        
    }//Cart Method
    
    
    //-------------------------------------------------------------------
    //-----------------------------(Detail)------------------------------
    //-------------------------------------------------------------------
    public void Details(){
        System.out.println(" |-------------------------|" + "\n"
                         + " |      Order Detalis      |" + "\n"
                         + " |-------------------------|");
        //If Order not empty
        if (!Order.getProudcts().isEmpty()) {  
            
            //Order Info
            System.out.println(" | Order No: " + orderNum + "          |");
            System.out.println(" |     Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + "      |");

            //Every product in the order 
            for (int i = 0; i < UserProducts.size(); i++) {
                if (!UserProducts.isEmpty()) {
                    System.out.println(" |-------------------------|");
                    System.out.println(" |    - Product No: " + UserProducts.get(i).getproductNum());
                    System.out.println(" |    - Product:   " + UserProducts.get(i).getItemName());
                    System.out.println(" |    - Type:      " + UserProducts.get(i).getItemType());
                    System.out.println(" |    - Mesurement: " + UserProducts.get(i).getItemMesure());
                    System.out.println(" |    - Quintity:   " + UserProducts.get(i).getItemQuintity());
                }
            }
            
        }//if
        
        //If order Empty
        else {
            System.out.println(" |    (No current Order)   |");
            System.out.println(" |-------------------------|");
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

    //-------------------------------------------------------------------
    //-----------------------------(Cancel)------------------------------
    //-------------------------------------------------------------------
    public void Cancel() {
        
        if(UserProducts.size() < 1){
            System.out.println(" |-------------------------|");
            System.out.println(" |    No Order to cancel   |");
            System.out.println(" \\-------------------------/\n");
        }
        else{
            for (int i = 0; i < UserProducts.size(); i++) {
                UserProducts.clear();
            }
        
            System.out.println(" |-------------------------|");
            System.out.println(" |  Your Order is Canceled |");
            System.out.println(" \\-------------------------/\n");
        }
        
    }
}
