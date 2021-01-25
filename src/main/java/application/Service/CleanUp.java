package application.Service;

import application.Exception.AspiratorException;
import application.Model.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * This class uses an aspirator to provide
 * a cleanup service.
 *
 * */
// Objet immutable
@Getter
@NoArgsConstructor
public class CleanUp {

    private Aspirator aspirator;
    private Piece piece;

    /**
     * Cleanup function.
     *
     * @param instructions a sequence of instructions for the aspirator.
     * @throws AspiratorException throws AspiratorException when unexpected instruction is given
     * */
    public void cleanUp(String instructions) throws AspiratorException {

        if(instructions == null)
            throw new AspiratorException("Not valid Instruction");
        for(String instruction : instructions.split("")){
            switch (instruction) {
                case "A" :{
                    this.moveSafeInstructions(Instruction.AVANCER);
                    break;
                }
                case "D" :{
                    this.moveSafeInstructions(Instruction.PIVOTD);
                    break;
                }
                case "G" :{
                    this.moveSafeInstructions(Instruction.PIVOTG);
                    break;
                }
                default:
                    throw  new AspiratorException("Not valid Instruction");
            }
        }
    }

    /**
     * Initialize the service by setting the Aspirator's
     * and the room's parameters
     *
     * @param length the length of the room
     * @param width the width of the room
     * @param initialOrientation the initial orientation of the aspirator
     * @param initialpositiony the initial position on the y axis
     * @param initialpositionx the initial position on the x axis
     * */
    public void initService(int length,int width,int initialpositionx,
                            int initialpositiony, char initialOrientation){
        this.piece = new Piece(length, width);

        Orientation orientation;
        switch (initialOrientation) {
            case 'N' : orientation= Orientation.North;
                    break;
            case 'E' : orientation= Orientation.East;
                break;
            case 'S' : orientation= Orientation.South;
                break;
            default:orientation= Orientation.West;
                break;
        }
        this.aspirator = new StandardAspirator(new Case(initialpositionx,initialpositiony),orientation);
    }

    /**
     *Follow instruction if safe.
     *
     *
     * @param instruction The next instruction
     * @throws AspiratorException If the instruction is not safe
     * */
    private void moveSafeInstructions(Instruction instruction) throws AspiratorException{
        if(!this.verifyInstruction(instruction,((StandardAspirator)this.aspirator).getCurrentOrientation(),
                ((StandardAspirator)this.aspirator).getCurrentPosition()))
            throw new AspiratorException("Unsafe instruction  : " + instruction);
        aspirator.move(instruction);
    }

    /**
     * Verify if the next Instruction may move the
     * aspirator to out of the room.
     *
     * @param instruction next instruction
     * @param currentOrientation the current orientation of the aspirator
     * @param currentPosition current position of the aspirator
     * @return boolean : true if the next instruction is safe, else false.
     * */
    private boolean verifyInstruction(Instruction instruction, Orientation currentOrientation,Case currentPosition){
        if(instruction.equals(Instruction.AVANCER)){
            if(currentOrientation.equals(Orientation.North)){
                return !(currentPosition.getY()+1>piece.getLength());
            }
            if(currentOrientation.equals(Orientation.East)){
                return !(currentPosition.getX()+1>piece.getWidth());
            }
            if(currentOrientation.equals(Orientation.West)){
                return  !(currentPosition.getX()-1<0);
            }
            if(currentOrientation.equals(Orientation.South)){
                return !(currentPosition.getY()-1<0);
            }
        }
        return true;
    }

}
