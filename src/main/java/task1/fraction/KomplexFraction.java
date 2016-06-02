package task1.fraction;

/**
 * Created by Dima on 30.05.2016.
 */
public class KomplexFraction extends Fraction{
    int imaginaryDenominator;
    int imaginaryNumerator;
    Komplex denominator1;
    Komplex numerator1;

    public KomplexFraction(int numerator, int denominator, int imaginaryNumerator, int imaginaryDenominator) {
        super(numerator, denominator);
        this.imaginaryDenominator = imaginaryDenominator;
        this.imaginaryNumerator = imaginaryNumerator;
        denominator1 = new Komplex(this.getDenominator(), this.imaginaryDenominator);
        numerator1 = new Komplex(this.getNumerator(), this.imaginaryNumerator);
    }

    public int getImaginaryDenominator() {
        return imaginaryDenominator;
    }

    public void setImaginaryDenominator(int imaginaryDenominator) {
        this.imaginaryDenominator = imaginaryDenominator;
    }

    public int getImaginaryNumerator() {
        return imaginaryNumerator;
    }

    public void setImaginaryNumerator(int imaginaryNumerator) {
        this.imaginaryNumerator = imaginaryNumerator;
    }

    public KomplexFraction() {
    }

    public KomplexFraction addFraction(KomplexFraction fraction) {
        KomplexFraction fraction1 = new KomplexFraction();
        fraction1.setKomplexFraction((this.numerator1.muiti(fraction.denominator1).sum(fraction.numerator1.muiti(this.denominator1))),
                (this.denominator1.muiti(fraction.denominator1)));
        return fraction1;
    }

    public KomplexFraction minusFraction1(KomplexFraction fraction) {
        KomplexFraction fraction1 = new KomplexFraction();
        fraction1.setKomplexFraction((this.numerator1.muiti(fraction.denominator1).minus(fraction.numerator1.muiti(this.denominator1))), (this.denominator1.muiti(fraction.denominator1)));
        return fraction1;
    }

    public KomplexFraction multiKomplexFraction(KomplexFraction fraction) {
        KomplexFraction fraction1 = new KomplexFraction();
        fraction1.setKomplexFraction(this.numerator1.muiti(fraction.numerator1), this.denominator1.muiti(fraction.denominator1));
        return fraction1;
    }

    public KomplexFraction divKomplexFraction(KomplexFraction fraction) {
        KomplexFraction fraction1 = new KomplexFraction();
        fraction1.setKomplexFraction(this.numerator1.muiti(fraction.denominator1), this.denominator1.muiti(fraction.numerator1));
        return fraction1;
    }

//    public Komplex simplyflyKomplex() {
//        Komplex komplex = new Komplex();
//        komplex.setNumber((double) this.getNumerator() / (double)this.getDenominator());
//        komplex.setImganeryNumber((double) this.getImaginaryNumerator() / (double) this.getImaginaryDenominator());
//        return komplex;
//    }

    @Override
    public String toString() {
        return super.toString() + "KomplexFraction{" +
                "imaginaryDenominator=" + imaginaryDenominator +
                ", imaginaryNumerator=" + imaginaryNumerator +
                '}';
    }

    public void setKomplexFraction(Komplex komplex2, Komplex komplex1) {
        this.setDenominator((int) komplex1.getNumber());
        this.imaginaryDenominator = (int) komplex1.getImganeryNumber();
        this.imaginaryNumerator = (int) komplex2.getImganeryNumber();
        this.setNumerator((int) komplex2.getNumber());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KomplexFraction)) return false;

        KomplexFraction fraction = (KomplexFraction) o;

        if (((getDenominator() != fraction.getDenominator())||(getNumerator() != fraction.getNumerator()))||((getImaginaryDenominator() != fraction.getImaginaryDenominator())||(getImaginaryNumerator() != fraction.getImaginaryNumerator()))) return false;
        return true;
    }
}
