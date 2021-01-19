package Model;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Orientation {
    North("N"), East("E"), West("W"), South("S");

    private String curentOrientation;

    private  Orientation(String curentOrientation) {
        this.curentOrientation = curentOrientation;
    }
}
