package JavaSessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class file {

	public static void main(String[] args) throws IOException {
	File f=new File("D:\\test\\java.txt");
	boolean b=f.exists();
if(b){
	System.out.println(f.length());
}
else{
	System.out.println("file not created");
}

	}

}
