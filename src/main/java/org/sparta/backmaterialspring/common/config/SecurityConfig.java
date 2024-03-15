package org.sparta.backmaterialspring.common.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    /**
     * Security 에서 제공하는 비밀번호 암호화 인터체이스의 구현체를 Bean 으로 등록
     * @return BCryptPasswordEncoder
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * Security 에서 인증/인가 제어를 위해 관리하는 Filter 설정
     * @param security SecurityFilterChain 인터페이스 구현체
     * @return HttpSecurity
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
        // CSRF(사이트 간 요청 위조) 설정 비활성화 : B/C 세션 방식이 아닌 JWT 방식을 사용
        security.csrf((csrf) -> csrf.disable());

        // Security 의 기본 설정인 Session 방식이 아닌 JWT 방식을 사용하기 위한 설정
        security.sessionManagement((sessionManagement) ->
                sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );

        // JWT 방식의 REST API 서버이기 때문에 FormLogin 방식, HttpBasic 방식 비활성화
        security.formLogin((formLogin) -> formLogin.disable())
                .httpBasic((httpBasic) -> httpBasic.disable());

        // API 제어 설정 : 요청된 URI(URL) 기반으로 인증/인가 제어
        security.authorizeHttpRequests((request) ->
            request.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll() // resources 접근 허용 설정
                    .requestMatchers("/auth/**").permitAll() // 로그인 & 회원가입 & Refresh Token 갱신
                    .anyRequest().authenticated() // 그 외 모든 요청 인증처리 진행
        );

        return security.build();
    }
}
