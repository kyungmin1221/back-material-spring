package org.sparta.backmaterialspring.auth.service;

public interface TokenBlackListService {
    void addToBlacklist(String accessToken, String refreshToken);
    boolean isTokenBlacklisted(String jti);
    void removeExpiredTokens();
}
