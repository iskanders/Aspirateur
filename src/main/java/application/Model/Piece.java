package application.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Piece {

    // Le nombre de carrés sur l’axe y
    private int length;

    // Le nombre de carrés sur l’axe x
    private int width;
}
