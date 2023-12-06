public class FondInsuficientException extends Exception {
    public FondInsuficientException(String msg){
        super(msg);
        System.out.println(msg);
    }
}
