/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package washnahorder;

import java.util.Date;


public class Order {
 private int orderNum;
 private Product[] proudcts;
 private Date date;

    public Order() {
    }

    public Order(Product[] proudcts) {
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

    public Product[] getProudcts() {
        return proudcts;
    }

    public void setProudcts(Product[] proudcts) {
        this.proudcts = proudcts;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
 
}
