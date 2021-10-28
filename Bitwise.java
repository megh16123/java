public class Bitwise {
    public static void main(String[] args) {
        int a =4, b=5,c;
        c = a^b;
        System.out.println("EXCLUSIVE OR"+c);
        c = a<<b;
        System.out.println("BITWISE LEFT SHIFT"+c);
        c = a>>b;
        System.out.println("BITWISE RIGHT SHIFT"+c);
        c = a&b;
        System.out.println("BITWISE AND"+c);
        c = ~b;
        System.out.println("BITWISE COMPLEMENT"+c);
        c = a|b;
        System.out.println("BITWISE INCLUSIVE OR"+c);
    }
}
