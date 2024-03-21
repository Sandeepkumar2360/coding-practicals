import java.io.Externalizable;
import java.io.Serializable;

public class Employee implements Serializable {

    private  static Employee employee;
    private int id;
    private String name;

    private Employee(){}

    public static Employee getSingletonObject(){
        if (employee == null) {
            synchronized (Employee.class) {
                if (employee == null) {
                    employee = new Employee();
                }
            }
        }
        return employee;
    }

    protected Object readResolve() {
        return employee;
    }
}
