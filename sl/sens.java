public class sens{
    public static void main(String[] args){
        String s1 = new String ("Mother's day");
        String s2 = new String ("abcd");
        String s3 = new String ("May");
        Holiday h1 = new Holiday(s1,9,s3);
        Holiday h2 = new Holiday(s2,11,s3);
        boolean a = h1.inSameMonth(h2);
	if(a==true){
        	System.out.println("The month of the two holidays is same");
	}

	else{
		System.out.println("The month of the two holidays is not same");	
	}

    }	

}

class Holiday{
    private String name;
    private int day;
    private String month;
    
    public Holiday(String n, int d, String m){
        name=n;
        day=d;
        month = m;
    }
    
    public void Holiday()
    {
        day = 0;
    }
    
    public boolean inSameMonth(Holiday h){
        boolean x=(month.equals(h.month));
        return x;
    }
    
    public void showHoliday(){
        System.out.println("The name of the holiday is - " + name);
        System.out.println("The date of the holiday is - " + day + "/" + month);
    }
}