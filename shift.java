public class shift {
    public static void main(String[] args) {
        int x = 30, a =4, b=5,c;
        c = a<<b;
        System.out.println("BITWISE LEFT SHIFT"+c);
        c = a>>b;
        System.out.println("BITWISE RIGHT SHIFT"+c);
        System.out.println("Rigth shift operator "+(x>>>2)); 
        
    }
}
