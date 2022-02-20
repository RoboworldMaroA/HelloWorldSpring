package com.example.helloworldspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//you need to tell this class that you are going to use rest controller
public class HelloController {

@RequestMapping("/")
    public int getHelloWorld(){
    int sum = 0;
    int a=2;
    int b=3;
    sum=a+b;
    //return "Hello World";
return sum;
}
    @RequestMapping("/info")//this command allow you to run web app using spring
    public void getInfo(){

        System.out.println("Jestem Marek");//w ten sposob nie printuje w przegladarce

        /* return "Hello World"; */
        return;
    }

    @RequestMapping("/info2")
    public String getInfo2(){
        String info2 = "Jestem Marek";//w ten sposob nie printuje w przegladarce

        return info2;
    }
    @RequestMapping("/printList")
    public List<String> getList(){
        //String info2 = "Jestem Marek";//w ten sposob nie printuje w przegladarce

        return List.of("Marek", "This", "Is","Jason","List");
    }




}
