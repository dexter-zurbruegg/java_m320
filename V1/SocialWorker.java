public class SocialWorker extends Person {
    private String areaOfFocus;

    public SocialWorker(String name, String birthday, String address, String areaOfFocus) {
        super(name, birthday, address);
        this.areaOfFocus = areaOfFocus;
    }

    public String getAreaOfFocus() {
        return areaOfFocus;
    }

    public void setAreaOfFocus(String areaOfFocus) {
        this.areaOfFocus = areaOfFocus;
    }

    @Override
    public String toString() {
        return "Social Worker [" + super.toString() + ", Area of Focus: " + areaOfFocus + "]";
    }
}
