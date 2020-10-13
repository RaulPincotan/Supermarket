import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Supermarket {
    private List<String> shoppingBasket = new ArrayList<>();


    public void addToBasket(String item) {
        shoppingBasket.add(item);
    }

    public boolean remove(String item) {
        Iterator<String> iterator = shoppingBasket.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(item)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public int basketSize() {
        return shoppingBasket.size();
    }

    public List<String> getShoppingBasket() {
        return shoppingBasket;
    }
}
