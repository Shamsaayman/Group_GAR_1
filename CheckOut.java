
package OrderingSystem;

//Import
import java.util.ArrayList;
import java.util.Scanner;
import static OrderingSystem.Washnah.UserProducts;


public class CheckOut {
    
    //OrderPrice Array
    public static ArrayList<Integer> OrderCheckOut = new ArrayList<Integer>();
    
    //Scanner
    Scanner sc = new Scanner(System.in);
    
    //-------------------------------------------------------------------
    //-------------------------(Constructor)-----------------------------
    //-------------------------------------------------------------------
    public CheckOut() {
        
    }
    
    //-------------------------------------------------------------------
    //-----------------------------(HomePage)----------------------------
    //-------------------------------------------------------------------
    public void CheckOutMethod(){
        
        while (true) {
            System.out.print(" |-------------------------|\n"
                           + " |        Check Out        |\n"
                           + " |-------------------------|\n");

            //Is there Order to Check Out ?
            if (!OrderCheckOut.isEmpty()) {
                
                //Choose Payment Method
                System.out.print(" |A - Credit Card, B - Cash|\n"
                               + " | Choice Payment Method: ");
                char PayMethod = sc.next().toUpperCase().charAt(0);

                //--------------------Paypal--------------------
                if (PayMethod == 'A') {

                    //----------Get Card Number----------
                    System.out.print(" |-------------------------|\n"
                                   + " | Enter the Card Number:  |\n"
                                   + " |    ");
                    String CardNo = sc.next();
                    
                    //Check Conditions
                    CardNo = CheckCard(CardNo);

                    //--------------Get CVV--------------
                    System.out.print(" |    -----------------    |\n"
                                   + " |    Enter the CVV: ");
                    String CVV = sc.next();
                    
                    //Check Conditions
                    CVV = CheckCVV(CVV);
                    
                    //Message 
                    System.out.println(" |    -----------------    |\n"
                                     + " |         Thank You       |\n"
                                     + " |  Your Order is Underway |");
                    
                    //Print Invoicement
                    System.out.print(" |-------------------------|\n"
                                   + " |  1 -- Yes  ,  2 -- No   |\n"
                                   + " | Want to Print Invoice: ");
                    int Choice = sc.nextInt();
                    
                    //Want to print
                    if (Choice == 1) {
                        PrintInvoice();
                    } 

                    
                    //Break the Infinite loop
                    break;
                } 

                //---------------------Cash---------------------
                else if (PayMethod == 'B') {

                    //Message 
                    System.out.println(" |    -----------------    |\n"
                                     + " |         Thank You       |\n"
                                     + " |  Your Order is Underway |");
                    
                    //Print Invoicement
                    System.out.print(" |-------------------------|\n"
                                   + " |  1 -- Yes  ,  2 -- No   |\n"
                                   + " | Want to Print Invoice: ");
                    int Choice = sc.nextInt();
                    
                    //Want to print
                    if (Choice == 1) {
                        PrintInvoice();
                    } 
                    //Break the Infinite loop
                    break;
                }
                
                //-----------------Wrong Choice-----------------
                else {
                    System.out.println(" |-------------------------|\n"
                                     + " |      (Wrong Choice)     |\n"
                                     + " |    Please try again     |");
                }
                
            }
            
            //if Order is empty
            else {
                System.out.println(" |  No Order to Chect Out  |\n");
                
                //Break the Infinite loop
                break;
            }
        }

    }
    
