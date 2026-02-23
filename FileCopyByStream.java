import java.io.FileOutputStream;
import java.io.FileInputStream;
public class FileCopyByStream {
   public static void main(String[] args) {
    int i;
    FileInputStream fin;
    FileOutputStream fout;
    try {
        
        fin =new FileInputStream("test.png");
        fout = new FileOutputStream("test_cpy.png");
        System.out.println();
    } catch (Exception e) {
        // TODO: handle exception
    }
   }
}
