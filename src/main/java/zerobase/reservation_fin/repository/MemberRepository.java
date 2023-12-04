package zerobase.reservation_fin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.reservation_fin.domain.Member;

@Repository
public interface JpaMemberRepository extends JpaRepository<Member, Integer> {
}
