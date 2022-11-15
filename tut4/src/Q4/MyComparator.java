package Q4;

import Q2.BankAccount;

import java.util.Comparator;

public class MyComparator implements Comparator<BankAccount> {
    public int compare(BankAccount b1, BankAccount b2) {
        if (b1.getBalance() < b2.getBalance())
            return -1;
        else if (b1.getBalance() > b2.getBalance())
            return 1;
        else
            return 0;
    }
}

