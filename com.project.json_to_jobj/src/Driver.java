import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        List<Employee> listObj = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            Employee obj = new Employee(i, ("XYZ" + i), (i*5000));
            listObj.add(obj);
        }
        List<String> jsonData = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            String empString = JsonUtil.convertJavaToJson(listObj.get(i));
            jsonData.add(empString);
        }
        System.out.println("___________________________________________________________");
        for (int i = 0; i < 10; i++) {
            String empString = jsonData.get(i);
            System.out.println(empString);
            System.out.println("___________________________________________________________");
        }
        for(int i = 0; i < 10; i++){
            Employee obj1 = JsonUtil.convertJsonToJava(jsonData.get(i), Employee.class);
            System.out.println(obj1.getEmpNo() +"  " + obj1.getEmpName() + "  " + obj1.getSalary());
            System.out.println("___________________________________________________________");
        }
        //System.out.println(empString);
        /*Employee obj1 = JsonUtil.convertJsonToJava(empString, Employee.class);
        System.out.println(obj1.getEmpNo() +"  " + obj1.getEmpName() + "  " + obj1.getSalary());*/

        System.out.println("___________________________________________________________");


    }
}
