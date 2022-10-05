// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_2_2 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try
        {
            sourceStream = new
                    FileInputStream("C:\\Users\\Param\\OneDrive\\Documents\\sem3\\CE25 1 - JAVA\\Lab\\Part - 5\\1.txt");
            targetStream = new FileOutputStream
                    ("C:\\Users\\Param\\OneDrive\\Documents\\sem3\\CE251 - JAVA\\Lab\\Part - 5\\2.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
        }
        finally
        {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}