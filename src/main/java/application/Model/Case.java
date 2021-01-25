package application.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * This class represents a single unit
 * of the room
 * */
@AllArgsConstructor
@Setter
@Getter
public class Case {
    private int x;
    private int y;

    @Override
    public boolean equals(Object obj) {
        Case incomingCase = (Case)obj;
        if(this.x==incomingCase.getX() && this.y==incomingCase.getY())
            return true;
        else
            return false;
    }
}
