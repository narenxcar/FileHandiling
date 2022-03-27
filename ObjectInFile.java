import java.io.Serializable;

public class ObjectInFile implements Serializable {
	private String name,dateOfBirth;
	private int age;
	
ObjectInFile(String name,int age,String dateOfBirth){
	this.name=name;
	this.age=age;
	this.dateOfBirth=dateOfBirth;
}
public String toString() {
	return  name+" "+age+" "+dateOfBirth;
}
int getAge() {
	return age;
}
String getDateOfBirth() {
	return dateOfBirth;
}
String getName() {
	return name;
}
}
