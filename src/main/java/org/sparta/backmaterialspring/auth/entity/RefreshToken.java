package org.sparta.backmaterialspring.auth.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Getter
public class RefreshToken extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String jti;

    @Column
    private String token;

    @Column
    private LocalDateTime expiresAt;

    @Column(columnDefinition = "boolean default false")
    private boolean isRevoke;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
