package cat.itacademy.barcelonactiva.morandini.darko.s05.t02.n01.player.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.morandini.darko.s05.t02.n01.f2.model.domain.player.Player;

public interface IplayerRepository extends MongoRepository<Player, Integer> {
    Player findByName(String name);
}
