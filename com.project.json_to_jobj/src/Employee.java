import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import java.io.Serializable;

//we are using this @____ to use annotation which will help us to
// dynamically decide the order of data we want to show and also we can
// only take some set of data by removing some of the attributes

@JsonPropertyOrder(value = {
        "empName",
        "empNo",
        "salary"
})
public class Employee implements Serializable {
    private int empNo;
    private String empName;
    //Ignore annotation ignores the attribute
    //@JsonIgnore
    private double salary;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int empNo, String empName, double salary) {
        setEmpNo(empNo);
        setEmpName(empName);
        setSalary(salary);
    }
    public Employee(){

    }
}
