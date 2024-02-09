public class AnotherOne {

    public static void main(String[] args) {

        System.out.println("Hello World"); // prints and goes to the next line
        System.out.print("Hello"); // prints and stays on the same line
        System.out.print(" World"); // prints and stays at the same line
        System.out.println(" Next Line"); // still on the same line
        System.out.println("now its next line");


        System.out.println("*");
        System.out.println("****");
        System.out.println("******");
        System.out.println("*******");
        System.out.println("*********"); // string cann't cross lines


        System.out.println("""
                *
                **
                ***
                ****
                *****
                """); // triple quotes multilines

        System.out.print("(2 + 2 * 8) / 2 - 1 = ");
        System.out.println((2 + 2 * 8) / 2 - 1);
    }
}