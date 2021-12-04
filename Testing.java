
import static OrderingSystem.CheckOut.InvoiceCalculation;
import OrderingSystem.Order;
import OrderingSystem.Product;
import OrderingSystem.View_Add;
import static OrderingSystem.Washnah.UserProducts;
import static OrderingSystem.CheckOut.OrderCheckOut;
import static OrderingSystem.CheckOut.PrintInvoice;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
        
    public Testing() {
    }
    /*----------------------------------------------------------------------
    ------------------------------------------------------------------------
                                   Sprint 3
    ------------------------------------------------------------------------
    ----------------------------------------------------------------------*/
    
    /*----------------------------------------------------------------------
                                Test CheckOut Methods
                            (Use Case: Complete Checkout)
    ----------------------------------------------------------------------*/
    @Test
    public void TestCheckOut(){
        
        System.out.println(" /-------------------------\\");
        System.out.println(" |         CheckOut        |");
        System.out.println(" |-------------------------|");
                
        //Method to Transfer Product into Price
        InvoiceCalculation("Rod","Metal",1,1);               
        
        //Result & Expected Result
        int result =  OrderCheckOut.get(0);
        int expResult = 12;
        
        //Print Result
        System.out.println("     Check out result: " + OrderCheckOut.get(0));
        
        //Test CheckOut
        assertEquals(expResult, result);
        
        //Design Output
        System.out.println(" \\-------------------------/" + "\n");
    }
    
    /*----------------------------------------------------------------------
                              Test PrintInvoicement
                            (Use Case: Print Inovice)
    ----------------------------------------------------------------------*/
    @Test
    public void TestPrintInvoicement(){
        
        System.out.println(" /-------------------------\\");
        System.out.println(" |     PrintInvoicement    |");
                
        //Method to Transfer Product into Price
        PrintInvoice();               
        
        //Design Output
        System.out.println(" \\-------------------------/" + "\n");
    }
    
    /*----------------------------------------------------------------------
    ------------------------------------------------------------------------
                                   Sprint 2
    ------------------------------------------------------------------------
    ----------------------------------------------------------------------*/
    
    /*----------------------------------------------------------------------
                Test Add Product Method (Use Case: View Categories)
    ----------------------------------------------------------------------*/
    @Test
    public void TestCartAdd(){
                
        System.out.println(" /-------------------------\\");
        System.out.println(" |       Test CartAdd      |");
        System.out.println(" |-------------------------|");
        
        //Use CartAdd Method
        View_Add.CartAdd("Rod", "Metal", 1, 1);
        
        System.out.println(" \\-------------------------/" + "\n");

    }
    
    /*----------------------------------------------------------------------
                            Test Display Method 
                (Use Case: Manage Product, Display Product)
    ----------------------------------------------------------------------*/
    @Test
    public void TestDisplayProduct(){        
        
        System.out.println(" /-------------------------\\");
        System.out.println(" |      DisplayProduct     |");
        
        //Use Display Method
        UserProducts.get(0).Display();
        
    }
    
    /*----------------------------------------------------------------------
                                Test Add Method 
                    (Use Case: Manage Product, Add Product)
    ----------------------------------------------------------------------*/
    @Test
    public void TestAddProduct(){
        
        System.out.println(" /-------------------------\\");
        System.out.println(" |        AddProduct       |");
        System.out.println(" |-------------------------|");
                
        //Add Product
        UserProducts.add(new Product(1,"Rod","Metal",1,1));        
        
        //Use Add Method
        UserProducts.get(1).Add(2, 1);
        
        //Result & Expected Result
        int result = UserProducts.get(1).getItemQuintity();
        int expResult = 2;
        
        //Test Add Method
        assertEquals(expResult, result);
        
        //Design Output
        System.out.println(" \\-------------------------/" + "\n");
    }
    
    /*----------------------------------------------------------------------
                            Test Remove Method 
                (Use Case: Manage Product, Remove Product)
    ----------------------------------------------------------------------*/
    @Test
    public void TestRemoveProduct(){
        
        System.out.println(" /-------------------------\\");
        System.out.println(" |      RemoveProduct      |");
        System.out.println(" |-------------------------|");
                        
        //Remove Product
        UserProducts.add(new Product(0,"Tank","Water Tank",3,4));        
        
        //Use Remove Method
        UserProducts.get(0).Remove(1, 1);
        
        //Result & Expected Result
        int result = UserProducts.get(0).getItemQuintity();
        int expResult = 3;
        
        //Test Remove Method
        assertEquals(expResult, result);
        
        //Design Output
        System.out.println(" \\-------------------------/" + "\n");
    }
    
    /*----------------------------------------------------------------------
                        Test Order Details Method 
                (Use Case: Manage Order, View Order Details)
    ----------------------------------------------------------------------*/
    @Test
    public void TestViewOrderDetails(){
        
        System.out.println(" /-------------------------\\");
        System.out.println(" |    ViewOrderDetails     |");
        
        //Make Object
        Order order = new Order(UserProducts);
        
        //Use Details Method
        order.Details();
        
        //Design Output
        System.out.println(" \\-------------------------/" + "\n");
        
    }
    
    /*----------------------------------------------------------------------
                            Test Order History Method 
                    (Use Case: Manage Order, View Order History)
    ----------------------------------------------------------------------*/
    @Test
    public void TestOrderHistory(){
                
        System.out.println(" /-------------------------\\");
        System.out.println(" |       OrderHistory      |");
        
        //Make Object
        Order order = new Order(UserProducts);
        
        //Use History Method
        order.History();
        
        //Design Output
        System.out.println(" \\-------------------------/" + "\n");
        
    }
    
    /*---------------------------------------------------------------
                      Test Cancel Order Method        
                (Use Case: Manage Order, Cancel Order)
    ---------------------------------------------------------------*/
    //This method Cancel the Order so that there is nothing left to display, causing an error in Disply Method.
    //Comment TestDisplayProduct to see this test
//    @Test
//    public void TestCancelOrder(){
//        
//        //Make Object
//        Order order = new Order(UserProducts);
//        
//        //Use cancel Method
//        order.Cancel();
//        
//        //Result & Expected Result
//        int result = UserProducts.size();
//        int expResult = 0;
//        
//        //Test Remove Method
//        assertEquals(expResult, result);
//    }
    
}
