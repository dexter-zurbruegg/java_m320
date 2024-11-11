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

