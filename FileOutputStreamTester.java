import java.io.FileOutputStream;
public class FileOutputStreamTester {
   public static void main(String[] args) {
    FileOutputStream fout;
    try {
        fout = new FileOutputStream("test2.txt");
        String data = "\ntetsing of file write operation using Fileoutput tester";
        fout.write(data.getBytes());
        fout.close();
        System.out.println("file written succesfully");
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
    }
   } 
}
