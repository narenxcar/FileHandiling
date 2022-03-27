import java.io.*;
public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream readingInput=new FileInputStream("C:\\Users\\Narendran\\Desktop\\Naren.txt");
		FileOutputStream copyingFile=new FileOutputStream("C:\\Users\\Narendran\\Desktop\\copyOfNaren.txt");
			byte[] value=readingInput.readAllBytes();
			copyingFile.write(value);
			copyingFile.flush();
			copyingFile.write(value);

			copyingFile.close();
			readingInput.close();
	}

}
