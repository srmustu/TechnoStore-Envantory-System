public class Notebook {
    private int id;
    private Brand brand;
    private String name;
    private String color;
    private int price;
    private int discountRate;
    private int stockQuantity;
    private int gbTypeMemory;
    private double screenSize;
    private int batterySize;
    private int gbTypeRam;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getGbTypeMemory() {
        return gbTypeMemory;
    }

    public void setGbTypeMemory(int gbTypeMemory) {
        this.gbTypeMemory = gbTypeMemory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getGbTypeRam() {
        return gbTypeRam;
    }

    public void setGbTypeRam(int gbTypeRam) {
        this.gbTypeRam = gbTypeRam;
    }

    public Notebook(int id, Brand brand, String name, String color, int price, int discountRate, int stockQuantity, int gbTypeMemory, double screenSize, int batterySize, int gbTypeRam) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.price = price;
        this.discountRate = discountRate;
        this.stockQuantity = stockQuantity;
        this.gbTypeMemory = gbTypeMemory;
        this.screenSize = screenSize;
        this.batterySize = batterySize;
        this.gbTypeRam = gbTypeRam;


    }
}
