import java.io.*;
public class Sequenceinput {

	public static void main(String[] args) throws IOException {
		FileInputStream file1=new FileInputStream("C:\\Users\\Narendran\\Desktop\\Naren.txt");
		FileInputStream file2=new FileInputStream("C:\\Users\\Narendran\\Desktop\\write.txt");
		SequenceInputStream file=new SequenceInputStream(file1,file2);
		int index;
		while((index=file.read())!= -1) {
			System.out.print((char)index);
		}

	}

}
