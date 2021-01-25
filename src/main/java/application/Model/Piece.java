package application.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Piece {

    // Number of units on the Y axis
    private int length;

    // Number of units on the X axis
    private int width;
}
