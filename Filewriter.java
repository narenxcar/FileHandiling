import java.io.*;
public class Filewriter {

	public static void main(String[] args) throws IOException {
		FileWriter filewriter=new FileWriter("C:\\Users\\Narendran\\Desktop\\write1.txt");
		filewriter.write("My self Narendran");
		//filewriter.flush();
		filewriter.close();
	}

}
