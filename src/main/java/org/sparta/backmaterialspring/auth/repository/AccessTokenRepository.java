package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.AccessToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessTokenRepository extends JpaRepository<AccessToken, Long> {
}
