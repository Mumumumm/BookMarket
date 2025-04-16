import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //    static Scanner s = new Scanner(System.in) static 을 이용해 전역으로 사용할 수 있게 하기
    //    static String[][] static 을 이용해 전역으로 매개변수 이용

    static String[][] mBook = new String[3][7];
    static CartItem[] mCart = new CartItem[3]; // 10자리 저장공간 확보 // 배열객체 생성
    static int mCartItemCount = 0;

    public static void main(String[] args) {
        // 선택목록 문자열로 저장하기
        String str1 = "고객 정보 확인하기";
        String str2 = "장바구니 상품 목록 보기";
        String str3 = "장바구니 비우기";
        String str4 = "바구니에 항목 추가하기";
        String str5 = "장바구니의 항목 수량 줄이기";
        String str6 = "장바구니의 항목 삭제하기";
        String str7 = "영수증 표시하기";
        String str8 = "종료";

        // mBook 정보


        mBook[0][0] = "ISBN1234";
        mBook[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        mBook[0][2] = "27000";
        mBook[0][3] = "송미영";
        mBook[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        mBook[0][5] = "IT전문서";
        mBook[0][6] = "2018/10/08";

        mBook[1][0] = "ISBN1235";
        mBook[1][1] = "안드로이드 프로그래밍";
        mBook[1][2] = "33000";
        mBook[1][3] = "우재남";
        mBook[1][4] = "실습 단계별 명쾌한 멘토링!";
        mBook[1][5] = "IT전문서";
        mBook[1][6] = "2022/01/22";

        mBook[2][0] = "ISBN1236";
        mBook[2][1] = "스크래치";
        mBook[2][2] = "22000";
        mBook[2][3] = "고광일";
        mBook[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        mBook[2][5] = "컴퓨터입문";
        mBook[2][6] = "2019/06/10";


        /*
         * [0][0] | [0][1] | [0][2] | [0][3] | [0][4] | [0][5] | [0][6]
         * [1][0] | [1][1] | [1][2] | [1][3] | [1][4] | [1][5] | [1][6]
         * [2][0] | [2][1] | [2][2] | [2][3] | [2][4] | [2][5] | [2][6]
         * */

        // 스캐너 생성
        Scanner input = new Scanner(System.in);


        // 이름과 연락처 순서대로 입력 menuGuestInfo (String x ,String y) x = name y = phone
        System.out.print("당신의 이름을 입력하세요 : \t");
        String name = input.nextLine(); // 내용입력 후 엔터
        System.out.print("연락처를 입력하세요 : \t");
        String phone = input.nextLine(); // 내용입력 후 엔터
        // 스캐너로 입력받은 정보 매개변수로 넘겨주기
        // Person 객체 생성
        Person user = new Person(name, phone);

        while (true) {
            System.out.println("=======================================================================");
            System.out.println("\t\t\twelcome to Shopping Mall");
            System.out.println("\t\t\twelcome to Book Market");
            System.out.println("=======================================================================");

            System.out.print("1.\t" + str1 + "\t\t\t" + "4.\t" + str4 + "\n");
            System.out.print("2.\t" + str2 + "\t\t" + "5.\t" + str5 + "\n");
            System.out.print("3.\t" + str3 + "\t\t\t\t" + "6.\t" + str6 + "\n");
            System.out.print("7.\t" + str7 + "\t\t\t\t" + "8.\t" + str8 + "\n");
            System.out.println("=======================================================================");

            // 메뉴 번호 선택 출력
            System.out.print("메뉴 번호를 선택해주세요\t");
            int number = input.nextInt(); // 스캐너 nextInt 저장 selectNumber 에 대입
            System.out.println(number + "번을 선택했습니다"); // 내용 출력
            input.nextLine();  // ← 줄바꿈(엔터) 제거용 ✅ 이유: nextInt()는 줄바꿈(Enter)을 소비하지 않음


            switch (number) { // 번호 선택 항목 선택별 케이스 출력
                case 1:
                    menuGuestInfo(user);
                    break;
                case 2:
                    menuCartItemList();
                    break;
                case 3:
                    menuCartClear();
                    break;
                case 4:
                    menuCartAddItem(); // main 에 있는 2차원배열 넣기
                    break;
                case 5:
                    menuCartRemoveItemCount();
                    break;
                case 6:
                    menuCartRemoveItem();
                    break;
                case 7:
                    menuCartBill();
                    break;
                case 8:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력된 번호 입니다.");
            }
            if (number == 8) break; // 8이라면 break 걸어서 while 문 종료 // 8번 케이스 이외 whlie로 감싸져있는 항목 다시 반복
        }


    }

    // Person 객체의 user 매개변수
    public static void menuGuestInfo(Person user) {
        System.out.println("고객 정보 확인하기");
        System.out.println("현재 고객 정보 :\n" + "이름 :\t" + user.getName() + "\t" + "연락처 :\t" + user.getPhone());
    }

    public static void menuCartItemList() {
        System.out.println("장바구니 상품 목록 보기");
    }

    public static void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    public static void menuCartAddItem() {

        // 상품 리스트를 출력하기 위한 2중 반복문
        for (int i = 0; i < mBook.length; i++) {
            for (int j = 0; j < mBook[i].length; j++) {
                System.out.print(mBook[i][j] + " | ");
            }
            System.out.println(); // 줄바꿈용
        }

        // 입력값을 받아 조건에 따라 다른 프린트 출력
        while (true) {
            // while 문을 빠져나가기 위한 플래그
            boolean exit = false;
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");

            Scanner input = new Scanner(System.in);
            String bookid = input.nextLine();

            int index = -1;

            for (int i = 0; i < mBook.length; i++) {
                if (bookid.equals(mBook[i][0])) { // 입력값과 id값이 있는 [i][0]를 equals로 비교
                    index = i; // 여기서 index값을 -1 또는 0~2 결정
                    break; // 0~2가 나오면 바로 break
                }
            }

            if (index != -1) { // index 가 -1 이 아닐때
                System.out.println("장바구니에 추가하겠습니까? Y | N");
                String yn = input.nextLine();

                if (yn.toUpperCase().equals("Y")) { // toUpperCase 로 대문자변환 후 yn입력값이 Y라면 실행
                    if (!isCartInBook(bookid)) { // 해당 도서가 이미 장바구니에 있는지 확인 없을때만 실행
                        mCart[mCartItemCount] = new CartItem(mBook[index]);
                        mCartItemCount++;
                    }
                    System.out.println(mBook[index][1] + "가 장바구니에 추가되었습니다.");
                }
                exit = true;
            } else { // index가 -1 일때
                System.out.println("도서가 존재하지 않습니다.");
            }

            if (exit) {
                break;
            }

        }

    }

    public static boolean isCartInBook(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (bookId.equals(mCart[i].getBook()[0])) { // equals로 id비교하기
                mCart[i].setCount(mCart[i].getCount()); // 현재 수량의 count 를 1로 지정했으니 + 1
                return true; // 참이면 리턴
            }
        }
        return false; // 거짓이면 다시for로
    }

    public static void menuCartRemoveItemCount() {
        System.out.println("장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem() {
        System.out.println("장바구니의 항목 삭제하기");
    }

    public static void menuCartBill() {
        System.out.println("영수증 표시하기");
    }


}

