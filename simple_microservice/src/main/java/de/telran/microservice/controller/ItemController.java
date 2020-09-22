package de.telran.microservice.controller;

import de.telran.microservice.entity.Item;
import de.telran.microservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/api/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @GetMapping("/api/items")
    public List<Item> getItem() {
        return itemService.getItem();
    }

    @GetMapping("/api/items/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

}
