public class Person {
    // 캡슐화
    private String name;
    private String phone;

    public Person(String myName, String myPhone){
        this.name = myName;
        this.phone = myPhone;
    }

    // 외부에서 읽기
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }

    // 쓰기 접근자
    public void setName(String myName){
        this.name = myName;
    }
    public void setPhone(String myPhone){
        this.phone = myPhone;
    }
}
