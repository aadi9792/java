import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTester {
    public static void main(String[] args) {
        DataOutputStream dis;
        try {
            dis = new DataOutputStream(new FileOutputStream("data.dat"));
            dis.writeInt(1001);
            dis.writeBoolean(false);
            dis.writeFloat(250000.50f);
            dis.writeUTF("Aditya Singh");
            dis.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
