import java.util.function.Function;

class Tester {
    public String hello (int a){
        return  "value=" + a;
    }
    Function <Integer,String> hello2 =(i)-> "value="+i;
     Function <Integer,String> hello3 =(i)-> {
        i = i+100;
        return "value="+i;
    };
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.hello(25));
        System.out.println(t.hello2.apply(50));
        System.out.println(t.hello3.apply(4));
    }
}
 