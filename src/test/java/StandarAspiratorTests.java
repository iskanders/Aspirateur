import application.Exception.AspiratorException;
import application.Model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandarAspiratorTests {
    Aspirator aspirator;

    @Test
    public void moveForwardTest() throws AspiratorException {
        Instruction instruction = Instruction.AVANCER;
        Case initialposition = new Case(0,0);
        aspirator = new StandardAspirator(initialposition, Orientation.North);
        aspirator.move(instruction);
        assertTrue(((StandardAspirator)aspirator).getCurrentOrientation().equals(Orientation.North)
                    && ((StandardAspirator)aspirator).getCurrentPosition().equals(new Case(0,1)));
    }

    @Test
    public void TurnLeftTest() throws AspiratorException {
        Instruction instruction = Instruction.PIVOTG;
        Case initialposition = new Case(0,0);
        aspirator = new StandardAspirator(initialposition,Orientation.North);
        aspirator.move(instruction);
        assertTrue(((StandardAspirator)aspirator).getCurrentOrientation().equals(Orientation.West)
                && ((StandardAspirator)aspirator).getCurrentPosition().equals(new Case(0,0)));    }

    @Test
    public void TurnRightTest() throws AspiratorException {
        Instruction instruction = Instruction.PIVOTD;
        Case initialposition = new Case(0,0);
        aspirator = new StandardAspirator(initialposition,Orientation.North);
        aspirator.move(instruction);
        assertTrue(((StandardAspirator)aspirator).getCurrentOrientation().equals(Orientation.East)
                && ((StandardAspirator)aspirator).getCurrentPosition().equals(new Case(0,0)));    }
}
