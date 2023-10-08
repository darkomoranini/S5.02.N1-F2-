package cat.itacademy.barcelonactiva.morandini.darko.s05.t02.n01.f2.model.domain.game;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

import cat.itacademy.barcelonactiva.morandini.darko.s05.t02.n01.f2.model.domain.player.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int roll1;
    private int roll2;
    private boolean won;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp timestamp;
    @ManyToOne
    private Player player;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll1() {
        return roll1;
    }

    public void setRoll1(int roll1) {
        this.roll1 = roll1;
    }

    public int getRoll2() {
        return roll2;
    }

    public void setRoll2(int roll2) {
        this.roll2 = roll2;
    }

    public boolean won() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}