package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/header")
//@Controller
public class HelloController {
//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private int age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/hello","hi"},method = RequestMethod.POST)
//    @RequestMapping(value = {"/{id}/hello"},method = RequestMethod.GET)
//    @RequestMapping(value = {"/hello/{id}"},method = RequestMethod.GET)
//    @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
    @GetMapping(value = "/say") //PostMapping
//    public String say(@PathVariable("id") Integer id){
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
//        return cupSize + age;
//        return content;
//        return girlProperties.getCupSize();
        return "id: "+id;
    }
}
