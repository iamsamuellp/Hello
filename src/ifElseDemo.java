public class ifElseDemo {
    public static void main(String[] args) {
    }

    static float calcOrderCost(float orderValue, boolean SaturdayDelivery, String destination) {
        float deliveryCost;
        if (destination.equals("US")) {
            deliveryCost = 20.0f;
        } else if (destination.equals("Mexico")) {
            deliveryCost = 32.0f;
        } else { // Assume anywhere else is implies
            deliveryCost = 25.0f;
        }

        if (orderValue > 100) {
            if (destination.equals("US")) {
                deliveryCost -= 5;
            } else { // Assume that anywhere else cost
                deliveryCost -= 7;
            }
        }
        if (SaturdayDelivery) {
            if (destination.equals("US")) {
                deliveryCost += 10;
            } else if (destination.equals("Mexico"))
                deliveryCost += 20;
            else {
                //Assume that anywhere else cost
                deliveryCost += 12;
            }
        }
        return deliveryCost;

    }

    static String numberTyme(int number) {
        String answer = "";


        if (number == 4)
            answer = "This number " + number + "is a perfect square";
        if (number == 2 || number == 3 || number == 5)
        answer = "This number " + number + "is prime";
        if (number == 1)
            answer = "This number " + number + "is unit number";
        if (number == 2 || number == 4)
            answer = "This number " + number + "is even";
        if (number == 0)
            answer = "This number " + number + "is 0";

        return answer;






    }
}
