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
//class Product {
//    private String productName;
//
//    // Конструктор
//    public Product(String productName) {
//        this.productName = productName;
//    }
//
//    // Геттер для productName
//    public String getProductName() {
//        return productName;
//    }
//
//    // Сеттер для productName
//    public void setProductName(String newProductName) {
//        this.productName = newProductName;
//    }
//}
//class Product {
//
//    String name;
//    int price;
//
//    public Product(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return name + " | price: " + price;
//    }
//}
//record Product(String name, double price) {
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Product other)) return false;
//        return name.equals(other.name); // сравниваем ТОЛЬКО название
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode(); // хеш только по названию
//    }
//}
//public class Product {
//    private String productName;
//
//    public Product(String productName) {
//        this.productName = productName;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//}
//public class Product {
//
//    // 🔒 Скрытое поле — напрямую извне недоступно
//    private double productPrice;
//
//    // 📖 Геттер (получить цену)
//    public double getPrice() {
//        return productPrice;
//    }
//
//    // ✏️ Сеттер (установить цену)
//    public void setPrice(double productPrice) {
//        this.productPrice = productPrice;
//    }
//}
//class Product {
//
//    // 1️⃣ Статические поля
//    static int totalProductCount = 0;
//
//    // 2️⃣ Обычные поля
//    private String productName;
//
//    // 3️⃣ Конструктор
//    public Product(String productName) {
//        this.productName = productName;
//        totalProductCount++;
//    }
//
//    // 4️⃣ Методы
//    public String getProductName() {
//        return productName;
//    }
//}