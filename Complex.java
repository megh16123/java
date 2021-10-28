class Complex  {
    int real,imagenary;
    Complex(int real,int imagenary){
        this.real = real;
        this.imagenary = imagenary;
    }
    Complex(){
        this.real = 0;
        this.imagenary =0;
    }
    public static String toString(Complex c){
         return c.real+" + i"+c.imagenary;
     }
    static Complex multiply(Complex c1,Complex c3){
      Complex c4 = new Complex();
      c4.real = c3.real*c1.real;
      c4.imagenary = c3.imagenary*c1.imagenary;
     return c4;
    }
    static Complex sum(Complex c1,Complex c3){
        Complex c2 = new Complex();
        c2.real = c3.real+c1.real;
        c2.imagenary = c3.imagenary+c1.imagenary;
       return c2;
      }


public static void main(String[] args) {
    Complex complex = new Complex(4,7);
    Complex complex1 = new Complex(2,8);
    Complex complex_sum = new Complex();
    Complex complex_multiply = new Complex();
    complex_multiply  = multiply(complex,complex1);
    complex_sum = sum(complex,complex1);
    System.out.println(toString(complex_multiply));
    System.out.println(toString(complex_sum));
}}

