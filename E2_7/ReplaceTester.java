package E2_7;

public class ReplaceTester {
    public static void main(String[] args) {
        String stateName = "mississippi";
        System.out.println("Actual stateName is  : " +stateName);
        stateName = stateName.replace("i","!");
        stateName = stateName.replace("s","$");
        System.out.println("Replace stateName is :" +stateName);
    }
}
