import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamTester {
    public static void main(String[] args) {
        DataInputStream dis;
        try {
            dis = new DataInputStream(new FileInputStream("data.dat"));
            int roll = dis.readInt();
            boolean isActive = dis.readBoolean();
            float fee = dis.readFloat();
            String name = dis.readUTF();
            System.err.println("name : " +name);
            System.out.println("roll no : " +roll);
            System.out.println("fee : " +fee);
            System.out.println("IsActive : " +isActive);
           dis.close();
   
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
