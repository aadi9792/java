class user{
    static int uid;
    private String userId ,email;
    private int age;
    public user(){
        userId = "U"+ (++uid);
        System.out.println("user"+ uid + "created");
    }
    public user (String email ,int age){
        this();
        this.email = email ;
        this.age = age;
    }
    public user(int a, String e){
        this();
        email = e ;
        age = a;
    }
    public void show(){
        System.out.println("userid " + userId);
        System.out.println("user email " + email);
        System.out.println("user Age " + age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        user u  = new user();
        user u1  = new user("abc@gmail.com",43);
        user u2  = new user("abcfh@gmail.com",24);
        u.show();
        u1.show();
        u2.show();



    }
}
