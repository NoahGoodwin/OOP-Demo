public class Main {
    public static void main(String[] args) {


        //polymorphism
        Employee employee = new Employee();
        employee.work();
        employee = new Manager();
        employee.work();
    }
}
