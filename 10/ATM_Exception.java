
public class ATM_Exception extends Exception {

    public enum ExceptionTYPE {
        BALANCE_NOT_ENOUGH, AMOUNT_INVALID
    }

    private ExceptionTYPE exceptionCondition;

    public ATM_Exception(ExceptionTYPE exceptionType) {
        super(String.format("%s", exceptionType));
        this.exceptionCondition = exceptionType;
    }
}
