
package library.management;

import datastructures.CustomArrayList;

public class TransactionManager {
    private CustomArrayList<Transaction> transactions;

    public TransactionManager() {
        transactions = new CustomArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public CustomArrayList<Transaction> getAllTransactions() {
        return transactions;
    }

    public CustomArrayList<Transaction> getTransactionsByMember(String memberId) {
        CustomArrayList<Transaction> result = new CustomArrayList<>();
        for (int i = 0; i < transactions.size(); i++) {
            Transaction t = transactions.get(i);
            if (t.getMemberId().equals(memberId)) {
                result.add(t);
            }
        }
        return result;
    }

    public CustomArrayList<Transaction> getTransactionsByBook(String isbn) {
        CustomArrayList<Transaction> result = new CustomArrayList<>();
        for (int i = 0; i < transactions.size(); i++) {
            Transaction t = transactions.get(i);
            if (t.getIsbn().equals(isbn)) {
                result.add(t);
            }
        }
        return result;
    }
}
