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
        assertEquals(aspirator,new StandardAspirator(new Case(0,1),Orientation.North));
    }

    @Test
    public void TurnLeftTest() throws AspiratorException {
        Instruction instruction = Instruction.PIVOTG;
        Case initialposition = new Case(0,0);
        aspirator = new StandardAspirator(initialposition,Orientation.North);
        aspirator.move(instruction);
        assertEquals(aspirator,new StandardAspirator(new Case(0,0),Orientation.West));
    }

    @Test
    public void TurnRightTest() throws AspiratorException {
        Instruction instruction = Instruction.PIVOTD;
        Case initialposition = new Case(0,0);
        aspirator = new StandardAspirator(initialposition,Orientation.North);
        aspirator.move(instruction);
        assertEquals(aspirator,new StandardAspirator(new Case(0,1),Orientation.East));
    }
}
