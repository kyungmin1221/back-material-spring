package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.TokenBlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.Optional;

public interface TokenBlackListRepository extends JpaRepository<TokenBlackList, Long> {
    Optional<TokenBlackList> findByJti(String jti);
    @Query("delete from TokenBlackList tbl where tbl.expiresAt < :now ")
    void deleteAllByExpiredTokens(@Param("now") Date now);
}
