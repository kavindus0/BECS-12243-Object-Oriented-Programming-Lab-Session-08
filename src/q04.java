public class q04 {
    public static void main(String[] args) {
        q04 newObj = new q04();
        newObj.product("Saman",2000,0.25);

    }
    String name;
    double price;
    double discount_percentage;

    public void product(String name, double price, double discount_percentage) {
        this.name = name;
        this.price = price;
        this.discount_percentage = discount_percentage;
        System.out.println(this.price*(1-discount_percentage));
    }

}
