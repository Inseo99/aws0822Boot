package com.example.demo.controller;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.MemberJpaDto;
import com.example.demo.domain.MemberRequestDto;
import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value = "/member")
@RequiredArgsConstructor
public class MemberController {
   
	private final MemberService memberService;;
	
   @GetMapping(value = "/memberJoin.aws")
   public String memberJoin() {
      
      return "memberJoin";
   }
   
   @PostMapping(value = "/memberJoinAction.aws")
   public String memberJoinAction(@ModelAttribute MemberRequestDto memberRequestDto) {
	   
	   System.out.println("넘어온 memberid 값: " + memberRequestDto.getMemberid());
	   
	   // 서비스 호출 memberInsert() 메소드를 불러서 값을 넣어 실행한다.
	   Long value = memberService.memberInsert(memberRequestDto);
	   System.out.println("value : " + value);	  
	   
	   return "redirect:/";
   }
   
   @ResponseBody
   @RequestMapping(value = "memberIdCheck.aws", method = RequestMethod.POST)
   public JSONObject memberIdCheck(@RequestParam("memberid") String memberid) {
		
	   MemberJpaDto mdto = memberService.memberIdCheck(memberid);
	   
	   int cnt = 0;
	   
	   if (mdto == null) {
		cnt = 0;   
	   } else {
		   cnt = 1;
	   }
	   
	   JSONObject js = new JSONObject();
	   js.put("cnt", cnt);
			
	   return js;
	}
}













