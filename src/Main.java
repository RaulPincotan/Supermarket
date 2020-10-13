public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        supermarket.addToBasket("eggs");
        supermarket.addToBasket("bread");
        supermarket.addToBasket("cheese");
        supermarket.addToBasket("tomatoes");
        supermarket.addToBasket("eggs");

        System.out.println(supermarket.getShoppingBasket());
        supermarket.remove("tomatoes");
        System.out.println(supermarket.getShoppingBasket());
    }
}
