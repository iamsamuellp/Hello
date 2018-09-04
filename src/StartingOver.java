import java.util.Scanner;
public class StartingOver {
    Scanner sc;

    public StartingOver() {
        sc = new Scanner(System.in );
    }

    public static void main(String[] args) {
        int dayOfTheMonth;
        String monthName;
        double milesPerGallon;
        StartingOver start = new StartingOver();
        String [] aWords;


        dayOfTheMonth = 13;
        monthName= "August";
        System.out.println( monthName + "" + dayOfTheMonth);

        milesPerGallon = 247 / 12.8;
        System.out.println("milesPerGallon");

        String name = start.getInput("Give me your name");

        String text =start.getInput("Entter a sytinh of text");
        aWords = text.split (" ");
        System.out.println("how many words" + aWords.length);

        text = start.getInput("which word do you want to see:");
        int number = Integer.parseInt(text);
        System.out.println("Word #" + number + "is" + aWords[number] );
    }

        public String getInput(String prompt) {
            System.out.println(prompt);
            String response = sc.nextLine();
            return response;


    }
}

