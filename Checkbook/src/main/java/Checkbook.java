import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Checkbook {

    private double cashAmount;
    private Payee owner;
    private ArrayList<Transaction> checkbook = new ArrayList<>();

    public Checkbook(double cashAmount) {

        this.cashAmount = cashAmount;
    }

    public Checkbook(Payee owner, double cashAmount) {

        this.owner = owner;
        this.cashAmount = cashAmount;
    }

    public Checkbook(Payee owner, double cashAmount, ArrayList<Transaction> checkbook) {

        this.owner = owner;
        this.cashAmount = cashAmount;
        this.checkbook = checkbook;
    }

    public int size() {

        return this.checkbook.size();

    }

    public boolean isEmpty() {

        return this.checkbook.isEmpty();
    }

    public boolean contains(Transaction element) {

        return this.checkbook.contains(element);
    }

    public boolean add(Transaction element) {

        return this.checkbook.add(element);
    }

    public boolean remove(Transaction element) {

        return this.checkbook.remove(element);
    }

    public Iterator iterator() {

        return this.checkbook.iterator();

    }

    public Transaction[] toArray() {

        return (Transaction[]) this.checkbook.toArray();

    }

    public Transaction[] toArray(Transaction[] a) {

        return a;

    }

    public double checkbookValue() { // sum of all Transactions (both Debits and Credits)

        double balance = 0.0;

        for (Transaction transaction : checkbook) {

            balance += transaction.getAmount();
        }

        return balance;
    }

    public Transaction getTransactionsForDate(LocalDate aDate) {

        for (Transaction transaction : checkbook) {

            if (transaction.getDate() == aDate) {

                return transaction;
            }
        }

        return null;
    }

    public Transaction[] getAllTransactionsForPayee(Payee payee) {

        ArrayList<Transaction> payeeList = new ArrayList<>();

        for (Transaction transaction : checkbook) {

            if (transaction.getPayee() == payee) {

                payeeList.add(transaction);
            }
        }

        return payeeList.toArray(new Transaction[payeeList.size()]);
    }

    public Transaction[] getAllDebitTransactions() {

        ArrayList<Transaction> debitList = new ArrayList<>();

        for (Transaction transaction : checkbook) {

            if (transaction.getType() == TransactionType.DEBIT) {

                debitList.add(transaction);
            }
        }

        return debitList.toArray(new Transaction[debitList.size()]);
    }

    public Transaction[] getAllCreditTransactions() {

        ArrayList<Transaction> creditList = new ArrayList<>();

        for (Transaction transaction : checkbook) {

            if (transaction.getType() == TransactionType.CREDIT) {

                creditList.add(transaction);
            }
        }

        return creditList.toArray(new Transaction[creditList.size()]);
    }

}
