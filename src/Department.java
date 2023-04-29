import java.util.Objects;

public class Department {


    private String name;
    private int numberOfEmployees;
    private String managerName;

    public Department(String name, int numberOfEmployees, String managerName) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.managerName = managerName;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    // toString method
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", managerName='" + managerName + '\'' +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return numberOfEmployees == that.numberOfEmployees &&
                Objects.equals(name, that.name) &&
                Objects.equals(managerName, that.managerName);
    }
}
