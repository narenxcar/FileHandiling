import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("C:\\Users\\Narendran\\Desktop\\Naren.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String lineOfText=null;
		while((lineOfText=bufferedReader.readLine())!=null) {
			System.out.println(lineOfText);
		}
	}

}
