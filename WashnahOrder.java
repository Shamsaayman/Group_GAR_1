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
    static String[][] OrdersHistory = {{"#3678", "7-9-2020", "Rod", "Wood", "3m", "4"}, {"#8795", "10-1-2020", "Tank", "Slimline Tank", "1000L", "1"}};
    static int numOfProduct = 0;
    static int numOfOrder = 0;
    static Product[] UserProducts = new Product[10];
    //static int Quintity;

    public static void main(String[] args) throws FileNotFoundException {

        //Take Info. From Users
        Scanner sc = new Scanner(System.in);
        //------------------------------------------------------------------------------------------------------
        //-----------------------------------(view categories)--------------------------------------------------
        //------------------------------------------------------------------------------------------------------
        char Ch1 = '-';
        char view = ' ';
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

            //Rod Item
            switch (view) {
                case 'A':
                    item = "Rod";
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
                        case 'M':
                            type = "Metal";
                            break;
                        case 'S':
                            type = "Steel";
                            break;
                        case 'W':
                            type = "Wood";
                            break;
                        case 'P':
                            type = "Plastic";
                            break;

                    }
                    if (!(Type == 'M' || Type == 'S' || Type == 'W' || Type == 'P')) {
                        System.out.println(" |-------------------------|" + "\n"
                                + " |      (Wrong Choice)     |" + "\n" + "      Please try again");
                        break;
                    }

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
                    int Mesure = sc.nextInt();
                    if (!(0 < Mesure && Mesure < 6)) {
                        System.out.println(" |-------------------------|" + "\n"
                                + " |      (Wrong Choice)     |" + "\n" + "      Please try again");
                        break;
                    }

                    System.out.print(" |    -----------------    |" + "\n"
                            + " |       Quintity: ");

                    int Quintity = sc.nextInt();
                    while (Quintity < 1) {

                        System.out.println(" |-------------------------|" + "\n"
                                + "\n||quantity must to be above  ||"
                                + "\n||zero to add it to the cart!||" + "\n" + "      (Please try again)");

                        System.out.print("\n"
                                + " |       Quintity: ");
                        Quintity = sc.nextInt();

                    }

                    System.out.print(" |    -----------------    |" + "\n"
                            + " |      A -- Add To Cart   |" + "\n"
                            + " |      C -- Cancel        |" + "\n"
                            + " |    -----------------    |" + "\n"
                            + " |     Your Choice: ");
                    char FMC = sc.next().toUpperCase().charAt(0);

                    switch (FMC) {
                        case 'A':
                            UserProducts[numOfProduct] = new Product((numOfProduct + 1), item, type, Mesure, Quintity);
                            numOfProduct++;
                            System.out.println("   Product Successfully "
                                    + "\n       added to cart");
                            break;
                        case 'C':
                            break;
                    }
                    break;

                case 'B':
                    item = "Tank";
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
                        case 'W':
                            type = "Water Tank";
                            break;
                        case 'S':
                            type = "Slimline Tank";
                            break;

                    }
                    if (!(Type == 'W' || Type == 'S')) {
                        System.out.println(" |-------------------------|" + "\n"
                                + " |      (Wrong Choice)     |" + "\n" + "      Please try again");
                        break;
                    }

                    System.out.print(" |-------------------------|" + "\n"
                            + " |         MESURMENT       |" + "\n"
                            + " |-------------------------|" + "\n"
                            + " |       1 -- 600L         |" + "\n"
                            + " |       2 -- 800L         |" + "\n"
                            + " |       3 -- 1000L        |" + "\n"
                            + " |       4 -- 1500L        |" + "\n"
                            + " |    -----------------    |" + "\n"
                            + " |     Your Choice: ");
                    Mesure = sc.nextInt();
                    if (!(0 < Mesure && Mesure < 5)) {
                        System.out.println(" |-------------------------|" + "\n"
                                + " |      (Wrong Choice)     |" + "\n" + "      Please try again");
                        break;
                    }

                    System.out.print(" |    -----------------    |" + "\n"
                            + " |       Quintity: ");

                    Quintity = sc.nextInt();
                    while (Quintity < 1) {

                        System.out.println(" |-------------------------|" + "\n"
                                + "\n||quantity must to be above  ||"
                                + "\n||zero to add it to the cart!||" + "\n" + "      (Please try again)");

                        System.out.print("\n"
                                + " |       Quintity: ");
                        Quintity = sc.nextInt();

                    }

                    System.out.print(" |    -----------------    |" + "\n"
                            + " |      A -- Add To Cart   |" + "\n"
                            + " |      C -- Cancel        |" + "\n"
                            + " |    -----------------    |" + "\n"
                            + " |     Your Choice: ");
                    FMC = sc.next().toUpperCase().charAt(0);

                    switch (FMC) {
                        case 'A':
                            UserProducts[numOfProduct] = new Product((numOfProduct + 1), item, type, Mesure, Quintity);
                            numOfProduct++;
                            System.out.println("   Product Successfully "
                                    + "\n       added to cart");
                            break;
                        case 'C':
                            break;
                    }
                    break;
                case 'C':
                    item = "Water";
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
                        case 'P':
                            type = "Water Pipes";
                            break;
                        case 'F':
                            type = "Water Filters";
                            break;

                    }
                    if (!(Type == 'P' || Type == 'F')) {
                        System.out.println(" |-------------------------|" + "\n"
                                + " |      (Wrong Choice)     |" + "\n" + "      Please try again");
                        break;
                    }

                    System.out.print(" |-------------------------|" + "\n"
                            + " |         MESURMENT       |" + "\n"
                            + " |-------------------------|" + "\n"
                            + " |  1 -- 15mm (1/2 inch)   |" + "\n"
                            + " |  2 -- 20mm (3/4 inch)   |" + "\n"
                            + " |  3 -- 25mm (1 inch)     |" + "\n"
                            + " |  4 -- 50mm (2 inch)     |" + "\n"
                            + " |    -----------------    |" + "\n"
                            + " |     Your Choice: ");
                    Mesure = sc.nextInt();
                    if (!(0 < Mesure && Mesure < 5)) {
                        System.out.println(" |-------------------------|" + "\n"
                                + " |      (Wrong Choice)     |" + "\n" + "      Please try again");
                        break;
                    }

                    System.out.print(" |    -----------------    |" + "\n"
                            + " |       Quintity: ");

                    Quintity = sc.nextInt();
                    while (Quintity < 1) {

                        System.out.println(" |-------------------------|" + "\n"
                                + "\n||quantity must to be above  ||"
                                + "\n||zero to add it to the cart!||" + "\n" + "      (Please try again)");

                        System.out.print("\n"
                                + " |       Quintity: ");
                        Quintity = sc.nextInt();

                    }

                    System.out.print(" |    -----------------    |" + "\n"
                            + " |      A -- Add To Cart   |" + "\n"
                            + " |      C -- Cancel        |" + "\n"
                            + " |    -----------------    |" + "\n"
                            + " |     Your Choice: ");
                    FMC = sc.next().toUpperCase().charAt(0);

                    switch (FMC) {
                        case 'A':
                            UserProducts[numOfProduct] = new Product((numOfProduct + 1), item, type, Mesure, Quintity);
                            numOfProduct++;
                            System.out.println("   Product Successfully "
                                    + "\n       added to cart");
                            break;
                        case 'C':
                            break;
                    }
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
                    System.out.println(" |-------------------------|" + "\n"
                            + " |      (Wrong Choice)     |" + "\n" + "      Please try again");
            }
            System.out.println(" \\-------------------------/" + "\n");

        }

        Order order = new Order(UserProducts);

        //------------------------------------------------------------------------------------------------------
        //-----------------------------------(Manage Product&Order)---------------------------------------------
        //------------------------------------------------------------------------------------------------------
        while (!(Ch1 == 'E')) {
            System.out.print("\n /-------------------------\\" + "\n"
                    + " |        Home Page        |" + "\n"
                    + " |-------------------------|" + "\n"
                    + " |   P -- Manage Product   |" + "\n"
                    + " |   O -- Manage Order     |" + "\n"
                    + " |   E -- Exit             |" + "\n"
                    + " |    -----------------    |" + "\n"
                    + " |      Your Choice: ");
            Ch1 = sc.next().toUpperCase().charAt(0);
            System.out.println(" \\-------------------------/" + "\n");

            //Manage Product
            if (Ch1 == 'P') {
                System.out.print(" |-------------------------|" + "\n"
                        + " |       Manage Product    |" + "\n"
                        + " |-------------------------|" + "\n"
                        + " |      D -- Display       |" + "\n"
                        + " |      A -- Add           |" + "\n"
                        + " |      R -- Remove        |" + "\n"
                        + " |    -----------------    |" + "\n"
                        + " |     Your Choice: ");

                char Ch3 = sc.next().toUpperCase().charAt(0);
                System.out.println(" |-------------------------|\n");

                //Display Choice
                if (Ch3 == 'D') {

                    System.out.print(" |-------------------------|" + "\n"
                            + " |         Display         |" + "\n"
                            + " |-------------------------|" + "\n");
                    
                    //Loop all Products
                    if (UserProducts[0] == null) {
                        System.out.println(" |  (your cart is empty!)  |");
                        System.out.println(" |-------------------------|\n");
                    } else {
                        for (int i = 0; i < UserProducts.length; i++) {
                            if (UserProducts[i] != null) {

                                //Display
                                //System.out.println(" |    -----------------    |");
                                System.out.println(" |  Product No:   " + UserProducts[i].getproductNum());
                                System.out.println(" |     Product:   " + UserProducts[i].getItemName());
                                System.out.println(" |        Type:   " + UserProducts[i].getItemType());
                                System.out.println(" |  Mesurement:   " + UserProducts[i].getItemMesure());
                                System.out.println(" |    Quintity:   " + UserProducts[i].getItemQuintity());
                                System.out.println(" |-------------------------");
                            }
                        }
                    }
                } //Add Product
                else if (Ch3 == 'A') {
                    
                    if(UserProducts[0] == null){
                            System.out.println(" |-------------------------|"  + "\n"
                                                 + " |        (No Order)       |");
                        }else{
                    System.out.print(" |---------------------------|" + "\n"
                            + " |              Add          |" + "\n"
                            + " |---------------------------|" + "\n"
                            + " | Enter product number and  | " + "\n"
                            + " | the amount of increase    | " + "\n"
                            + " |---------------------------|" + "\n"
                            + " |   Product No: ");
                    
                    
                    int Ch4 = sc.nextInt();
                    System.out.print(" |   amount of increase: ");
                    int amount = sc.nextInt();

                    //System.out.println(" |     Product No: "); 
                    for (int i = 0; i < UserProducts.length; i++) {
                        if (UserProducts[i].getproductNum() == Ch4) {
                            UserProducts[i].setItemQuintity((UserProducts[i].getItemQuintity() + amount));
                            System.out.println(" |    -----------------      |");
                            System.out.println(" |    Added Successfully     |");
                            System.out.println(" |    -----------------      |");
                            System.out.println(" |---------------------------|\n");
                            break;
                        }
                    }

                }} else if (Ch3 == 'R') {
                    
                    if(UserProducts[0] == null){
                            System.out.println(" |-------------------------|"  + "\n"
                                                 + " |        (No Order)       |");
                        }else{
                    System.out.print(" |---------------------------|" + "\n"
                            + " |            Remove         |" + "\n"
                            + " |---------------------------|" + "\n"
                            + " | Enter product number and  | " + "\n"
                            + " | the amount of decrease    | " + "\n"
                            + " |---------------------------|" + "\n"
                            + " |     Product No: ");
                    

                    int Ch5 = sc.nextInt();
                    System.out.print(" |   amount of decrease: ");
                    int amount = sc.nextInt();

                    for (int i = 0; i < UserProducts.length; i++) {
                        if (UserProducts[i].getproductNum() == Ch5) {
                            UserProducts[i].setItemQuintity((UserProducts[i].getItemQuintity() - amount));
                            System.out.println(" |    -----------------      |");
                            System.out.println(" |   Removed Successfully    |");
                            System.out.println(" |---------------------------|\n");
                            break;
                        }
                    }
                }} else {
                    System.out.println(" |-------------------------|" + "\n"
                            + " |      (Wrong Choice)     |");
                }

            } //-----------------------------------Manage Order-----------------------------------
            else if (Ch1 == 'O') {
                System.out.print(" |-------------------------|" + "\n"
                        + " |       Manage Order      |" + "\n"
                        + " |    -----------------    |" + "\n"
                        + " |    D -- Order Details   |" + "\n"
                        + " |    H -- Order History   |" + "\n"
                        + " |    C -- Cancel Order    |" + "\n"
                        + " |    -----------------    |" + "\n"
                        + " |     Your Choice: ");

                char Ch4 = sc.next().toUpperCase().charAt(0);
                System.out.println(" |-------------------------|");
                if (!(Ch4 == 'D' || Ch4 == 'H' || Ch4 == 'C')) {
                    System.out.println(" |-------------------------|" + "\n"
                            + " |      (Wrong Choice)     |");
                    break;
                }

                switch (Ch4) {
                    case 'D':                                            // AST 2021
                        System.out.println("\n\n |----------------------------------|");
                        System.out.print(" |          Order Detalis           |" + "\n"
                                + " |----------------------------------|" + "\n");

                        if (order.getProudcts()[0] != null) {

                            System.out.println(" | Order No:  " + order.getOrderNum());
                            System.out.println(" | Date: " + order.getDate());

                            //Loop all Products
                            for (int i = 0; i < UserProducts.length; i++) {
                                if (UserProducts[i] != null) {
                                    //Display
                                    System.out.println(" |    --------------------------    ");
                                    System.out.println(" |    - Product No: " + UserProducts[i].getproductNum());
                                    System.out.println(" |    - Product:   " + UserProducts[i].getItemName());
                                    System.out.println(" |    - Type:      " + UserProducts[i].getItemType());
                                    System.out.println(" |    - Mesurement: " + UserProducts[i].getItemMesure());
                                    System.out.println(" |    - Quintity:   " + UserProducts[i].getItemQuintity());
                                    System.out.println(" |    --------------------------    ");
                                }
                            }
                        } else {
                            System.out.println(" |       (No current Order)         |");
                            System.out.println(" |----------------------------------|\n");
                        }
                        break;
                    case 'H':
                        //display previuos order with details
                        System.out.print("\n |-------------------------|" + "\n"
                                + " |      Order History      |" + "\n"
                                + " |-------------------------|" + "\n");

                        for (int i = 0; i < OrdersHistory.length; i++) {
                            int r = 0;
                            //
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

                        break;
                    case 'C':
                        for (int i = 0; i < UserProducts.length; i++) {
                            UserProducts[i] = null;
                        }
                        System.out.println("\n /-------------------------\\");
                        System.out.println("   Your Order is Canceled ");
                        System.out.println(" \\-------------------------/\n");

                        break;
                }

            }else{

                   System.out.println(" |-------------------------|"  + "\n"
                                    + " |      (Wrong Choice)     |"+ "\n" + "       Please try again");
                    }
                    System.out.println(" \\-------------------------/" + "\n");   
            }

        }

    }


