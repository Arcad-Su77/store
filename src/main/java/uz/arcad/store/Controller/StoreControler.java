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
    public void addItemsToCart(@RequestParam("ID") Integer prodID,
                               @RequestParam("Count") Integer prodCount) {
        storeService.addItemsToCart(prodID, prodCount);
    }
}
