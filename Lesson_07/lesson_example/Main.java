public class Main {
    static Drivetrain dt;
    public static void main(String[] args) {
        runOnce();
        while (true) {
            runPeriodic();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void runOnce() {

    }

    static void runPeriodic() {
        dt.printStatus();
        double leftPower = Math.random() * 2 - 1;
        double rightPower = Math.random() * 2 - 1;
        dt.setMotors(leftPower, rightPower);
        
    }
}
