package Model;

import lombok.Getter;

@Getter
public enum Instruction {

    PIVOTD("D"), PIVOTG("G"), AVANCER("A");

    private String nextStep;

    private Instruction(String nextStep){
        this.nextStep=nextStep;
    }
}
