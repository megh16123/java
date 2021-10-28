class Complex{
    double real,img;

    Complex(double a,double b){
        this.real = a;
        this.img = b;
    }

    static Complex sum(Complex c1,Complex c2){
        Complex c = new Complex(0,0);
        c.real = c1.real + c2.real;
        c.img = c1.img + c2.img;
        return c;
    }
    static Complex mul(Complex c1,Complex c2){
        Complex c = new Complex(0,0);
        c.real = c1.real*c2.real - c1.img*c2.img;
        c.img = c1.real*c2.img + c1.img*c2.real;
        return c;
    }
    
    public static void main(String[] args) {
        Complex c1 = new Complex(5,3.2);
        Complex c2 = new Complex(3.5,4);
        Complex sumOfNumbers = sum(c1,c2);
        System.out.println("Sum of two complex numbers given is : "+sumOfNumbers.real+" + "+sumOfNumbers.img+"i");

        Complex mulOfNumbers = mul(c1,c2);
        System.out.println("Product of two complex numbers given is : "+mulOfNumbers.real+" + "+mulOfNumbers.img+"i");
    }
}