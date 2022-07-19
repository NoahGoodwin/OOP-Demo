//Abstraction
public class Employee {
    private String name;
    private String role;


    //Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void work(){
        System.out.println("working on papers");
    }
}
