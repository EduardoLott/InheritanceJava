package entities;

public class OutsourceEmployee extends Employee {
    private double additionalCharge;
    public OutsourceEmployee() {
    }
    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
