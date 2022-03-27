import java.io.*;
public class CompleteFileinString {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("C:\\Users\\Narendran\\Desktop\\Naren.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		StringBuilder stringBuilder= new StringBuilder();
		String line=null;
		while((line=bufferedReader.readLine())!=null) {
			stringBuilder.append(line);
			stringBuilder.append("\n");
		}
		String completeFile=stringBuilder.toString();
		System.out.println(completeFile);
	}

}
