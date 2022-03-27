import java.io.*;
import java.util.*;
public class Filereader {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("C:\\Users\\Narendran\\Desktop\\write.txt");
		Scanner in=new Scanner(fileReader);
		while(in.hasNext()) {
			System.out.println(in.nextLine());
		}
		
	}

}
