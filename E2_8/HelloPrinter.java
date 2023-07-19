package E2_8;

import E2_7.ReplaceTester;

public class HelloPrinter {
    public static void main(String[] args) {
        String name = "Hello,World";

        name = name.replace('e','m');
        name = name.replace('o','e');
        name = name.replace('m','o');

        System.out.println("ReplaceTester is :" +name);

    }
}
