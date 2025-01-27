public class TimeTest {
    public static void main(String[] args) {
        try {
            Time time = new Time(10, 20, 30);
            System.out.println("Initial Time: " + time); // Expected: 10:20:30

            time.setHour(12);
            time.setMinute(45);
            time.setSecond(50);
            System.out.println("Updated Time: " + time); // Expected: 12:45:50

            try {
                time.setHour(25);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid hour
            }

            try {
                time.setMinute(65);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid minute
            }

            try {
                time.setSecond(70);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid second
            }

            time.setTime(15, 30, 45);
            System.out.println("Set Time: " + time); // Expected: 15:30:45

            try {
                time.setTime(25, 61, 61);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid hour, minute, or second
            }

            time.setTime(23, 59, 59);
            System.out.println("Before nextSecond: " + time);
            time.nextSecond();
            System.out.println("After nextSecond: " + time + ", Expected: 00:00:00");

            time.setTime(13, 45, 59);
            System.out.println("Before nextSecond: " + time);
            time.nextSecond();
            System.out.println("After nextSecond: " + time + ", Expected: 13:46:00");

            time.setTime(10, 20, 58);
            System.out.println("Before nextSecond: " + time);
            time.nextSecond();
            System.out.println("After nextSecond: " + time+ ", Expected: 10:20:59");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}