package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET,value="/ozzy")
    public String getRequestMapping1(){
        return "home";
    }
    @RequestMapping(method = RequestMethod.POST,value="/cybertek")
    public String getRequestMapping2(){
        return "home";
    }

   /* @GetMapping("/spring")
        public String getMappingEx(){
        return "home";
    }*/
    @PostMapping("/spring")
    public String getMappingEx2(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String getPathVariable(@PathVariable("name")String name){
        System.err.println("Name is : "+name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String getPathVariable(@PathVariable("name")String name,@PathVariable("email")String email){
        System.err.println("Name is : "+name);
        System.err.println("Email is : "+email);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.err.println("Course is : "+course);
        return "home";
    }

    @GetMapping("home/course2")
    public String requestParamEx2(@RequestParam(value="name",required=false,defaultValue="Cybertek") String name){
        System.err.println("Course is : "+name);
        return "home";
    }
}
