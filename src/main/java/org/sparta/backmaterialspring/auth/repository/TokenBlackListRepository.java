package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.TokenBlackList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenBlackListRepository extends JpaRepository<TokenBlackList, Long> {
}
