package application.Service;

import application.Exception.AspiratorException;
import application.Model.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


// Objet immutable
@Getter
@NoArgsConstructor
public class CleanUp {

    private Aspirator aspirator;
    private Piece piece;

    public void cleanUp(String instructionList) throws AspiratorException {
    }

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

}
