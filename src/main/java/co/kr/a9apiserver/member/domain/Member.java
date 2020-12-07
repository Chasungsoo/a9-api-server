package co.kr.a9apiserver.member.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@Entity
public class Member {

  @Id
  private Long id;

  @Column
  private String name;

  @Column
  private String tel;

  @Column
  private String classRoom;

  @Enumerated
  private Role role;

}
