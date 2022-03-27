import java.io.*;

public class Copyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputRead=new FileInputStream("C:\\Users\\Narendran\\Desktop\\Nare.jpg");
		FileOutputStream outputCopy=new FileOutputStream("C:\\Users\\Narendran\\Desktop\\Bank_passbook.jpg");
		int content =inputRead.read();
		while(content != -1) {
			outputCopy.write(content);
			content =inputRead.read();
		}
		outputCopy.flush();
		outputCopy.close();
		inputRead.close();
	}

}
