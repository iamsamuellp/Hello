public class LCFlow {
    public static void main(String[] args) {
        int myCount = 11;
        do {
            System.out.println("myCount = " + myCount);
            myCount--;
        } while (myCount > 0);
        myCount = 11;
        while (myCount > 0) {
            myCount--;
            System.out.println("myCount = " + myCount);
        }
        myCount = 11;
        for (int i = 11; i > 0; i--) {
            if (i % 2 == 0)
                System.out.println("i = " + i);
        }

        for (int i = 1; i <= 100; i++) {
            String test = "";
            test += (i % 3) == 0 ? "fizz" : "";
            test += (i % 5) == 0 ? "buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
        for (int i = 0; i < 100; i++, System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : "") : i))
            ;


    }
}