package org.coursesjava.services;

import org.coursesjava.model.Game;
import org.coursesjava.repository.dao.GameRepository;

import java.util.List;

public class GameService {
    private final GameRepository game;
    public GameService(GameRepository game) {
        this.game = game;
    }

    public int create(Game game) {
        this.game.create(game);
        return 1;
    }

    public Game getByName(String name) {
        return game.getByName(name);
    }

    public List<Game> findAll() {
        return game.findAll();
    }

    public Game get(int ID) {
        return game.get(ID);
    }
}
