package application.Model;

import application.Exception.AspiratorException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StandardAspirator implements Aspirator {

    private Case currentPosition;
    private Orientation currentOrientation;

    @Override
    public void move(Instruction instruction) throws AspiratorException {

        if (instruction.equals(Instruction.PIVOTD)) {
            switch (currentOrientation) {
                case North:
                    currentOrientation = Orientation.East;
                    break;
                case East:
                    currentOrientation = Orientation.South;
                    break;
                case South:
                    currentOrientation = Orientation.West;
                    break;
                default:
                    currentOrientation = Orientation.North;
                    break;
            }
        }

        if (instruction.equals(Instruction.PIVOTG)) {
            switch (currentOrientation) {
                case North:
                    currentOrientation = Orientation.West;
                    break;
                case East:
                    currentOrientation = Orientation.North;
                    break;
                case South:
                    currentOrientation = Orientation.East;
                    break;
                default:
                    currentOrientation = Orientation.South;
                    break;
            }
        }

        if (instruction.equals(Instruction.AVANCER)) {
            switch (currentOrientation) {
                case North: {
                    currentPosition.setY(currentPosition.getY() + 1);
                    break;
                }
                case East: {
                    currentPosition.setX(currentPosition.getX() + 1);
                    break;
                }
                case South: {
                    currentPosition.setY(currentPosition.getY() - 1);
                    break;
                }
                default: {
                    currentPosition.setX(currentPosition.getX() - 1);
                    break;
                }
            }
        }
    }
}
