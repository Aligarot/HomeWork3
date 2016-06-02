package task1.fraction;

/**
 * Created by Dima on 30.05.2016.
 */
public class Komplex {
    private double number;
    private double imganeryNumber;

    public Komplex() {
    }

    public Komplex(int number, int imganeryNumber) {
        this.number = number;
        this.imganeryNumber = imganeryNumber;
    }

    public double getNumber() {
        return (int) number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getImganeryNumber() {
        return imganeryNumber;
    }

    public void setImganeryNumber(double imganeryNumber) {
        this.imganeryNumber = imganeryNumber;
    }

    public Komplex muiti(Komplex komplex){
        Komplex komplex1=new Komplex();
        komplex1.imganeryNumber=this.number*komplex.imganeryNumber+komplex.number*this.imganeryNumber;
        komplex1.number=this.number*komplex.number+this.imganeryNumber*komplex.imganeryNumber;
        return komplex1;
    }
    public Komplex sum (Komplex komplex){
        Komplex komplex1= new Komplex();
        komplex1.imganeryNumber= this.imganeryNumber+komplex.imganeryNumber;
        komplex1.number= this.number+komplex.number;
        return komplex1;
    }
    public Komplex minus (Komplex komplex){
        Komplex komplex1= new Komplex();
        komplex1.imganeryNumber= this.imganeryNumber-komplex.imganeryNumber;
        komplex1.number= this.number+(-1*komplex.number);
        return komplex1;
    }

    public  Komplex simplyflyKomplex(KomplexFraction fraction){
        this.number=(double)fraction.getNumerator()/(double)fraction.getDenominator();
        this.imganeryNumber=(double)fraction.getImaginaryNumerator()/(double)fraction.imaginaryDenominator;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Komplex komplex = (Komplex) o;

        if (Double.compare(komplex.number, number) != 0) return false;
        return Double.compare(komplex.imganeryNumber, imganeryNumber) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(number);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imganeryNumber);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
