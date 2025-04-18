import java.awt.print.Book;
import java.util.Scanner;

public class Cart {
    private CartItem[] mCart = new CartItem[3];
    private int mCartItemCount = 0;

    public boolean isCartInBook(String bookId) {
        for (int i = 0; i < this.mCartItemCount; i++) {
            if (bookId.equals(mCart[i].getBook().getId())) { // equals로 id비교하기
                return true; // 참이면 리턴
            }
        }
        return false; // 거짓이면 다시for로

    }

    // 목록추가
    public void appendBook(BookList book) {
        this.mCart[this.mCartItemCount] = new CartItem(book);
        this.mCartItemCount++;
    }

    // 수량증가
    public void inCreaseBookCount(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (this.mCart[i].getBook().getId().equals(bookId)) {
                int currentCount = this.mCart[i].getCount();
                this.mCart[i].setCount(currentCount + 1);
                this.mCart[i].updateTotal();
                return;
            }
        }
    }

    // 장바구니 현황 보기
    public void cartInItemList() {
        System.out.println("도서 ID | " + "구매 수량 | " + "총 합계 ");
        for (int i = 0; i < this.mCartItemCount; i++) {
            System.out.println(this.mCart[i].getBook().getId() + " | "
                    + this.mCart[i].getCount() + " | "
                    + this.mCart[i].getTotal());
        }
    }

    // 장바구니 항목 수량 지우기
    public BookList deCreaseBookCount() {
        BookList book = null;

        cartInItemList();
        System.out.print("장바구니에서 수량을 줄일 도서 아이디를 입력해주세요 : ");
        Scanner input = new Scanner(System.in);
        String seleteID = input.nextLine();

        System.out.println("수량을 줄이시겠습니까?");
        for (int i = 0; i < this.mCartItemCount; i++) {
            if (seleteID.equals(this.mCart[i].getBook().getId())) {
                book = this.mCart[i].getBook();
                this.mCart[i].setCount(this.mCart[i].getCount() - 1);
                if (this.mCart[i].getCount() == 0) {
                    System.out.println("장바구니에서 비워졌습니다");
                    this.removeCartItem(i);
                    break;
                }
            }
        }
        return book;
    }
//    Book book = this.mCart.deCreaseBookCount(bookId);


    // 장바구니에 존재하지 않는 상품 지우기
    private void removeCartItem(int index) {

        // 방법 1
        for (int i = index; i < this.mCartItemCount - 1; i++) {
            this.mCart[i] = this.mCart[i + 1];
        }
        this.mCart[this.mCartItemCount - 1] = null;
        this.mCartItemCount--;

//        // 방법 2
//        CartItem[] newCartItemList = new CartItem[3];
//        int number = 0;
//        for (int i = 0; i < this.mCartItemCount; i++) {
//            if (i != index) {
//                newCartItemList[number++] = this.mCart[i];
//            }
//        }
//        this.mCart = newCartItemList;
//        this.mCartItemCount--;
    }
    public void removeCartItemAll(){
       this.mCart = new CartItem[3];
       this.mCartItemCount = 0;
    }

    public BookList deleteBookItem(String bookId){
        BookList book = null;
        for(int i=0; i < this.mCartItemCount; i++){
            if(this.mCart[i].getBook().getId().equals(bookId)){
                book = this.mCart[i].getBook();
                this.removeCartItem(i);
                break;
            }
        }
        return book;
    }

}
