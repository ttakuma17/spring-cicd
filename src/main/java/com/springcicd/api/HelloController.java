package com.springcicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping
  public String init(){
    return "confirmed hello controller enabled";
  }

  @GetMapping("/hello")
  public String hello(){
    return "hello method is invoked";
  }
}
