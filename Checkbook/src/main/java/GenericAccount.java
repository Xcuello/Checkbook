import java.time.LocalDate;

public class GenericAccount implements AccountBook {
    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public LocalDate getDate() {
        return null;
    }

    @Override
    public TransactionType getType() {
        return null;
    }

    @Override
    public String getMemo() {
        return null;
    }

    @Override
    public void setMemo(String memo) {

    }

    @Override
    public Payee getPayee() {
        return null;
    }

    @Override
    public void setPayee(Payee payee) {

    }

    @Override
    public Double getAmount() {
        return null;
    }
}
