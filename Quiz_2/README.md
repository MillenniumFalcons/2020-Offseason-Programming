# Quiz 2

In this quiz you will be creating a simulated robot using classes we have been working on for the past 2 weeks.

Make sure you completely understand how to use the following classes:

- AirPiston.java
- Motor.java
- Drivetrain.java
- Intake.java

## Instructions
You main class will be called ``Robot.java``

You will be creating 3 subsystems in addition:

- `Elevator.java`
- `GroundIntake.java`
- `BallHolder.java`

And one class to control the interactions of the subsystems with each other called `StateMachine.java`.

Here are the requirements:

You can create as many private helper methods and variables as you want to complete the required task.

### Elevator.java
- 3 Motors, 4 methods and 1 enum
- Motors 2 of them have to follow a leader
- Method 1: `void set(double)` sets the desired demand of the motors to a value, doesn't directly set the leader.
- Enum `ElevatorState` with 3 levels, `LOW`, `MID`, `HIGH`, `MOTOR_CONTROL`.
- Method 2: `void setState(ElevatorState)` which will control what is the state of  the elevator.
- Method 3: `ElevatorState getState()` which will return the current state of the elevator.
- Method 4: `void runPeriodic()` will have an if statement which decides whether to set the motor to a specific speed based on the state. If the state is `MOTOR` it sets the motor to the desired demand from `void set(double)` otherwise it will print "elevator going to: " and then the state it is going to.

### GroundIntake.java
- 1 AirPiston and 1 Motor, 3 methods
- Method 1: `void deploy()` will extend the piston but not run the motor. 
- Method 2: `void retract()` will retract the piston and stop the motor.
- Method 3: `void set(double)` method here that directly sets the motor object.

### BallHolder.java
- Has 1 motor and 3 methods
- Method 1: `void loadBalls()` which runs the motor at -50% speed
- Method 2: `void releaseBalls()` which runs the motor at +50% speed
- Method 3: `void hold()` which stops the motor

### StateMachine.java
- Will have 3 subsystems, `BallHolder`, `GroundIntake`, and `Elevator`
- Contructor takes in an Elevator, GroundIntake and BallHolder objects and sets them to the subsystems declared in this class.
- An enum `RobotState` with 3 states `INTAKE`, `SHOOT`, `HOLD`
- Method 1: `void setState(RobotState)` this only sets a variable
- Method 2: `void runPeriodic()` a switch statement for the robotState variable.
- **INTAKE state:** the ball holder should call `void loadBalls()` elevator should set the state to `LOW` and the intake will call set with a netgative value and deploy
- **HOLD state:** he ball holder should call `void hold()` elevator should set the state to `MID` and the intake will retract
- **SHOOT state:** he ball holder should call `void release()` elevator should set the state to `HIGH`

### Robot.java
- One static method and one non static method
- Static method: `public static void main(String[] args)`
- Has a StateMachine object initialized with `StateMachine stateMachine = new StateMachine(new Elevator(), new BallHolder(), new GroundIntake());`
- Non-static method: `void run()` just calls `stateMachine.runPeriodic()`