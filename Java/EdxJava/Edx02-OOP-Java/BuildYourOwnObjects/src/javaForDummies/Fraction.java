package javaForDummies;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int dividend, int divisor) {
        this.numerator = dividend;
        this.denominator = divisor;
        this.signAdjuster();
    }

    public void signAdjuster() {
        if (numerator < 0 && denominator < 0) {
            this.numerator = Math.abs(numerator);
            this.denominator = Math.abs(denominator);
        } else if (numerator < 0 || denominator < 0) {
            this.numerator = (Math.abs(numerator));
            this.denominator = Math.abs(denominator);
        } else if (denominator == 0) {
            throw new IllegalArgumentException("Denominator should not equal to zero.");
        }
    }

    public Fraction(int dDenominator) {
        this.denominator = 1;
        this.numerator = dDenominator;
    }

    public Fraction() {
        this.denominator = 1;
        this.numerator = 0;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    @Override
    public String toString() {
        String moduleString;
        if ((this.numerator == this.denominator) && this.denominator != 1) {
            moduleString = String.valueOf(1);
        } else if (this.denominator == 1) {
            moduleString = String.valueOf(this.numerator);
        } else {
            moduleString = String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
        }

        return moduleString;
    }

    public double toDouble() {
        double numrDouble = (double)this.numerator;
        double denoDouble = (double)this.denominator;
        double fractionDoubleFrom = numrDouble / denoDouble;

        return fractionDoubleFrom;
    }

    public Fraction add(Fraction other) {
        Fraction sumFraction;
        int modifiedNumerator = (other.denominator * this.numerator) + (other.numerator * this.denominator);
        int modifiedDenominator = this.denominator * other.denominator;

        if (this.numerator == this.denominator && other.numerator == other.denominator) {
            modifiedNumerator = 1;
            modifiedDenominator = 1;
            sumFraction = new Fraction(modifiedNumerator, modifiedDenominator);
        } else if (this.numerator == this.denominator) {
            modifiedNumerator = other.denominator + other.numerator;
            modifiedDenominator = other.denominator;
            sumFraction = new Fraction(modifiedNumerator, modifiedDenominator);
        } else if (other.numerator == other.denominator) {
            modifiedNumerator = this.numerator + this.denominator;
            modifiedDenominator = this.denominator;
            sumFraction = new Fraction(modifiedNumerator, modifiedDenominator);
        } else if (this.denominator == other.denominator) {
            int sumOfNumerator = this.numerator + other.numerator;

            sumFraction = new Fraction(sumOfNumerator, this.denominator);
        } else {
            sumFraction = new Fraction(modifiedNumerator, modifiedDenominator);
        }

        return sumFraction;
    }

    public Fraction subtract(Fraction other) {
        Fraction diffFraction;
        int modifiedNumerator = (other.denominator * this.numerator) - (other.numerator * this.denominator);
        int modifiedDenominator = this.denominator * other.denominator;

        if (this.denominator == other.denominator) {
            int diffNumerator = this.numerator - other.numerator;
            diffFraction = new Fraction(diffNumerator, this.denominator);
            diffFraction.signAdjuster();
        } else {
            diffFraction = new Fraction(modifiedNumerator, modifiedDenominator);
            diffFraction.signAdjuster();
        }

        return diffFraction;
    }

    public Fraction multiply(Fraction other) {
        int modifiedNumerator = other.numerator * this.numerator;
        int modifiedDenominator = this.denominator * other.denominator;

        Fraction prodFraction = new Fraction(modifiedNumerator, modifiedDenominator);
        prodFraction.signAdjuster();
        return prodFraction;
    }

    public Fraction divide(Fraction other) {
        int modifiedNumerator = other.denominator * this.numerator;
        int modifiedDenominator = this.denominator * other.numerator;

        Fraction divFraction = new Fraction(modifiedNumerator, modifiedDenominator);
        divFraction.signAdjuster();
        return divFraction;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other instanceof Fraction) {
            Fraction compareFractions = (Fraction)other;
            Fraction equalityFraction = new Fraction(this.numerator, this.denominator);
            if (compareFractions.toLowestterms().equals(equalityFraction.toLowestterms())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toLowestterms() {
        int commonDivider = gcd(this.numerator, this.denominator);
        String lowestTerm = this.numerator / commonDivider + "/" + this.denominator/commonDivider;
        return lowestTerm;
    }

    public int gcd(int num1, int num2) {
        int a = num1;
        int b = num2;

        while (a != 0 && b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}