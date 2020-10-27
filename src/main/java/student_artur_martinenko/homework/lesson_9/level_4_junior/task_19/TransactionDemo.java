package student_artur_martinenko.homework.lesson_9.level_4_junior.task_19;

import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
class TransactionDemo {
    public static void main(String[] args) {
        TransactionDemo victim = new TransactionDemo();
        victim.legalTraderTransactionTest();
        victim.illegalTraderTransactionTest();
        victim.fraudTradersArrayContainsPokemonTest();
        victim.transactionTooHugeTest();
        victim.illegalCityTransactionTest();
    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void legalTraderTransactionTest() {
        Trader testTrader = new Trader("test", "riga");
        Transaction testTransaction = new Transaction(testTrader, 100);
        boolean actual = testTransaction.getAmount() == 100;
        check(true, actual, "legalTraderTransactionTest");
    }

    public void illegalTraderTransactionTest() {
        Trader pokemon = new Trader("Pokemon", "NY");
        Transaction pokemonTransaction = new Transaction(pokemon, 100);
        boolean actual = pokemonTransaction.getAmount() == 0;
        check(true, actual, "illegalTraderTransactionTest");
    }

    public void fraudTradersArrayContainsPokemonTest() {
        ArrayList<String> fraudTraders = new ArrayList<>(FraudDetector.getFraudTraders());
        Trader pokemon = new Trader("Pokemon", "NY");
        boolean actual = fraudTraders.contains(pokemon.getFullName());
        check(true, actual, "fraudTradersArrayContainsPokemonTest");
    }

    public void transactionTooHugeTest() {
        Trader testTrader = new Trader("test", "riga");
        Transaction testTransaction = new Transaction(testTrader, 1000000);
        boolean actual = testTransaction.getAmount() == 0;
        check(true, actual, "transactionTooHugeTest");
    }

    public void illegalCityTransactionTest() {
        Trader testTrader = new Trader("test", "Sydney");
        Transaction testTransaction = new Transaction(testTrader, 100);
        boolean actual = testTransaction.getAmount() == 0;
        check(true, actual, "illegalCityTransactionTest");
    }



}