package com.example.htmlterminatorexercise12.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArnoldController {

  @GetMapping("/")
  public String index(){
    return "index";
  }



  @GetMapping("/test")
  public String test(){
    return "test";
  }

}
