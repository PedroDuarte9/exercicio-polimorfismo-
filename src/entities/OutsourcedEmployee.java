package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }
}
