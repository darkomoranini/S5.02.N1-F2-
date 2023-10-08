package cat.itacademy.barcelonactiva.morandini.darko.s05.t02.n01.f2.game.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.morandini.darko.s05.t02.n01.f2.model.domain.game.Game;
import cat.itacademy.barcelonactiva.morandini.darko.s05.t02.n01.f2.model.domain.player.Player;

public interface IgameRepository extends MongoRepository<Game, Integer> {
    List<Game> findByPlayerId(int playerId);
    void deleteByPlayer(Player player);
}
