public class TestTime {
    public static void main(String[] args) {
        try {
            Time time = new Time(12, 30, 45);
            System.out.println("Initial time: " + time);
            
            time.tick();
            System.out.println("After tick: " + time);
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Time invalidHour = new Time(25, 30, 45);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Time invalidMinute = new Time(12, 60, 45);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Time invalidSecond = new Time(12, 30, 60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
