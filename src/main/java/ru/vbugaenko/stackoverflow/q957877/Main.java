package ru.vbugaenko.stackoverflow.q957877;

/**
 * List в основе небольшой БД.
 * https://ru.stackoverflow.com/questions/957877/
 *
 * @since 18.03.2019
 */

public class Main {
    public static void main(String[] args) {
        Player defaultPlayer = new Player(19, "DefName", "DefSurname", 180, 6000, "Good", "Nike", 0);

        DBofPlayers db1 = new DBofPlayers();
        db1.add( defaultPlayer );
        db1.save();

        DBofPlayers db2 = new DBofPlayers();
        db2.load();

        if (db1.size() == db2.size())
            System.out.println("Load data successful");
        else
            System.out.println("Load data wrong!");

        System.out.println( db1.get(0) );

        db2.delete(0);

        if (db2.size() == 0)
            System.out.println("Delete by id successful");
        else
            System.out.println("Delete by id  wrong!");

    }
}
