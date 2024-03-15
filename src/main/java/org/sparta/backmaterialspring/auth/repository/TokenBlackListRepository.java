package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.TokenBlackListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenBlackListRepository extends JpaRepository<TokenBlackListEntity, Long> {
}
