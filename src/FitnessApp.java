import java.util.*;

public class FitnessApp {
    public static void main(String[] args) {

        List<Activity> activityPool = new ArrayList<>();

        activityPool.add(new Running(30, 12.0));
        activityPool.add(new Yoga(60, "Hatha"));
        activityPool.add(new Running(45, 9.5));
        activityPool.add(new Yoga(30, "Power"));

        System.out.println("--- All Activities in Pool ---");
        for (Activity a : activityPool) {
            System.out.println(a);
        }


        activityPool.sort(Comparator.comparingDouble(Activity::calculateCalories).reversed());
        System.out.println("\n--- Sorted by Calories (High to Low) ---");
        activityPool.forEach(System.out::println);


        System.out.println("\n--- Searching for activities longer than 40 minutes ---");
        for (Activity a : activityPool) {
            if (a.getDuration() > 40) {
                System.out.println("Found: " + a.getName() + " (" + a.getDuration() + " min)");
            }
        }
    }
}
