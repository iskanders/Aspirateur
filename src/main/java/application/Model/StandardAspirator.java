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
    public void move(Instruction instructionList) throws AspiratorException {

    }
}
