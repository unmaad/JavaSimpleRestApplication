package api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/items")
    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1L, "Item 1"));
        items.add(new Item(2L, "Item 2"));
        items.add(new Item(3L, "Item 3"));
        return items;
    }
}
