class Overloading{
 
public static void main(String[] args) {
    allot a1 = new allot(69,"Birju");
    a1.display();
}





}
class allot{
	String name ;
	int id ,constant;

	allot(){
		this(10);
     this.constant = 30;
	}
	allot(int id){
		this.id = id;
	}
	allot(int id,String name){
	     this();
		this.id = id;
		this.name = name;

	}
	public void display(){
		System.out.println(this.id +"\t"+ this.name +"\t"+ this.constant);
	}
}