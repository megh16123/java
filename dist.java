class Distance{
    int feet,inches;
    Distance(){

    }
    Distance(int feet,int inches){
       this.feet = feet;
       this.inches = inches;
    }
    void clone(Distance d){
       this.feet = d.feet;
       this.inches = d.inches;

    }
    void display(){
        System.out.println("Feet : " + this.feet);
        System.out.println("Inches : "+ this.inches);
    }
}


public class dist {
    public static void main(String[] args) {
        Distance d1 = new Distance(20, 5);
        Distance d2 = d1;
        Distance d3 = new Distance();
        d3.clone(d1);
        System.out.println("Original object ");
        d1.display();
        System.out.println("Refrence variable ");
        d2.display();
        System.out.println("Clone ");
        d3.display();
    }
}
