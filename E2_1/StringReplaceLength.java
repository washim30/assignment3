package E2_1;

public class StringReplaceLength {
    public static void main(String[] args) {
        StringReplace sr = new StringReplace();

        String length1 = sr.replaceI();
        System.out.println(length1);
        System.out.println(length1.length());

        String length2 = sr.replaceSS();
        System.out.println(length2);
        System.out.println(length2.length());
    }
}
