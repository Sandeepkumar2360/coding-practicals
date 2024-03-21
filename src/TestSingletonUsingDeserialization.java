import java.io.*;

public class TestSingletonUsingDeserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("file.ser"));
        Employee e1 = Employee.getSingletonObject();
        objectOutput.writeObject(e1);


        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("file.ser"));
        Object e2 = objectInput.readObject();

        System.out.println(e1);
        System.out.println(e2);
    }
}
