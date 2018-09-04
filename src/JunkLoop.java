public class JunkLoop {
    public static void main(String[] args) {
        for (int i = 3; i < 20; i++) {
            if (i % 3 == 0)
                System.out.println("fizz = " + i);

        }
        String edgeTech = "Sam I am";
        for (int i = 0; i < edgeTech.length(); i++ ) {
            System.out.print(edgeTech.charAt(i));
        }
        System.out.println();
        // edgeTech = "Sam I am";
        for (int i = edgeTech.length() -1; i >= 0 ; i-- )
        {
            System.out.print(edgeTech.charAt(i));
        }
    }
}
