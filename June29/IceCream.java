public class IceCream {
    String name="Cone icecream";
    double quantity = 100;
    String shape = "cone";
    double price = 25.00;
    IceCream(){
        System.out.println("IceCream const in running..");
    }
    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        System.out.println(iceCream.name);
        System.out.println(iceCream.quantity + " gm");
        System.out.println(iceCream.shape);
        System.out.println(iceCream.price);
    }
}
