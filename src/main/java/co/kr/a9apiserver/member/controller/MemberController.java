package co.kr.a9apiserver.member.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

@RestController
public class MemberController {

  @PostMapping("/api/insert")
  public String insertMember(Member member){
    return "";
  }
}
