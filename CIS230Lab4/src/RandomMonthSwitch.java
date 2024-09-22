import java.util.Random;

public class RandomMonthSwitch {
    public static void main(String[] args) {
        Random random = new Random();
        int monthNumber = random.nextInt(12) + 1;
        String monthName = getMonthName(monthNumber);
        System.out.println("Month for number " + monthNumber +" is: " + monthName);
    }

    public static String getMonthName(int monthNumber) {
        String monthName;
        switch(monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid Month";
                break;
        }

        return monthName;
    }
}
