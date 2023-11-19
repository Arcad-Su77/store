package uz.arcad.store.service.api;

import org.springframework.stereotype.Service;
import uz.arcad.store.service.impl.StoreService;

@Service
public class StoreServiceImpl implements StoreService {
    private final CartImpl cart;

    public StoreServiceImpl(CartImpl cart) {
        this.cart = cart;
    }


    @Override
    public String getCart() {
        return null;
    }

    @Override
    public void addItemsToCart(Integer prodID, Integer prodCount) {

    }

}
