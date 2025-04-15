# 📘 Java Scanner 사용 가이드

## ✅ Scanner 기본 구조

Scanner 변수명 = new Scanner(System.in);

Scanner : 타입 (클래스)

변수명 : 우리가 정한 이름

new Scanner() : 객체 생성자 호출

System.in : 콘솔 입력(키보드)

## ✅ Scanner는 한 번만 생성해서 재사용하자

콘솔 입력을 받을 때는 보통 Scanner 하나만 생성하면 충분함.

여러 개 만들면 입력 충돌이나 예외 발생 가능성 있음.

Scanner input = new Scanner(System.in); // 한 번만 만들기

## ✅ 입력 예시

System.out.print("이름을 입력하세요: ");
String name = input.nextLine();

System.out.print("나이를 입력하세요: ");
int age = input.nextInt();

⚠️ nextInt() 후 nextLine() 입력이 안 되는 이유

nextInt()는 숫자만 읽고 엔터(\n)는 무시함

nextLine()은 엔터까지 읽기 때문에, 이전 입력에서 남은 줄바꿈을 읽어버림

### 🔧 해결 방법

int number = input.nextInt();
input.nextLine(); // 줄바꿈 제거
String text = input.nextLine();

✅ Scanner 마무리 시 close()

input.close(); // 프로그램 끝나기 전에 한 번만 호출

단, System.in을 닫으면 다시 사용할 수 없으므로 프로그램 끝나기 직전에만 닫을 것

### 📌 기타 팁

연락처처럼 숫자처럼 보여도 실제로는 문자열(String)로 입력 받기 (nextLine() 추천)

메뉴 번호는 작은 범위의 정수 → nextInt() 사용 적합