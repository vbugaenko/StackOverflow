package ru.vbugaenko.stackoverflow.q957877;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DBofPlayers {

    private String file = "players.save";
    private List<Player> players = new ArrayList<>();

    public void add    (Player player) {
        player.setId( players.size() );
        players.add(player);
    }

    public void delete (int id)        { players.removeIf(player -> player.getId()==id); }
    public Player get  (int id)        { return players.get(id); }
    public int  size   ()              { return players.size();  }

    public void save() {
        try (ObjectOutputStream bOS = new ObjectOutputStream(new FileOutputStream( file ))) {
            bOS.writeObject(players);
        } catch (Exception e) {
            System.out.println("Ошибка сохранения данных на жесткий диск: " + e.getMessage() );
        }
    }

    public void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            players = (List<Player>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Ошибка чтения данных с жесткого диска: " + e.getMessage() );
        }
    }

}
