package org.sparta.backmaterialspring.auth.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TokenBlackList extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String jti;

    @Column
    @Enumerated(value = EnumType.STRING)
    private TokenType tokenType;

    @Column
    private LocalDateTime expiresAt;
}
