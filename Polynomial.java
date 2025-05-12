public class Polynomial {
    double[] coefficients;

    public Polynomial() {
    	this.coefficients = new double[1]; 
    	this.coefficients[0] = 0;
    }

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial poly1) {
        double[] res;
        int arrayLen1 = poly1.coefficients.length;
        int arrayLen2 = this.coefficients.length;
        int arrayLen = Math.max(arrayLen1, arrayLen2);
        res = new double[arrayLen];
        for (int i = 0; i < arrayLen1; i++) {
            res[i] += poly1.coefficients[i];
        }
        for (int i = 0; i < arrayLen2; i++) {
            res[i] += this.coefficients[i];
        }
        return new Polynomial(res);
    }

    public double evaluate(double x) {
        double res = 0;
        int arrayLen = this.coefficients.length;
        for (int i = 0; i < arrayLen; i++) {
            res += this.coefficients[i] * Math.pow(x, i);
        }
        return res;
    }

    public boolean hasRoot(double x) {
        double evaluate = this.evaluate(x);
        if (evaluate == 0) {
            return true;
        } else {
            return false;
        }
    }
}