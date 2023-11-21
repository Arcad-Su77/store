package uz.arcad.store.service.api;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import uz.arcad.store.service.impl.Cart;

import java.util.HashMap;
import java.util.Map;

@Repository
@SessionScope
public class CartImpl implements Cart {
    private final Map<Integer, Integer> cart = new HashMap<>();

    public CartImpl() {

    }

    public Map<Integer, Integer> getCart() {
        return cart;
    }

    public boolean add(Integer prodID, Integer prodCount) {
        boolean res = false;
        int tmpCount;

        tmpCount = cart.getOrDefault(prodID, 0);

        cart.put(prodID, tmpCount + prodCount);


        return res;
    }
}
