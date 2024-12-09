package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity	// DB table 컬럼값 담는 용도
@Getter
@Table(name = "member_tbl")
@NoArgsConstructor
public class MemberJpaDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long midx;
	
	@Column(length = 100, nullable = false)
	private String memberid;
	
	@Column(length = 100, nullable = false)
	private String memberpwd;	
	
	@Column(length = 100, nullable = false)
	private String membername;
	
	@Column(length = 100, nullable = true)
	private String memberemail;
	
	@Column(length = 100, nullable = true)
	private String memberbirth;
	
	@Column(length = 100, nullable = true)
	private String memberphone;
	
	@Column(length = 100, nullable = true)
	private String memberaddr;
	
	@Column(length = 1, nullable = true)
	private String membergender;
	
	@Column(length = 100, nullable = true)
	private String memberhobby;
	
	@Column(columnDefinition = "TEXT", nullable = true)
	private String introduce;
	
}
