class Static {
    int x;
    static {
        System.out.println("i am frist");
    }
    Static(){
        System.out.println("I am constructor");
    }
}

class Static_Block{
    public static void main(String[] args) {
        Static ob1 = new Static();
        Static ob2 = new Static();
        Static ob3 = new Static();
    }
}

