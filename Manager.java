import java.util.List;


//Inheritance
public class Manager extends Employee{

    //Abstraction
    private List<Employee> reporters;

    public void work(){
        System.out.println("managing reporters");
    }

    //Encapsulation
    public List<Employee> getReporters() {
        return reporters;
    }

    public void setReporters(List<Employee> reporters) {
        this.reporters = reporters;
    }
}
