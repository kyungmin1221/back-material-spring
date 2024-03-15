package org.sparta.backmaterialspring.auth.repository;

import org.sparta.backmaterialspring.auth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
