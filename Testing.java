/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import washnah.Order;
import washnah.Product;
import washnah.Washnah;

/**
 *
 * @author hp
 */
public class Testing {
    
    public Testing() {
    }
        
    @Test
    public void TestDisplayProduct(){
        
        //Use Display Method
        Washnah.UserProducts.get(0).Display();
        Washnah.UserProducts.get(1).Display();
        System.out.println("\\-------------------------/" + "\n");
        
    }
    
    @Test
    public void TestAddProduct(){
        
        //Add Product
        Washnah.UserProducts.add(new Product(1,"Rod","Metal",1,1));        
        
        //Use Add Method
        Washnah.UserProducts.get(1).Add(1);
        
        //Result & Expected Result
        int result = Washnah.UserProducts.get(1).getItemQuintity();
        int expResult = 2;
        
        //Test Add Method
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestRemoveProduct(){
        
        //Remove Product
        Washnah.UserProducts.add(new Product(0,"Tank","Water Tank",3,4));        
        
        //Use Remove Method
        Washnah.UserProducts.get(0).remove(1);
        
        //Result & Expected Result
        int result = Washnah.UserProducts.get(0).getItemQuintity();
        int expResult = 3;
        
        //Test Remove Method
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestViewOrderDetails(){
        
        //Make Object
        Order order = new Order(Washnah.UserProducts);
        
        //Use Details Method
        order.Details();
        
    }
    
    @Test
    public void TestOrderHistory(){
        
        //Make Object
        Order order = new Order(Washnah.UserProducts);
        
        //Use History Method
        order.History();
        
    }
    
    //This method Cancel the Order so that there is nothing left to display, causing an error in Disply Method.
    /*
    @Test
    public void TestCancelOrder(){
        
        //Make Object
        Order order = new Order(Washnah.UserProducts);
        
        //Use cancel Method
        order.Cancel();
        
        //Result & Expected Result
        int result = Washnah.UserProducts.size();
        int expResult = 0;
        
        //Test Remove Method
        assertEquals(expResult, result);
    }
    */
}
