package com.example.demo.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity	// DB table 컬럼값 담는 용도
@Getter
@Table(name = "member_tbl")
@NoArgsConstructor
@DynamicInsert // null인값은 자동으로 insert쿼리에 포함시키지 않겠다.
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
	
	@ColumnDefault("'N'")
	private String delyn;
	
	@CreationTimestamp
	private LocalDateTime writeday;
	
	@Builder
	public MemberJpaDto(String memberid, 
						String memberpwd, 
						String membername, 
						String memberemail,
						String memberbirth, 
						String memberphone,
						String memberaddr, 
						String membergender,
						String memberhobby, 
						String introduce,
						String delyn,
						LocalDateTime writeday) {
		
		   this.memberid = memberid;
		   this.memberpwd = memberpwd;
		   this.membername = membername;
		   this.memberemail = memberemail;
		   this.memberbirth = memberbirth;
		   this.memberphone = memberphone;
		   this.memberaddr = memberaddr;
		   this.membergender = membergender;
		   this.memberhobby = memberhobby;
		   this.introduce = introduce;
		   this.delyn = delyn;
		   this.writeday = writeday;
		
	}
	
}
