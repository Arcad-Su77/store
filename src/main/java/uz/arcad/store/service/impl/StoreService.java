package uz.arcad.store.service.impl;


public interface StoreService {

    String getCart();

    void addItemsToCart(Integer prodID, Integer prodCount);
}
