public class BankAccount {
    int sold;
    public BankAccount(int sold){
        this.sold=sold;
    }
    void retrageNumerar(int sum) throws FondInsuficientException{
        if(sum>sold){
            throw new FondInsuficientException("fond insuficient");
        }
    }
}
