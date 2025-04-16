public class CartItem {
    // 책 1권의 7가지 정보
    private String[] book;
    // 수량 정보
    private int count;
    // 책의 가격의 총 합
    private int total;

    public CartItem(String[] myBook, int myCount){
        this.book = myBook;
        this.count = myCount;
        this.updateTotal();
    }

    public CartItem(String[] myBook){
        this.book = myBook;
        this.count = 1;
        this.updateTotal();
    }

    // 계산 생성자
    public void updateTotal(){
        this.total = this.count * Integer.parseInt(this.book[2]); // 가격과 수량 계산 메서드
    }

    // 읽기 접근자
    public String[] getBook(){
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