    //-------------------------------------------------------------------
    //----------------------------(Calculate)----------------------------
    //-------------------------------------------------------------------
    public static void InvoiceCalculation(String item, String type, int measure, int quantity){

        int typeM = 0;
        int measureM = 0;
        int Total = 0;
          //Calculation
        switch (item) {
            
            //-------------------- Rod --------------------
            case "Rod":
                
                //Rod Type
                switch(type){
                    case "Metal":
                        typeM = 10;
                        break;
                    case "Steel": 
                        typeM = 8;
                        break;
                    case "wood":
                        typeM = 6;
                        break;
                    case "Plastic":
                        typeM = 4;
                        break;
                }
                
                //Rod Measure
                switch(measure){
                    case 1:
                        measureM = 2;
                        break;
                    case 2: 
                        measureM = 4;
                        break;
                    case 3:
                        measureM = 6;
                        break;
                    case 4:
                        measureM = 8;
                        break;
                    case 5:
                        measureM = 10;
                        break;
                }
                
                break;
                
                
            //-------------------- Tank -------------------- 
            case "Tank":

                //Tank Type
                switch(type){
                    case "Water Tank":
                        typeM = 10;
                        break;
                    case "Slimline Tank": 
                        typeM = 15;
                        break;
                }
                
                //Tank Measure
                switch(measure){
                    case 1:
                        measureM = 10;
                        break;
                    case 2: 
                        measureM = 13;
                        break;
                    case 3:
                        measureM = 15;
                        break;
                    case 4:
                        measureM = 20;
                        break;
                }
                
                break;
                
            
            //-------------------- Water --------------------
            case "Water":
                
                //Tank Type
                switch(type){
                    case "Water Pipes":
                        typeM = 15;
                        break;
                    case "Water Filters": 
                        typeM = 10;
                        break;
                }
                
                //Tank Measure
                switch(measure){
                    case 1:
                        measureM = 5;
                        break;
                    case 2: 
                        measureM = 7;
                        break;
                    case 3:
                        measureM = 10;
                        break;
                    case 4:
                        measureM = 20;
                        break;
                }
                
                break;
                
        }
        
        Total = (typeM + measureM) * quantity;
        
        OrderCheckOut.add(Total);
    }
    
    
    //-------------------------------------------------------------------
    //---------------------- -(Print Invoicement)------------------------
    //-------------------------------------------------------------------
    public static void PrintInvoice(){
        
        //Print 
        System.out.println(" |-------------------------|\n"
                         + " |    Print Invoicement    |\n"
                         + " |-------------------------|\n"
                         + " |ID|Name |   Type  |S|Q|Pr|");
        
        //Total bill
        int bill = 0;
        
        //Add each product bill
        for (int i = 0; i < OrderCheckOut.size(); i++) {
            
            //Print Product details
            System.out.printf (" |%2d|%-5.5s|%-9.9s|%1d|%1d|%2d|", UserProducts.get(i).getproductNum(), UserProducts.get(i).getItemName(),
                                         UserProducts.get(i).getItemType()  , UserProducts.get(i).getItemMesure(),
                                         UserProducts.get(i).getItemQuintity(), OrderCheckOut.get(i));
            System.out.println();
            
            //Calculate Total bill
            bill = bill + OrderCheckOut.get(i);
        }
        
        //Print Total bill
        System.out.println(" |     ---------------     |\n"
                         + " |      Total Bill: " + bill + "     |");
        
    }
    
    //-------------------------------------------------------------------
    //----------------------------(Check Card)---------------------------
    //-------------------------------------------------------------------
    
    public String CheckCard(String CardNo){
        
        //Loop all the card String
        for (int i = 0; i < CardNo.length(); i++) {
            
            //Check (is Digit)
            if(!Character.isDigit(CardNo.charAt(i))){
                System.out.print(" |    -----------------    |\n" 
                                 + " |   Must be only Digits   |\n"
                                 + " |-------------------------|\n"
                                 + " | Enter the Card Number:  |\n"
                                 + " |    ");
                CardNo = sc.next();
                i = 0;
            }
            
            
            //Checl (Length)
            if(!(CardNo.length() == 16)){
                System.out.print(" |    -----------------    |\n" 
                                 + " |    Must be 16 Digits    |\n"
                                 + " |-------------------------|\n"
                                 + " | Enter the Card Number:  |\n"
                                 + " |    ");
                CardNo = sc.next();
                i = 0;
            }
        }
        
        return CardNo;
    }
    
    
    //-------------------------------------------------------------------
    //-----------------------------(Check CVV)---------------------------
    //-------------------------------------------------------------------
    public String CheckCVV(String CVV){
        
        //Loop all CVV
        for (int i = 0; i < CVV.length(); i++) {
            
            //Check (is Digit)
            if(!Character.isDigit(CVV.charAt(i))){
                System.out.print(" |    -----------------    |\n" 
                               + " | CVV Must be only Digits |\n"
                               + " |-------------------------|\n"
                               + " |    Enter the CVV: ");
                CVV = sc.next();
                i = 0;
            }
            
            //Check (Length)
            if(!(CVV.length() == 3)){
                System.out.print(" |    -----------------    |\n" 
                               + " |   CVV Must be 3 Digits  |\n"
                               + " |-------------------------|\n"
                               + " |    Enter the CVV: ");
                CVV = sc.next();
                i = 0;
            }
            
        }
        
        return CVV;
    }
}
