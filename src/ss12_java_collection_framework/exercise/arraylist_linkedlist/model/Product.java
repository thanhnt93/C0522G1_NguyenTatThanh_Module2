package ss12_java_collection_framework.exercise.arraylist_linkedlist.model;

public class Product {
    private int productID;
    private String productName;
    private String productInformation;
    private int price;

    private int count = 0;

    public Product() {
    }

    public Product(int productID, String productName, String productInformation, int price) {
        this.productID = productID;
        this.productName = productName;
        this.productInformation = productInformation;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sản phẩm { " +
                "ID Sản phẩm: " + productID +
                ", Tên sản phẩm: " + productName +
                ", Thông tin sản phẩm: " + productInformation +
                ", Giá tiền: " + price +
                " }";
    }
}
