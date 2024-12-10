package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MemberJpaDto;

// Mybatis Mapper와 같다 (Dao)
// JpaRepository<Entity 클래스, PK타입>을 상속하면 자동으로 
// crud (create, read, update, delete)메소드가 내부에서 자동으로 생긴다.
@Repository
public interface MemberRepository extends JpaRepository<MemberJpaDto, Integer>{
	public MemberJpaDto findMemberJpaDtoBymemberid(String memberid); 
	// entity와 조건을 합친 메소드를 만드세요 그러면 아래와 같아요
	// SELECT * FROM member_tbl WHERE memberid = ?
}
