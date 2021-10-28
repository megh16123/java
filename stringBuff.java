public class stringBuff {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str2 = "welcome ";
    
       String str3 = str2;
        System.out.println(str2.equals(str3));
        String e = "e";
        System.out.println(str.indexOf(e.toUpperCase()));
        System.out.println(str.length());
        System.out.println(str2.matches(str2.concat("back")));
        System.out.println(str.replace(e.toUpperCase(),"P"));
        StringBuffer stringBuffer = new StringBuffer("Welcome Back");
        System.out.println(stringBuffer.replace(8,12,"home"));
        System.out.println(stringBuffer.delete(8, 12));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.charAt(4));
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.append("Meghansh"));
        System.out.println(stringBuffer.substring(8));
    }
}
