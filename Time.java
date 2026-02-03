class Time {
    int hh,mm,ss;
    void input (int h , int m , int s){
        hh = h;
        mm = m;
        ss = s;


    }
    void show(){
        System.out.printf("%d:%d:%d\n",hh,mm,ss);
        // System.out.println(mm);
        // System.out.println(ss);
    }
    Time add(Time t) {
        Time temp = new Time();

        temp.ss = this.ss + t.ss;
        temp.mm = this.mm + t.mm + temp.ss / 60;
        temp.ss = temp.ss % 60;

        temp.hh = this.hh + t.hh + temp.mm / 60;
        temp.mm = temp.mm % 60;

        return temp;
    }
    public void Add(Time t1,Time t2){
            ss = t1.ss + t2.ss;
            mm = t1.mm + t2.mm + ss/60;
            ss = ss%60;
            hh = t1.hh + t2.hh + mm/60;
            mm = mm%60;

    }



    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        t1.input(3,33,34);
        t2.input(3,40,00);
        t1.show();
        t2.show();
        // Time t3 = t1.add(t2);
        Time t3 = new Time();
        
        t3.Add(t1,t2);
        t3.show();
    }
}
