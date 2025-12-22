class Product {
    double price;
    double getDiscount() {
        return 0;
    }
}

class Electronics extends Product {
    double getDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    double getDiscount() {
        return price * 0.20;
    }
}

class ShoppingCart {
    public static void main(String[] args) {
        Product p;

        p = new Electronics();
        p.price = 10000;
        System.out.println("Electronics Discount: " + p.getDiscount());

        p = new Clothing();
        p.price = 2000;
        System.out.println("Clothing Discount: " + p.getDiscount());
    }
}
