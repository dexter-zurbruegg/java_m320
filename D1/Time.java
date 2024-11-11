public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour: " + hour);
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second: " + second);
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }
}
