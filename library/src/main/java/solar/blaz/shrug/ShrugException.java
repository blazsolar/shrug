package solar.blaz.shrug;

public class ShrugException extends Exception {

    private static final String SHRUG = "¯\\_(ツ)_/¯";

    public ShrugException() {
        super(SHRUG);
    }

    public ShrugException(String message) {
        super(shrugMessage(message));
    }

    public ShrugException(String message, Throwable cause) {
        super(shrugMessage(message), cause);
    }

    public ShrugException(Throwable cause) {
        super(SHRUG, cause);
    }

    public ShrugException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(shrugMessage(message), cause, enableSuppression, writableStackTrace);
    }

    private static String shrugMessage(String message) {
        if (message == null || message.length() == 0) {
            return SHRUG;
        } else {
            return String.format("%s %s", SHRUG, message);
        }
    }

}
