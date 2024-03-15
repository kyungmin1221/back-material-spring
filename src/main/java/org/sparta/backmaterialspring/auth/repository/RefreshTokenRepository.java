package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.RefreshTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenEntity, Long> {
}
