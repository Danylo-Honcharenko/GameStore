package mock;

import org.coursesjava.model.Game;
import org.coursesjava.repository.dao.GameRepository;

import java.util.ArrayList;
import java.util.List;

public class GameRepositoryMock implements GameRepository {
    private final List<Game> games = new ArrayList<>();
    public int create(Game game) {
        games.add(game);
        return 1;
    }
    @Override
    public Game getByName(String Game) {
        return games.stream()
                .filter(g -> g.getName().equals(Game))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Game> findAll() {
        return games;
    }

    @Override
    public Game get(int ID) {
        return games.stream()
                .filter(g -> g.getId() == ID)
                .findFirst()
                .orElse(null);
    }
}
