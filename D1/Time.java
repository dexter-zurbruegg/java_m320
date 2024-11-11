public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second: " + second);
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        try {
            // Test Constructor and toString
            Time time = new Time(10, 20, 30);
            System.out.println("Initial Time: " + time); // Expected: 10:20:30

            // Test Setters and Getters
            time.setHour(12);
            time.setMinute(45);
            time.setSecond(50);
            System.out.println("Updated Time: " + time); // Expected: 12:45:50

            // Test Invalid Hour
            try {
                time.setHour(25);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid hour
            }

            // Test Invalid Minute
            try {
                time.setMinute(65);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid minute
            }

            // Test Invalid Second
            try {
                time.setSecond(70);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid second
            }

            // Test setTime with valid values
            time.setTime(15, 30, 45);
            System.out.println("Set Time: " + time); // Expected: 15:30:45

            // Test setTime with invalid values
            try {
                time.setTime(25, 61, 61);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Expected: Invalid hour, minute, or second
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

