package org.coursesjava.repository.dao;

import org.coursesjava.model.Game;

import java.util.*;

public interface GameRepository {
    Game getByName(String Game);
    List<Game> findAll();
    Game get(final int ID);
    int remove(final String GAME);
}
