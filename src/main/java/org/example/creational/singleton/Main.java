package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*DatabaseContext databaseContext = new DatabaseContext("db1");
        databaseContext.connect();
        System.out.println(databaseContext);

        DatabaseContext databaseContext2 = new DatabaseContext("db2");
        databaseContext2.connect();
        System.out.println(databaseContext2);

        DatabaseContext databaseContext3 = DatabaseContext.getInstance("db3");
        databaseContext3.connect();
        System.out.println(databaseContext3);

        DatabaseContext databaseContext4 = DatabaseContext.getInstance("db4");
        databaseContext3.connect();
        System.out.println(databaseContext4);
*/
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        thread1.start();
        thread2.start();

    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            DatabaseContext databaseContext = DatabaseContext.getInstance("thread 1");
            databaseContext.connect();
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            DatabaseContext databaseContext = DatabaseContext.getInstance("thread 2");
            databaseContext.connect();

        }
    }

}

