package entities;

public class Employee {
    private String name;

    private Integer hours;

    private Double valuePerHours;

    private OutsourcedEmployee outsourcedEmployee;

    public Employee(){

    }

    public Employee(String name, Integer hours, Double valuePerHours) {
        this.name = name;
        this.hours = hours;
        this.valuePerHours = valuePerHours;
    }

    public Employee(String name, Integer hours, Double valuePerHours, OutsourcedEmployee outsourcedEmployee) {
        this.name = name;
        this.hours = hours;
        this.valuePerHours = valuePerHours;
        this.outsourcedEmployee = outsourcedEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public OutsourcedEmployee getOutsourcedEmployee() {
        return outsourcedEmployee;
    }

    public void setOutsourcedEmployee(OutsourcedEmployee outsourcedEmployee) {
        this.outsourcedEmployee = outsourcedEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", valuePerHours=" + valuePerHours +
                ", outsourcedEmployee=" + outsourcedEmployee +
                '}';
    }
}
