public class Drive extends Command {
    private final DriveSubsystem driveSubsystem;
    private final double speed;

    public Drive(DriveSubsystem driveSubsystem, double speed) {
        this.driveSubsystem = driveSubsystem;
        this.speed = speed;

        addRequirements(driveSubsystem);
    }

    @Override
    public void execute() {
        driveSubsystem.setSpeed(speed);
    }
}