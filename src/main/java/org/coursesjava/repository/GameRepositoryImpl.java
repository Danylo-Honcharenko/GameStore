package org.coursesjava.repository;

import org.coursesjava.model.Game;
import org.coursesjava.repository.dao.GameRepository;

import java.sql.Connection;
import java.util.List;

public class GameRepositoryImpl implements GameRepository {
    private final Connection connection;

    public GameRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Game getByName(String GAME) {
        return null;
    }

    @Override
    public List<Game> findAll() {
        return null;
    }

    @Override
    public Game get(int ID) {
        return null;
    }

    @Override
    public int remove(String GAME) {
        return 0;
    }
}
