package lab3.ex1;

// Java program to demonstrate switch case
// with primitive(int) data type
public class Switch {
    public static void main(String[] args) {
        int day = 5;
        String dayString;

        // switch statement with int data type
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
