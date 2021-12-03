
package OrderingSystem;

import static OrderingSystem.CheckOut.InvoiceCalculation;
import static OrderingSystem.Washnah.UserProducts;
import java.util.Scanner;

public class View_Add {
    
    //-------------------------------------------------------------------
    //----------------------------(Home Page)----------------------------
    //-------------------------------------------------------------------
    public void ViewCategories(){
        Scanner sc = new Scanner(System.in);
        char view = '-';
        
        while (!(view == 'E')) {
            System.out.print(" /-------------------------\\" + "\n"
                           + " |        Categories       |" + "\n"
                           + " |-------------------------|" + "\n"
                           + " |        A -- Rod         |" + "\n"
                           + " |        B -- Tank        |" + "\n"
                           + " |        C -- Water       |" + "\n"
                           + " |        E -- Exit        |" + "\n"
                           + " |    -----------------    |" + "\n"
                           + " |      Your Choice: ");
            view = sc.next().toUpperCase().charAt(0);
            String item = "";

            //switch 
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
                                   + " |    M -- Metal   (10$)   |" + "\n"
                                   + " |    S -- Steel    (8$)   |" + "\n"
                                   + " |    W -- Wood     (6$)   |" + "\n"
                                   + " |    P -- Plastic  (4$)   |" + "\n"
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
                                   + " |     1 -- 1m    (2$)     |" + "\n"
                                   + " |     2 -- 2m    (4$)     |" + "\n"
                                   + " |     3 -- 3m    (6$)     |" + "\n"
                                   + " |     4 -- 4m    (8$)     |" + "\n"
                                   + " |     5 -- 5m   (10$)     |" + "\n"
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
                    
                    
                    //------------------ Adding to Cart -------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |     A -- Add To Cart    |" + "\n"
                                   + " |     C -- Cancel         |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     Your Choice: ");
                    char FMC = sc.next().toUpperCase().charAt(0);
        
                    //Confirm Adding
                    if(FMC == 'A'){
                        CartAdd(item, type, Measure, Quantity);
                        InvoiceCalculation(item, type, Measure, Quantity);
                    }
                    //Cancel Adding
                    else{
                        System.out.println(" |    -----------------    |" + "\n"
                                         + " |     No Product Added    | ");
                    }
                    
                    System.out.println(" \\-------------------------/" + "\n");
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
                                   + " | W -- Water Tank    (10$)|" + "\n"
                                   + " | S -- Slimline Tank (15$)|" + "\n"
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
                                   + " |    1 -- 600L    (10$)   |" + "\n"
                                   + " |    2 -- 800L    (13$)   |" + "\n"
                                   + " |    3 -- 1000L   (15$)   |" + "\n"
                                   + " |    4 -- 1500L   (20$)   |" + "\n"
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
                    
                    
                    //------------------ Adding to Cart -------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |     A -- Add To Cart    |" + "\n"
                                   + " |     C -- Cancel         |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     Your Choice: ");
                    FMC = sc.next().toUpperCase().charAt(0);
        
                    //Confirm Adding
                    if(FMC == 'A'){
                        CartAdd(item, type, Measure, Quantity);
                        InvoiceCalculation(item, type, Measure, Quantity);
                    }
                    //Cancel Adding
                    else{
                        System.out.println(" |    -----------------    |" + "\n"
                                         + " |     No Product Added    | ");
                    }
                    
                    System.out.println(" \\-------------------------/" + "\n");
                    break;
                    
                
                //--------------------------(Water)-----------------------
                case 'C':
                    item = "Water";
                    
                    //-----------------------(Type)-----------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |          TYPES          |" + "\n"
                                   + " |-------------------------|" + "\n"
                                   + " |          Water          |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " | P -- Water Pipes   (15$)|" + "\n"
                                   + " | F -- Water Filters (10$)|" + "\n"
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
                            + " |     1 -- 15mm    (5$)   |" + "\n"
                            + " |     2 -- 20mm    (7$)   |" + "\n"
                            + " |     3 -- 25mm   (10$)   |" + "\n"
                            + " |     4 -- 50mm   (20$)   |" + "\n"
                            + " |    ------------------   |" + "\n"
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
                    
                    
                    //------------------ Adding to Cart -------------------
                    System.out.print(" |-------------------------|" + "\n"
                                   + " |     A -- Add To Cart    |" + "\n"
                                   + " |     C -- Cancel         |" + "\n"
                                   + " |    -----------------    |" + "\n"
                                   + " |     Your Choice: ");
                    FMC = sc.next().toUpperCase().charAt(0);
        
                    //Confirm Adding
                    if(FMC == 'A'){
                        CartAdd(item, type, Measure, Quantity);
                        InvoiceCalculation(item, type, Measure, Quantity);
                    }
                    //Cancel Adding
                    else{
                        System.out.println(" |    -----------------    |" + "\n"
                                         + " |     No Product Added    | ");
                    }
                    
                    
                    System.out.println(" \\-------------------------/" + "\n");
                    
                    break;
                    
                case 'E': 
                    System.out.println(" \\-------------------------/" + "\n");
                    break;
                default:
                    System.out.println(" |-------------------------|" + "\n"
                                     + " |      (Wrong Choice)     |" + "\n" 
                                     + " |     Please try again    |");
            
            }//View Switch
            
        
        }//while
        
    }//View Method
    
    
    //-------------------------------------------------------------------
    //----------------------------(CartAdd)-------------------------------
    //-------------------------------------------------------------------
    public static void CartAdd(String item,String type, int Measure,int Quantity){
        
        Product p = new Product(UserProducts.size(), item, type, Measure, Quantity);
        UserProducts.add(p);
        System.out.println(" |    -----------------    |" + "\n"
                         + " |  Product Successfully   | " + "\n"
                         + " |     added to cart       |");          
        
    }//Cart Method
    
}
