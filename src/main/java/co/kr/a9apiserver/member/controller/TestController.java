package co.kr.a9apiserver.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/api/hello")
  public String sum() {
    return "hello";
  }

}
