package uz.arcad.store.service.api;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import uz.arcad.store.service.impl.Cart;

import java.util.Map;

@Repository
@SessionScope
public class CartImpl implements Cart {
    private Map<Integer, Integer> cart;

    public CartImpl() {

    }

    public Map<Integer, Integer> getCart() {
        return cart;
    }

    public void add(Integer prodID, Integer prodCount) {
        int tmpCount = cart.getOrDefault(prodID, 0);
        if ( tmpCount == 0 ) {
            cart.put(prodID, prodCount);
        } else {
            cart.putIfAbsent(prodID, tmpCount + prodCount);
        }
    }
}
