import java.io.FileInputStream;

public class FileInputStreamTester {
    public static void main(String[] args) {
       FileInputStream fin;
       int i;
        try {
             fin = new FileInputStream("test.txt");
             System.out.println("size of file :" + fin.available());
             while((i=fin.read())!=-1){
                System.out.print((char)i);
             }
            //  i = fin.read();   
            //  System.out.println(i);
            //  System.out.println((char)i);
             fin.close();
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
