public class Task {
    private int number;
    private String title;
    private String desckription;

    public Task(int number, String title, String desckription) {
        this.number = number;
        this.title = title;
        this.desckription = desckription;
    }

    @Override
    public String toString() {
        return String.format("%02d.%s [%s]", number,title, desckription);
    }

    public int getNumber() {
        return number;
    }
}
