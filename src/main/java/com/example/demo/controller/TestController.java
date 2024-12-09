package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.*;



@Controller
public class TestController {
   
   @GetMapping(value = "/test") // request mapping + 메서드 방식으로 작성하던 것을 한번에 GetMapping으로 어노테이샨 적어주기
   public String test(Model model) {
      ArrayList<TestVo> alist = new ArrayList<TestVo>();       // 컬랙션 계열의 list 맵도 있고 ~
      
      TestVo tv1 = new TestVo();
      tv1.setName("홍길동");
      tv1.setMemberid("hong");
      alist.add(tv1);
      TestVo tv2 = new TestVo();
      tv2.setName("이순신");
      tv2.setMemberid("lee");
      alist.add(tv2);
      TestVo tv3 = new TestVo();
      tv3.setName("강감찬");
      tv3.setMemberid("kang");
      alist.add(tv3);   
   
      model.addAttribute("alist",alist);
      model.addAttribute("value","안녕하냐고요?");
   return "test";
   }
}
