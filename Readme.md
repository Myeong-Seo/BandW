프로젝트 이름 - BandW

프로젝트 설명 - 뷰티와 왁싱에 관한 프로젝트 진행.

프로젝트 요소
1. Intellij Ultimate
2. MYSQL
3. AWS - RDS, EC2(서버확인용)
4. Hamachi(Redirect 테스트용)

프로젝트 설정
1. Spring Boot
2. JDBC - MySQL
3. Maven

기능들
1. 카카오 로그인 - 박명서
2. 네이버 로그인 - 박민규
3. 구글 로그인 - 정준영
4. JWT 토큰
5. SPRING SECURITY - 준영센빠이 자문 발탁




표기법
캐멀 표기법(Camel Notation : Camel Case : 낙타 표기법)
캐멀 표기법은 두 단어 이상의 변수명을 표현할 때 두 번째 단어부터 첫 글자를 대문자로 표기하는 방법.

변수의 명명규칙(Naming Rule)인 첫 글자를 반드시 소문자로 한다는 규칙과 캐멀 표기법이 합쳐져서 네이밍이 이루어진다.

캐멀 표기법은 자바에서 시작된 것으로 변수명 혹은 클래스명을 작성할 때 단어마다 단어의 첫 글자를 대문자로 표기하는 것이다.

이 표기법은 각 단어의 첫 글자가 대문자로 표기되어 꼭 낙타의 등처럼 보여 캐멀 표기법으로 불리게 되었다고 알고 있는 사람들이 많지만 이는 사실과 다르다.

ex) addData     rainbowColor     userName


- 클래스 이름

  : 맨 앞 글자를 대문자로 한다.

  두 번째로 오는 의미있는 단어의 앞 글자도 대문자이다.



ex) public class MyClass{}     //--(○)

       public class Myclass{}      //--(Χ)



- 변수 이름

  : 맨 앞 글자를 소문자로 한다.

  두 번째로 오는 의미있는 단어의 앞 글자는 대문자이다.



ex) String myName;             //--(○)

       String MyName;              //--(Χ)



- 메소드 이름

  : 맨 앞 글자를 소문자로 한다.

  두 번째로 오는 의미있는 단어의 앞 글자는 대문자이다.

  (변수 이름의 명명법과 동일한 방법)

  단, 메소드의 이름은 가급적 동사로 시작할 수 있도록 명명하는 것이 좋다.



ex) public String createMyName() {}        //--(○)

       public String createmyname() {}         //--(Χ)

       public String myName() {}                //--(동사가 아닌 명사라 추천하지 않음)

