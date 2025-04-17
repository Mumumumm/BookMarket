public class BookList {
    private String id;
    private String bookName;
    private int price;
    private String author;
    private String description;
    private String category;
    private String date;

    // 생성자
    public BookList(String pId, String pBookName, int pPrice, String pAuthor, String pDescription, String pCategory, String pDate) {
        this.id = pId;
        this.bookName = pBookName;
        this.price = pPrice;
        this.author = pAuthor;
        this.description = pDescription;
        this.category = pCategory;
        this.date = pDate;
    }

    /*
     * 멤버 변수 가리킬때는 항상 this
     */
    //==============================================================ID
    // 읽기 접근자 ID
    public String getId() {
        return this.id;
    }

    // 쓰기 접근자 ID
    public void setId(String pId) {
        this.id = pId;
    }

    //==============================================================BookName
    // 읽기 접근자 BookName
    public String getBookName() {
        return this.bookName;
    }

    //==============================================================Price
    // 읽기 접근자 Price
    public int getPrice() {
        return this.price;
    }

    // 쓰기 접근자 Price
    public void setPrice(int pPrice) {
        this.price = pPrice;
    }

    //==============================================================Author
    // 읽기 접근자 Author
    public String getAuthor() {
        return this.author;
    }

    //==============================================================Description
    // 읽기 접근자 Description
    public String getDescription() {
        return this.description;
    }

    // 쓰기 접근자 Description
    public void setDescription(String pDescription) {
        this.description = pDescription;
    }

    //==============================================================Category
    // 읽기 접근자 Category
    public String getCategory() {
        return this.category;
    }

    //==============================================================Date
    // 읽기 접근자 Date
    public String getDate() {
        return this.date;
    }

    // 쓰기 접근자 Date
    public void setDate(String pDate) {
        this.date = pDate;
    }
}
