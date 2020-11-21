package com.jc.dubboconsumer.controller;

import com.jc.dubboconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/1/12 21:54
 * @Version 1.0
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    //访问 http://localhost:8062/add?a=8000
    @RequestMapping("/add")
    public String getCost(int a){
        return "该产品总共消费 ："+productService.getCost(a);
    }

}
