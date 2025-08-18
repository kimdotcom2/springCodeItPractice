package org.example.collections.ex3.transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TransactionManager {

    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> filterTransactions(Predicate<Transaction> predicate) {

        return transactions.stream().filter(predicate).toList();

    }

    public List<Double> mapAmounts(Function<Transaction, Double> function) {

        return transactions.stream().map(function).toList();

    }

    public void processTransactions(Consumer<Transaction> consumer) {

        transactions.forEach(consumer);

    }

}
