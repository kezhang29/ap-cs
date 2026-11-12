// A class that tracks your steps 
public class StepTracker {
    private int minActiveSteps;
    private int days;
    private int totalSteps;
    private int activeDays;

    /**
     * Constructor that creates a StepTracker object with minimum active steps, total steps, and days
     * @param minActiveSteps The minimum number of steps so a day can be considered active
     */
    public StepTracker(int minActiveSteps) {
        this.minActiveSteps = minActiveSteps;
        this.activeDays = 0;
        this.days = 0;
        this.totalSteps = 0;
    }    

    /**
     * @return Returns active days
     */
    public int activeDays() {
        return activeDays;
    }

    /**
     * @return Checks if no days have passed, if not then returns the average
     */
    public double averageSteps() {
        return days == 0 ? 0.0 : ((double) totalSteps)/days;
    }

    /**
     * Increments totalSteps and days
     * @param steps Number of steps walked in that day
     */
    public void addDailySteps(int steps) {
        totalSteps += steps;
        if (steps > minActiveSteps) {
            activeDays += 1;
        }
        days += 1;
    }
}
