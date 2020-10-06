package student_artur_martinenko.homework.lesson_9.level_5_middle.task_29;

import java.util.ArrayList;

class TransactionDemo {
    public static void main(String[] args) {
        TransactionDemo victim = new TransactionDemo();
        victim.legalTraderTransactionTest();
        victim.transactionTooHugeTest();
        victim.illegalTraderTransactionTest();
        victim.fraudTradersArrayContainsPokemonTest();
        victim.illegalCityTransactionTest();
        victim.illegalCountryTransactionTest();
        victim.illegalCountryAndLimitTransactionTest1();
        victim.illegalCountryAndLimitTransactionTest2();
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
        Trader testTrader = new Trader("test", "riga", "latvia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(testTransaction);
        check(false, actual, "legalTraderTransactionTest");
    }

    public void transactionTooHugeTest() {
        Trader testTrader = new Trader("test", "riga", "latvia");
        Transaction testTransaction = new Transaction(testTrader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(testTransaction);
        check(true, actual, "transactionTooHugeTest");
    }

    public void illegalTraderTransactionTest() {
        Trader pokemon = new Trader("Pokemon", "NY", "US");
        Transaction pokemonTransaction = new Transaction(pokemon, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(pokemonTransaction);
        check(true, actual, "illegalTraderTransactionTest");
    }

    public void fraudTradersArrayContainsPokemonTest() {
        ArrayList<String> fraudTraders = new ArrayList<>(FraudRule2.getBannedNames());
        Trader pokemon = new Trader("Pokemon", "NY", "US");
        boolean actual = fraudTraders.contains(pokemon.getFullName().toLowerCase());
        check(true, actual, "fraudTradersArrayContainsPokemonTest");
    }

    public void illegalCityTransactionTest() {
        Trader testTrader = new Trader("test", "Sydney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(testTransaction);
        check(true, actual, "illegalCityTransactionTest");
    }

    public void illegalCountryTransactionTest() {
        Trader testTrader = new Trader("test", "riga", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(testTransaction);
        check(true, actual, "illegalCountryTransactionTest");
    }

    public void illegalCountryAndLimitTransactionTest1() {
        Trader testTrader = new Trader("test", "hamburg", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(testTransaction);
        check(true, actual, "illegalCountryAndLimitTransactionTest1");
    }

    public void illegalCountryAndLimitTransactionTest2() {
        Trader testTrader = new Trader("test", "hamburg", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(testTransaction);
        check(false, actual, "illegalCountryAndLimitTransactionTest2");
    }


}
