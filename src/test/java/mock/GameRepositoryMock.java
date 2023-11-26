package mock;

import org.coursesjava.model.Game;
import org.coursesjava.repository.dao.GameRepository;

import java.util.List;

public class GameRepositoryMock implements GameRepository {
    @Override
    public Game getByName(String Game) {
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
