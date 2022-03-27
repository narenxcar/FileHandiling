import java.util.*;
import java.io.*;
public class ObjectToFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in=new Scanner(System.in);
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\Narendran\\Desktop\\Object.ser",true);
		ObjectOutputStream output=new ObjectOutputStream(file);
		ObjectInFile objectinfile;
		int i=1,age;
		String name,dateOfBirth;
		LinkedList<ObjectInFile>object=new LinkedList<ObjectInFile>();
		while(i<5) {
			System.out.print("Enter the name of person : ");
			name=in.next();
			System.out.print("Enter the age of person : ");
			age=in.nextInt();
			System.out.print("Enter the Date of Birth of a person : ");
			dateOfBirth=in.next();
			objectinfile=new ObjectInFile(name,age,dateOfBirth);
			object.add(objectinfile);
		//output.writeObject(objectinfile);
		i++;
		}
		output.writeObject(object);
		//System.out.println(object);
		output.close();
		file.close();
		/*ObjectInputStream input=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\Narendran\\\\Desktop\\\\Object.txt"));
		 ObjectInFile objectinfile1=(ObjectInFile)input.readObject();
		 System.out.println(objectinfile1);*/
		//System.out.println(objectinfile1.getAge());
				
		
	}

}
