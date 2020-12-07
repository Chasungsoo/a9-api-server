package co.kr.a9apiserver.member.repository;

import co.kr.a9apiserver.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
