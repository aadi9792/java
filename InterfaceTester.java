interface A{
    int y = 25;
    void f1();
}
interface B{
    
    void f2();
}
interface c extends A,B{
    void f3();
    
}
class D implements A,B{
    public void f1();
}

public class InterfaceTester {
    
}
