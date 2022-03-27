import java.io.*;
public class FileoutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream readingInput=new FileInputStream("C:\\Users\\Narendran\\Desktop\\Naren.txt");
byte[] value=readingInput.readAllBytes();
	String stringValue=new String(value);
	System.out.print(stringValue);
	}

}
