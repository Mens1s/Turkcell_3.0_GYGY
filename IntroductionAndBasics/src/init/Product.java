package init;

public class Product {
    // CTORs
    public Product(){
        System.out.println("init.Product no-arg constructor called!");
    }
    public Product(String name, double unitPrice, boolean onSale, double salePercentage){
        this.name = name;
        this.unitPrice = unitPrice;
        this.onSale = onSale;
        this.salePercentage = salePercentage;
    }
    // Encapsulation
    private String name;
    private double unitPrice;
    private boolean onSale;
    private double salePercentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public double getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(double salePercentage) {
        this.salePercentage = salePercentage;
    }

    public void Buy(){
        System.out.println(name + "init.Product bought!");
    }
}
