package solar.blaz.shrug.example;

import solar.blaz.shrug.ShrugException;

public class Example {

    public static void main(String[] args) {
        try {
            new Thrower().throwException();
        } catch (ShrugException e) {
            e.printStackTrace();
        }
    }

}
