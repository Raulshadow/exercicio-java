package Questao7;

public class Employee {
    private float salary;
    private float increase;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getIncrease() {
        return increase;
    }

    public void setIncrease(float increase) {
        this.increase = increase;
    }

    public float newSalary() {
        return salary * getIncrease();
    }

    public float increaseValue() {
        return newSalary() - salary;
    }
}
