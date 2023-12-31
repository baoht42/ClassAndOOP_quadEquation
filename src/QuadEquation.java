public class QuadEquation {
    private double a;
    private double b;
    private double c;

    public QuadEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public QuadEquation(){

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return (this.b*this.b)-(4*(this.a*this.c));
    }
    public double getRoot1(){
        return (((-1*this.b)+Math.sqrt(getDiscriminant()))/(2*a));
    }
    public double getRoot2(){
        return (((-1*this.b)-Math.sqrt(getDiscriminant()))/(2*a));
    }
}
