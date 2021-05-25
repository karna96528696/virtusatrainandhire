package Streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileBufferOutputTest {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String empid=sc.nextLine();
		String name=sc.nextLine();
		String str= "Welcome "+name + " your Employee Id is " + empid;
		FileOutputStream fs=new FileOutputStream("D:/Virtusa/Niki.txt");
		BufferedOutputStream bs=new BufferedOutputStream(fs);
		byte buf[]=new byte[1000];
		buf=str.getBytes();
		fs.write(buf);
		System.out.print("Employee details sucessfully added...!! ");
	}

}
