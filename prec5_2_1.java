// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_2_1 {
    public static void main(String[] args) throws IOException {
        FileReader source = null;
        try {
            source = new
                    FileReader("C:\\Users\\Param\\OneDrive\\Documents\\sem3\\CE251 - JAVA\\Lab\\Part - 5\\1.txt");
            int temp;
            while ((temp = source.read()) != -1)
                System.out.println((char) temp);
        }
        finally {
            if (source != null)
                source.close();
        }
    }
}