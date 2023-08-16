import java.io.*;

class Employee implements Serializable{
	
	int age;
	int id;
	
}

class SerializeDemo  {
	public static void main(String[] args) throws Exception{
		
		Employee e1 = new Employee();
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("emp1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(oos);
		
		//De-serialization
		FileInputStream fis = new FileInputStream("emp1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee) ois.readObject();
		
		System.out.println("Employee age: "+e2.age);
		System.out.println("Employee ID: "+e2.id);
	}
}