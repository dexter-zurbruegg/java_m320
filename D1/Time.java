public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public void int setHour(newHour) { hour = newHour; }
    public void int setMinute(newMinute) { minute = newMinute; }
    public void int setSecond(newSecond) { second = newSecond; }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void nextSecond() {
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
}
