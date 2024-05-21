# Backend-Material 프로젝트 🏗️

`backend-material`는 예비 개발자들이 기본적인 백엔드 기능들을 빠르고 효과적으로 구축할 수 있도록 도와주는 프로젝트입니다. 회원가입, 로그인, 인증, 결제 등의 기본적인 기능을 바닥부터 구현하는 데 드는 시간과 노력을 줄이고, 실력 향상에 집중할 수 있도록 하기 위해 만들어졌습니다.

## 시작하기 🏁

1. 이 프로젝트를 다운받으세요.

2. 클론을 받은 뒤 아래 명령을 실행해주세요.
- local
   ```bash
    make -f docker/Makefile .build env=local
    make -f docker/Makefile .run env=local
   ```
- dev
   ```bash
    make -f docker/Makefile .build env=dev
    make -f docker/Makefile .run env=dev
   ```

## 목적 🎯

- **시행착오 줄이기:** 기본적인 기능의 구현에서 발생할 수 있는 불필요한 시행착오를 줄입니다.
- **실력 향상 촉진:** 주요 기능들을 빠르게 구현하고 이해함으로써, 실력 향상에 집중할 수 있게 합니다.

## 구현범위 🚀

- **payment(to-do):** 주문 및 결제 처리를 담당하는 모듈입니다. 장바구니, 배송, 포인트/쿠폰 시스템을 담고 있습니다.
- **auth(to-do):** 회원가입/로그인 및 JWT 인증을 담당하는 모듈입니다. 이메일 및 소셜로그인(구글, 애플, 네이버, 카카오)을 지원합니다.

## 기술스택 🛠️

- Java + Spring Boot + Gradle
- Spring Data Jpa + PostgreSQL


## Auth 서비스 🔐

Auth 서비스는 사용자의 인증과 권한 관리를 담당하는 중요한 모듈입니다. 이 모듈은 JWT를 활용한 인증, 액세스 및 리프레시 토큰 관리, 토큰 블랙리스트 처리, 접속 로그 기록 등의 기능을 제공합니다.

### 보안 및 최적화 🛡️
- **JWT 블랙리스트**: 로그아웃 또는 다른 이유로 무효화된 토큰을 관리하여 보안을 더욱 강화합니다.
- **접속 로그**: 사용자의 모든 접속 정보를 로그로 기록하여 추후 분석 및 모니터링에 활용합니다.

## Payment 서비스 🔐

Payment 서비스는 주문과 결제 재고등을 담당하는 모듈입니다. 주문서 생성과 대기 결제로직이 구현되어있으며, TossPayment 승인 api를 예시로한 api가 작성되어 있습니다.


## 디렉토리 구조 📂

```plaintext
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂org
 ┃ ┃ ┃ ┗ 📂sparta
 ┃ ┃ ┃ ┃ ┗ 📂backmaterialspring
 ┃ ┃ ┃ ┃ ┃ ┣ 📂auth
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AuthController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CreateUserDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SignupResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessLog.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessToken.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RefreshToken.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TokenBlackList.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TokenType.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜User.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRole.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂jwt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtProvider.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenPayload.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessLogRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AccessTokenRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RefreshTokenRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TokenBlackListRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂security
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtAuthenticationFilter.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtAuthorizationFilter.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserDetailsImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserDetailsServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂impl
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TokenBlackListServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TokenBlackListService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JpaConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SecurityConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SwaggerConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WebMvcConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseEntity.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BusinessException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂logging
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoggingInterceptor.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LogUtils.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂util
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜HttpRequestUtils.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂payment
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CreateOrderDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderInfoDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PaymentResultDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Coupon.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜IssuedCoupon.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Order.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderItem.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Point.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PointLog.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Product.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ShippingInfo.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂facade
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂impl
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PaymentFacadeImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PaymentFacade.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CouponRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜IssuedCouponRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderItemRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PointLogRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PointRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ShippingInfoRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂impl
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜IssuedCouponServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PointServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜IssuedCouponService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PointService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PaymentController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BackMaterialSpringApplication.java
 ┃ ┗ 📂resources
 ┃ ┃ ┣ 📜application-dev.yml
 ┃ ┃ ┗ 📜application.yml
 ┗ 📂test
 ┃ ┣ 📂http
 ┃ ┃ ┣ 📜auth.http
 ┃ ┃ ┣ 📜http-client.env.json
 ┃ ┃ ┗ 📜ping.http
 ┃ ┗ 📂java
 ┃ ┃ ┗ 📂org
 ┃ ┃ ┃ ┗ 📂sparta
 ┃ ┃ ┃ ┃ ┗ 📂backmaterialspring
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BackMaterialSpringApplicationTests.java

```

## 주요 기능 🚀
1. **로그인 (login)**
   - 사용자 검증: 이메일과 비밀번호를 통해 사용자를 검증합니다. 
   - 토큰 생성: 검증된 사용자에 대해 액세스 및 리프레시 토큰을 생성합니다. 
   - 접속 로그 저장: 사용자의 접속 정보를 로그로 저장합니다.
2. **토큰 갱신 (refreshAccessToken)**
   - 리프레시 토큰 검증: 제공된 리프레시 토큰을 검증하고 유효한 경우 새로운 액세스 토큰을 발급합니다.
3. **로그아웃 (logout)**
   - 토큰 블랙리스트: 로그아웃 시 사용자의 현재 토큰을 블랙리스트에 추가하여 더 이상 사용할 수 없게 합니다. 
4. **토큰 블랙리스트 관리**
   - 토큰 블랙리스트에 추가 및 조회: 특정 토큰을 블랙리스트에 추가하거나 조회하는 기능을 제공합니다.
5. **주문서 생성**
   - 결제에 필요한 정보를 바탕으로 하는 주문서 생성 기능을 제공합니다.
6. **쿠폰, 포인트 사용**
   - 쿠폰, 포인트와 같은 비즈니스 로직이 구현되어 있습니다.
7. **결제, 결제 취소 등 주문서 checkout기능**
   - 결제, 결제 취소 등 주문 관련 비즈니스 로직이 구현되어 있습니다.

<br>

# 📖 PostgreSQL 

<br>

##  PostgreSQL
<img width="318" alt="스크린샷 2024-05-20 오후 4 27 56" src="https://github.com/kyungmin1221/back-material-spring/assets/105621255/7109f6a3-9498-4471-9b3e-81fa0247c7b6">

## PostgreSQL 이란?
PostgreSQL은 오픈 소스 객체-관계형 데이터베이스 시스템(ORDBMS)으로, Enterprise급 DBMS의 기능과 차세대 DBMS에서나 볼 수 있을 법한 기능들을 제공한다.약 20여년의 오랜 역사를 갖는 PostgreSQL은 다른 관계형 데이터베이스 시스템과 달리 연산자, 복합 자료형, 집계 함수, 자료형 변환자, 확장 기능 등 다양한 데이터베이스 객체를 사용자가 임의로 만들 수 있는 기능을 제공함으로써 마치 새로운 하나의 프로그래밍 언어처럼 무한한 기능을 손쉽게 구현할 수 있다.

## PostgreSQL 특징 / 이점
1. 우수한 제품 신뢰도
2. ACID 및 트랜잭션 지원
3. 다양항 인덱싱 기법 지원
4. 유연한 Full-test search 기능
5. 동시성 성능을 높여주는 MVCC 기능
6. 다양하고 유연한 Resplication 방식 지원
7. 다양한 확장 기능과 확장 기능 개발 용이성

