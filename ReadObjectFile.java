import java.io.*;
import java.util.*;
public class ReadObjectFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		LinkedList<ObjectInFile>objectIn=new LinkedList<>();
		FileInputStream input=new FileInputStream("C:\\Users\\Narendran\\Desktop\\Object.ser");
		ObjectInputStream input1=new ObjectInputStream(input);
		objectIn=(LinkedList<ObjectInFile>) input1.readObject();
		for(ObjectInFile obj:objectIn) {
		System.out.println(obj.getAge());
		}
	}

}
