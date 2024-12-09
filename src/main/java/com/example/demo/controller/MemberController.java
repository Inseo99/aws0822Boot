package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
   
   @GetMapping(value = "/memberJoin.aws")
   public String memberJoin() {
      
      return "memberJoin";
   }
}