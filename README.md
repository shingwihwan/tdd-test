#TDD 실천법과 도구

##1장 테스트 주도 개발

####1.2 테스트 주도 개발
TDD란?

    XP(eXtreme Programming) 창시자 켄트 벡은 TDD를 "프로그램을 작성하기 전에 테스트를 먼저 작성하는 것"

####1.3 테스트 주도 개발의 목표

    잘 동작하는 깔끔한 코드(Clean code that work) - 론 제프리(Ron Jeffries)

####1.4 테스트 주도 개발의 기원

    애자일 개발 방식 중 하나인 XP의 실천 방식 중 하나

####1.5 개발에 있어 테스트 주도 개발의 위치

    개발자가 처음으로 수행하는 테스트

####1.6 테스트 주도 개발의 진행 방식
```
질문(Ask) - 응답(Respond) - 정제(Refine) - 반복(Repeat)
질문 실패 - 통과하는 코드 작성 - 아이디어 통합, 리팩토링 - 다음 질문 진행 
```

####1.7 실습

    1.단계: 계좌생성
    2.단계: 잔고조회
    3.단계: 입금/출금

####1.8 TDD의 장점

    개발의 방향을 잃지 않게 유지해준다
    품질 높은 소프트웨어 모듈 보유
    자동화된 단위 테스트 케이스를 갖게 된다
    사용설명서 & 의사소통의 수단
    설계 개선
    보다 자주 성공한다

##2장 JUnit과 Hamcrest

####2.1 JUnit

    텍스트 픽스처
    - 매번 동일한 결과를 얻게 도와주는 '기반이 되는 상태나 환경'을 의미
    - 일반된 테스트 실행환경이라고도 한다

    테스트 케이스와 테스트 메소드
    - 테스트 케이스는 테스트 작업에 대한 시나리오적인 의미가 더 강함
    - 테스트 메소드는 JUnit의 메소드를 지칭
    - 테스트 케이스가 곧 테스트 메소드인 경우가 많기 때문에 혼란 x
    - JUnit의 기원 http://members.pingnet.ch/gamma/

####2.1.1 JUnit 3

    JUnit 3 규칙
    1. TestCase를 상속받는다.
    ex) AccountTest extends TestCase
    2. 테스트 메소드의 이름은 반드시 test로 시작해야 한다
    ex) testGetAddress(), testCalculateValue() 등

####2.1.2 JUnit 4

    1. Java 5 애노테이션 지원
    2. test라는 글자로 method 이름을 시작해야 한다는 제약 해소
    3. 좀 더 유연한 픽스처
    4. 예외 테스트
    5. 시간 제한 테스트
    6. 테스트 무시
    7. 배열 지원
    8. @RunWith(클래스이름.class)
    9. @SuiteClasses(Class[])
    10. 파라미터를 이용한 테스트

    ‘New Features and Enhancements J2SE 5.0’(http://java.sun.com/j2se/1.5.0/docs/relnotes/features.html)
    을 볼 것을 추천한다. 검색으로 찾게 되는 단편적인 지식이 아닌, 좀 더 상세하고도 광범위한 정보를 얻을 수 있다.
    정 시간이 없다면, 간략화 버전인 ‘J2SE 5.0 in a Nutshell’(http://java.sun.com/developer/technicalArticles/releases/j2se15/)이
    라도 봐두자.

####2.2 비교표현의 확장: Hamcrest

####2.3 정리
