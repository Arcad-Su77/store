package uz.arcad.store.service.impl;


public interface StoreService {

    String printCart();

    boolean addItemsToCart(Integer prodID, Integer prodCount);
}
