//class Product {
//    private int productID;
//    private String productName;
//
//    // Конструктор
//    public Product(int productID, String productName) {
//        this.productID = productID;
//        this.productName = productName;
//    }
//
//    // Геттер для ID
//    public int getProductID() {
//        return productID;
//    }
//
//    // Геттер для имени
//    public String getProductName() {
//        return productName;
//    }
//}
class Product {
    private String productName;

    // Конструктор
    public Product(String productName) {
        this.productName = productName;
    }

    // Геттер для productName
    public String getProductName() {
        return productName;
    }

    // Сеттер для productName
    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }
}
