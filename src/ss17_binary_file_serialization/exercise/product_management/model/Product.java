package ss17_binary_file_serialization.exercise.product_management.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productCode;
    private String productName;
    private String manufacturer;
    private int price;
    private String otherDescription;

    public Product() {
    }

    public Product(int productCode, String productName, String manufacturer, int price, String otherDescription) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s\n", this.getProductCode(), this.getProductName(), this.getManufacturer(), this.getPrice(), this.getOtherDescription());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", otherDescription='" + otherDescription + '\'' +
                '}';
    }
}
