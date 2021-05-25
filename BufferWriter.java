import java.io. Bufferedwriter;
import java.io.Filewriter; 
import java.io.IOException;
import java.util.Scanner;
public class BufferedwriterEmailReg {
public static void main(String[] args) throws IOException {

Scanner sc=new Scanner(System.in); 
String name=sc.nextLine();
String mail=sc.next();
FileWriter f=new Filewriter("newFile.txt"); 
Bufferedwriter bw=new Bufferedwriter (f);
bw.write("Welcome"+ name+"Thank you for registering your email);
bw.flush();
bw.close();
}
}
