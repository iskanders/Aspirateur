package application.Model;


import application.Exception.AspiratorException;

/**
 * Interface that represents an abstract level
 * of an aspirator.
 *
 * An aspirator can follow one instruction at time.
 * */
@FunctionalInterface
public interface Aspirator {
    public void move(Instruction instruction) throws AspiratorException;
}
