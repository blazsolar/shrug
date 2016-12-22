package solar.blaz.shrug.example;

import solar.blaz.shrug.ShrugException;

public class Thrower {

    public void throwException() throws ShrugException {
        throw new ShrugException("What have I done!");
    }

}
