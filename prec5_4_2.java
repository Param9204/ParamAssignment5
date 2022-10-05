// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_4_2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new
                    FileInputStream("C:\\Users\\Param\\OneDrive\\Documents\\sem3\\CE25 1 - JAVA\\Lab\\Part - 5\\1.txt");
            fos = new FileOutputStream
                    ("C:\\Users\\Param\\OneDrive\\Documents\\sem3\\CE251 - JAVA\\Lab\\Part - 5\\2.txt");
            int temp;
            while ((temp = fis.read()) != -1) //read byte by byte
                fos.write((byte)temp); //write byte by byte
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}