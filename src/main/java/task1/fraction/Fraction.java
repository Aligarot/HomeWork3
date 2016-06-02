package task1.fraction;

//
public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public Fraction(){
        this.numerator=1;
        this.denominator=1;
    }
    public Fraction addFraction(Fraction drob){
        Fraction drob1=new Fraction();
        if(this.denominator==drob.denominator){
            drob1.numerator=drob.numerator+this.numerator;
            drob1.denominator=drob.denominator;
        }else {
            drob1.denominator= drob.denominator*this.denominator;
            drob1.numerator=drob.numerator*this.denominator+this.numerator*drob.denominator;
        }
        return drob1;
    }
    public Fraction minusFraction(Fraction drob){
        Fraction drob1=new Fraction();
        if(this.denominator==drob.denominator){
            drob1.numerator=this.numerator-drob.numerator;
            drob1.denominator=drob.denominator;
        }else {
            drob1.denominator = drob.denominator*this.denominator;
            drob1.numerator=this.numerator*drob.denominator-drob.numerator*this.denominator;
        }
        return drob1;
    }
    public Fraction multiplyFraction(Fraction drob){
        Fraction drob1=new Fraction();
        drob1.numerator=drob.numerator*this.numerator;
        drob1.denominator=drob.denominator*this.denominator;
        return drob1;
    }
    public Fraction divFraction(Fraction drob){
        Fraction drob1=new Fraction();
        drob1.numerator=this.numerator*drob.denominator;
        drob1.denominator=this.denominator*drob.numerator;
        return drob1;
    }
    public double simplyFly(){
        return  (double) this.numerator/this.denominator;
    }
    public void showFraction(Fraction drob){
        System.out.println(drob);
    }

    @Override
    public String toString() {
        return "Fraction = " +
                "(chisl : " + numerator +
                "   znamen : " + denominator +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction)) return false;

        Fraction fraction = (Fraction) o;

        if (((getDenominator() != fraction.getDenominator()))||(getNumerator() != fraction.getNumerator())) return false;
        return true;
    }
}
