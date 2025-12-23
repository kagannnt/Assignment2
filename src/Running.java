public class Running extends Activity {
    private double speed;

    public Running(int duration, double speed) {
        super("Running", duration);
        this.speed = speed;
    }

    @Override
    public double calculateCalories() {
        return getDuration() * speed * 0.8;
    }
}
