package com.itcast.controller;

import com.itcast.service.Itemsservice;
import com.itcast.service.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Items")
public class ItemsController {
    @Autowired
    private Itemsservice  itemsservice;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Items> list=itemsservice.findAll();
        model.addAttribute("list",list);
        return "items/itemsList";
    }
    @RequestMapping("/editItems")
    public String editItem(Model model){
        return "items/editItems";

    }
   /* @RequestMapping("/updateItems")
    public  String update(Model model ){



        itemsservice.update(name,price,pic,createtime,detail);
        return "redirect:/Items/findAll";
    }*/

}
