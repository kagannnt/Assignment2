import java.util.Objects;

public abstract class Activity {
    private String name;
    private int duration;

    public Activity(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() { return name; }
    public int getDuration() { return duration; }


    public abstract double calculateCalories();


    @Override
    public String toString() {
        return "Activity: " + name + ", Duration: " + duration + " min, Calories: " + calculateCalories();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return duration == activity.duration && Objects.equals(name, activity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration);
    }
}
