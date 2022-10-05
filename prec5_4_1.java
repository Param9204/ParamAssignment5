// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_4_1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new
                    FileReader("C:\\Users\\Param\\OneDrive\\Documents\\sem3\\CE251 - JAVA\\Lab\\Part - 5\\1.txt");
            int fChar;
            while ((fChar = reader.read()) != -1) //read char by char

            System.out.println((char)fChar); //write char char
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}