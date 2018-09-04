public class Switch {
    public static void main(String[] args) {
    }

    static float calcOrderCost(float orderValue, boolean SaturdayDelivery, String destination) {
        float deliveryCost;
        switch (destination) {
            case "US":

                deliveryCost = 20.0f;
                break;
            case "Mexico":
                deliveryCost = 32.0f;
                break;
            default:  // Assume anywhere else is implies
                deliveryCost = 25.0f;
        }

        if (orderValue > 100) {
            switch (destination) {
                case "US":
                    deliveryCost -= 5;
                    break;
                default: // Assume that anywhere else cost
                    deliveryCost -= 7;
                    break;
            }
        }
        if (SaturdayDelivery) {
            switch (destination) {
                case "US":
                    deliveryCost += 10;
                    break;
                case "Mexico":
                    deliveryCost += 20;
                    break;
                default:
                    //Assume that anywhere else cost
                    deliveryCost += 12;
                    break;
            }

        }
        return deliveryCost;


    }

    int daysofweek(String nameOfWeek) {
        int weekNum;
        switch (nameOfWeek.toLowerCase()) {
            case "sunday ":
            case "sun":
                weekNum = 0;
                break;
            case "monday ":
            case "mon":
                weekNum = 1;
                break;
            case "tues":
            case "tuesday":
                weekNum = 2;
                break;
            case "wed":
            case "wednesday":
                weekNum = 3;
                break;
            case "thur":
            case "thursday ":
                weekNum = 4;
                break;
            case "fri":
            case "friday ":
                weekNum = 5;
                break;
            case "sat":
            case "saturday ":
                weekNum = 6;
                break;
            default:
                weekNum = -1;
                break;

        }
        return weekNum;
    }


}


