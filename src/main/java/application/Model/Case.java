package application.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Case {
    private int x;
    private int y;

    public boolean equals(Object obj) {
        Case incomingCase = (Case)obj;
        if(this.x==incomingCase.getX() && this.y==incomingCase.getY())
            return true;
        else
            return false;
    }
}
