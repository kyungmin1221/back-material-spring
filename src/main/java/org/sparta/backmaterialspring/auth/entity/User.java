package org.sparta.backmaterialspring.auth.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.sparta.backmaterialspring.common.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column(length = 50)
    private String phone;

    @Column(length = 50)
    @Enumerated(value = EnumType.STRING)
    private UserRole role;

    @Column
    private String regNo;

    @Column(columnDefinition = "boolean default false")
    private boolean isPersonalInfoVerified;

    @OneToMany(mappedBy = "user")
    private List<AccessToken> accessTokens;

    @OneToMany(mappedBy = "user")
    private List<RefreshToken> refreshTokens;

    @OneToMany(mappedBy = "user")
    private List<AccessLog> accessLogs;
}
