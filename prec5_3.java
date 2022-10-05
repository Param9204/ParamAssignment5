// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_3 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new
                    FileInputStream("C:\\Users\\Param\\OneDrive\\Documents\\sem3\\CE25 1 - JAVA\\Lab\\Part - 5\\1.txt");
            out = new
                    FileOutputStream("C:\\Users\\param\\OneDrive\\Documents\\sem3\\CE2 51 - JAVA\\Lab\\Part - 5\\2.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch(IOException ie) {
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}