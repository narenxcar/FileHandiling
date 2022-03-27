import java.io.*;
public class File1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Narendran\\Desktop\\ZSGS\\ZSGS.txt",true);
		f1.write(65);
		//f1.write()
		FileWriter output=new FileWriter("C:\\Users\\Narendran\\Desktop\\ZSGS\\ZSGS.txt",true);
		output.write("hello siva\n");
		output.write("hello siva\n");
		output.flush();
		output.close();
		f1.close();
		FileReader read=new FileReader("C:\\Users\\Narendran\\Desktop\\ZSGS\\ZSGS.txt");
		int i=0;
		while((i=read.read())!=-1){    
		     System.out.print((char)i);}
		read.close();
	}

}

