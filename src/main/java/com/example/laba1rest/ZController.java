package com.example.laba1rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZController {
    StringBuilder ans = new StringBuilder();
    StringBuilder anssum=new StringBuilder();
    @Autowired
    private ZService service;
    @GetMapping("/calculation")
    public String Calculattion
            (
            @RequestParam(name="x1")int weight1,
            @RequestParam(name="y1")int speed1,
            @RequestParam(name="x2")int weight2,
            @RequestParam(name="y2")int speed2
             )
    {
        ans.append("Your answer is: ");
        ans.append(service.Calculation(weight1,speed1,weight2,speed2));
        ans.append(".");
        return ans.toString();
    }
}
