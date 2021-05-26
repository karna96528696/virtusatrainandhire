import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEmailReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String email=sc.nextLine();
		String str="Welcome "+name+" Thank You for Registering your email id "+email;
		try {
			FileWriter w=new FileWriter("D:/Virtusa/File.txt");
			BufferedWriter b=new BufferedWriter(w);
			b.write(str);
			b.close();
			w.close();
			System.out.println("info added..!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
