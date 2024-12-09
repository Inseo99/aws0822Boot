package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor	// 기본 생성자 생성
public class MemberRequestDto {      // 받는용도
   private String memberid;
   private String memberpwd;
   private String membername;
   private String memberemail;
   private String memberbirth;
   private String memberphone;
   private String memberaddr;
   private String membergender;
   private String memberhobby;

   @Builder	// builder를 통한 생성
   public MemberRequestDto(String memberid, String memberpwd,
		   				   String membername,String memberemail,
		   				   String memberbirth,String memberphone,
		   				   String memberaddr,String membergender,
		   				   String memberhobby) {
	   this.memberid = memberid;
	   this.memberpwd = memberpwd;
	   this.membername = membername;
	   this.memberemail = memberemail;
	   this.memberbirth = memberbirth;
	   this.memberphone = memberphone;
	   this.memberaddr = memberaddr;
	   this.membergender = membergender;
	   this.memberhobby = memberhobby;
   }
}