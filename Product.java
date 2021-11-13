
package washnahorder;


public class Product {
    private int productNum;
    private String itemName;
    private String itemType;
    private int itemMesure;
    private int itemQuintity;

    public Product() {
    }

    public Product(int orderNum, String itemName, String itemType, int itemMesure, int itemQuintity) {
        this.productNum = orderNum;
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
    
    
    
    
}
