import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckbookTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void sizeTest() {

        //Given
        Payee xzavia = new Payee("Cuello", "Xzavia", "Xzaviacuello@gmail.com");

        Checkbook checkbook = new Checkbook(xzavia, 0.0);

        Transaction firstTransaction = new Transaction("Clothes",xzavia, TransactionType.DEBIT, 25.00);
        Transaction secondTransaction = new Transaction("Shoes",xzavia, TransactionType.CREDIT, 60.00);
        Transaction thirdTransaction = new Transaction("Books",xzavia, TransactionType.DEBIT, 100.00);
        Transaction fourthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);

        //When
        checkbook.add(firstTransaction);
        checkbook.add(secondTransaction);
        checkbook.add(thirdTransaction);
        checkbook.add(fourthTransaction);

        int expected = 4;
        int actual = checkbook.size();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isEmptyTest() {


        //Given
        Payee xzavia = new Payee("Cuello", "Xzavia", "Xzaviacuello@gmail.com");

        Checkbook checkbook = new Checkbook(xzavia, 0.0);

        Transaction firstTransaction = new Transaction("Clothes",xzavia, TransactionType.DEBIT, 25.00);
        Transaction secondTransaction = new Transaction("Shoes",xzavia, TransactionType.CREDIT, 60.00);
        Transaction thirdTransaction = new Transaction("Books",xzavia, TransactionType.DEBIT, 100.00);
        Transaction fourthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);

        //When
        checkbook.add(firstTransaction);
        checkbook.add(secondTransaction);
        checkbook.add(thirdTransaction);
        checkbook.add(fourthTransaction);

        //Then
        Assert.assertFalse(checkbook.isEmpty());

    }

    @Test
    public void containsTest() {

        //Given
        Payee xzavia = new Payee("Cuello", "Xzavia", "Xzaviacuello@gmail.com");

        Checkbook checkbook = new Checkbook(xzavia, 0.0);

        Transaction firstTransaction = new Transaction("Clothes",xzavia, TransactionType.DEBIT, 25.00);
        Transaction secondTransaction = new Transaction("Shoes",xzavia, TransactionType.CREDIT, 60.00);
        Transaction thirdTransaction = new Transaction("Books",xzavia, TransactionType.DEBIT, 100.00);
        Transaction fourthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);
        Transaction fifthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);
        Transaction sixthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);

        //When
        checkbook.add(firstTransaction);
        checkbook.add(secondTransaction);
        checkbook.add(thirdTransaction);
        checkbook.add(fourthTransaction);

       //Then
        Assert.assertFalse(checkbook.contains(fifthTransaction));
        Assert.assertFalse(checkbook.contains(sixthTransaction));
        Assert.assertTrue(checkbook.contains(fourthTransaction));
        Assert.assertTrue(checkbook.contains(thirdTransaction));

    }

    @Test
    public void addTest() {

        //Given
        Payee xzavia = new Payee("Cuello", "Xzavia", "Xzaviacuello@gmail.com");

        Checkbook checkbook = new Checkbook(xzavia, 0.0);

        Transaction firstTransaction = new Transaction("Clothes",xzavia, TransactionType.DEBIT, 25.00);
        Transaction secondTransaction = new Transaction("Shoes",xzavia, TransactionType.CREDIT, 60.00);
        Transaction thirdTransaction = new Transaction("Books",xzavia, TransactionType.DEBIT, 100.00);
        Transaction fourthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);

        //When
        checkbook.add(firstTransaction);
        checkbook.add(secondTransaction);
        checkbook.add(thirdTransaction);
        checkbook.add(fourthTransaction);

        //Then
        Assert.assertTrue(checkbook.add(thirdTransaction));
        Assert.assertTrue(checkbook.add(secondTransaction));
        Assert.assertTrue(checkbook.add(firstTransaction));
    }

    @Test
    public void removeTest() {

        //Given
        Payee xzavia = new Payee("Cuello", "Xzavia", "Xzaviacuello@gmail.com");

        Checkbook checkbook = new Checkbook(xzavia, 0.0);

        Transaction firstTransaction = new Transaction("Clothes",xzavia, TransactionType.DEBIT, 25.00);
        Transaction secondTransaction = new Transaction("Shoes",xzavia, TransactionType.CREDIT, 60.00);
        Transaction thirdTransaction = new Transaction("Books",xzavia, TransactionType.DEBIT, 100.00);
        Transaction fourthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);

        checkbook.add(firstTransaction);
        checkbook.add(secondTransaction);
        checkbook.add(thirdTransaction);
        checkbook.add(fourthTransaction);

        Assert.assertTrue(checkbook.contains(thirdTransaction));
        Assert.assertTrue(checkbook.contains(secondTransaction));

        //Then
        Assert.assertTrue(checkbook.remove(fourthTransaction));
        Assert.assertTrue(checkbook.remove(thirdTransaction));

    }

    @Test
    public void iteratorTest() {

        //Given
        Payee xzavia = new Payee("Cuello", "Xzavia", "Xzaviacuello@gmail.com");

        Checkbook checkbook = new Checkbook(xzavia, 0.0);

        Transaction firstTransaction = new Transaction("Clothes",xzavia, TransactionType.DEBIT, 25.00);
        Transaction secondTransaction = new Transaction("Shoes",xzavia, TransactionType.CREDIT, 60.00);
        Transaction thirdTransaction = new Transaction("Books",xzavia, TransactionType.DEBIT, 100.00);
        Transaction fourthTransaction = new Transaction("Tires",xzavia, TransactionType.CREDIT, 150.00);

        //When
        checkbook.add(firstTransaction);
        checkbook.add(secondTransaction);
        checkbook.add(thirdTransaction);
        checkbook.add(fourthTransaction);


    }

    @Test
    public void toArrayTest() {


    }
}