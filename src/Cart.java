public class Cart {
    private CartItem[] mCart = new CartItem[3];
    private int mCartItemCount = 0;

    public boolean isCartInBook(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (bookId.equals(mCart[i].getBook().getId())) { // equals로 id비교하기
                return true; // 참이면 리턴
            }
        }
        return false; // 거짓이면 다시for로

    }

    // 목록추가
    public void  appendBook(BookList book){
        this.mCart[this.mCartItemCount] = new CartItem(book);
        this.mCartItemCount++;
    }

    // 수량증가
    public void inCreaseBookCount(String bookId){
        for (int i = 0; i < mCartItemCount; i++){
            if(this.mCart[i].getBook().getId().equals(bookId)) {
                int currentCount = this.mCart[i].getCount();
                this.mCart[i].setCount(currentCount + 1);
                this.mCart[i].updateTotal();
                return;
            }
        }
    }

    public void cartInItemList(){
        System.out.println("도서 ID | " + "구매 수량 | " + "총 합계 ");
        for (int i = 0; i < mCart.length; i++) {
            System.out.println(mCart[i].getBook().getId() + " | " +  mCart[i].getCount() + " | " + mCart[i].getTotal());
        }
    }

    // 장바구니 항목 지우기
}
