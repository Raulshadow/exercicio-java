package Questao4;

public class Numbers {
    private float num1;
    private float num2;
    private float num3;


    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getNum3() {
        return num3;
    }

    public void setNum3(float num3) {
        this.num3 = num3;
    }

    public float maior() {
        if ((num1 > num2) && (num1 > num3))
            return num1;
        else if ((num2 > num1) && (num2 > num3))
            return num2;
        else
            return num3;
    }

    public float menor() {
        if ((num1 < num2) && (num1 < num3))
            return num1;
        else if ((num2 < num1) && (num2 < num3))
            return num2;
        else
            return num3;
    }

    public float meio() {
        if ((num1 != maior()) && (num1 != menor()))
            return num1;
        else if ((num2 != maior()) && (num2 != menor()))
            return num2;
        else
            return num3;
    }
}
