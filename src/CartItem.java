public class CartItem {
    // 책 1권의 7가지 정보
    private BookList book;
    // 수량 정보
    private int count;
    // 책의 가격의 총 합
    private int total;

    public CartItem(BookList myBook, int myCount){
        this.book = myBook;
        this.count = myCount;
        this.updateTotal();
    }

    public CartItem(BookList myBook){
        this.book = myBook;
        this.count = 1;
        this.updateTotal();
    }

    // 계산 생성자
    public void updateTotal(){
        this.total = this.count * this.book.getPrice(); // 가격과 수량 계산 메서드
    }

    // 읽기 접근자
    public BookList getBook(){
        return this.book;
    }
    public int getCount(){
        return this.count;
    }
    public int getTotal(){
        return this.total;
    }

    // 쓰기
    public void setCount(int myCount){
        this.count = myCount;
        this.updateTotal();
    }
}
