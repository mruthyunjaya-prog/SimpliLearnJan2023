package mypackage;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileReader fr=new FileReader("C:/Users/Mendu's/Simplilearn/JAN2023/Day08/Day08Proj01/src/mypackage/FileReaderDemo.java");
		FileReader fr=new FileReader("file1.txt");
		int n;
		while((n=fr.read())!=-1)//-1 indicates EOF
			System.out.print((char)n);
		fr.close();
		
	}

}
