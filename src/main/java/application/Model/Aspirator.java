package application.Model;


import application.Exception.AspiratorException;

@FunctionalInterface
public interface Aspirator {
    public void move(Instruction instructionList) throws AspiratorException;
}
