import java.io.*;
public class Fileinput {

	public static void main(String[] args) throws IOException {// make sure for exception handling
		FileInputStream file=new FileInputStream("C:\\Users\\Narendran\\Desktop\\Naren.txt");
		int index=file.read();//read method use to point next character in file
		while(index!=-1) {//all ways the value in positive value when it reach to -1 the file came to end
			System.out.print((char)index);//the file always return byte value only but we need to make typecast 
			index=file.read();//assign next character to index
		}
		file.close();// make sure close method to avoid data leak
	}

}
