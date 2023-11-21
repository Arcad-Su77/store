package uz.arcad.store.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.arcad.store.service.api.StoreServiceImpl;

@RestController
@RequestMapping("/order")
public class StoreControler {
    StoreServiceImpl storeService;

    public StoreControler(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public String addItemsToCart(@RequestParam("ID") Integer prodID,
                               @RequestParam("Count") Integer prodCount) {
        return (storeService.addItemsToCart(prodID, prodCount))
                ? "Корзина пополнена" : "Попалнение не удачное";
    }

    @GetMapping("/cart")
    public String printCart() {
        return storeService.printCart();
    }
}
