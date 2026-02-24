// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataItStreamTester {
   public DataOutputStreamTester() {
   }

   public static void main(String[] var0) {
      try {
         DataOutputStream var1 = new DataOutputStream(new FileOutputStream("null"));
         var1.writeInt(1001);
         var1.writeBoolean(false);
         var1.writeFloat(250000.5F);
         var1.writeUTF("Aditya Singh");
         var1.close();
      } catch (Exception var3) {
         System.out.println(var3.getMessage());
      }

   }
}
