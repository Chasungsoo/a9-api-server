package co.kr.a9apiserver.member.service;

import co.kr.a9apiserver.member.domain.Member;
import co.kr.a9apiserver.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  public Member insertMember(Member member){
    return memberRepository.save(member);
  }

  public void deleteMember(Member member){
    memberRepository.delete(member);
  }

}
