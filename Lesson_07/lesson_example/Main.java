public class Main {
    static Drivetrain dt;
    public static void main(String[] args) {
        runOnce();
        while (true) {
            runPeriodic();
        }
    }

    static void runOnce() {

    }

    static void runPeriodic() {
        dt.setMotors(Math.random() * 2 - 1, Math.random() * 2 - 1);
        dt.printStatus();
    }
}
