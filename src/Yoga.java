public class Yoga extends Activity {
    private String type;

    public Yoga(int duration, String type) {
        super("Yoga", duration);
        this.type = type;
    }

    @Override
    public double calculateCalories() {
        return getDuration() * 4.0;
    }
}
