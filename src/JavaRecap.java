public class JavaRecap {

    public static void main(String[] args){
        //variable

        int quantity = 10;
        double price = 19.99;
        String name = "Laptop";
        boolean instock = true;

        double total = calculateTotal(quantity,price);
        System.out.println("name:" + name + "total: " + total);

        System.out.printf("%.3f", total);

        //instanciate the object
        Product p1 = new Product(1L, "Laptop", 999.99);

        Product p2 = new Product(2L, "Headphones", 49.99);

        System.out.println(p1.name);

        System.out.println(p2.name);
    }

    public static double calculateTotal(int qty, double unitPrice){
        return qty * unitPrice;
    }

}
