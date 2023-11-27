package services;

import mock.GameRepositoryMock;
import org.coursesjava.model.Game;
import org.coursesjava.services.GameService;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class GameServiceTest {
    private GameService game = new GameService(new GameRepositoryMock());
    @Before
    public void init() {
        Game gameFirst = new Game();
        gameFirst.setId(1);
        gameFirst.setName("Doom");
        gameFirst.setCost(300);
        gameFirst.setRating(4);
        gameFirst.setDescription("Test, test");
        gameFirst.setRelease_date(LocalDate.of(2000, 8, 10));

        Game gameSecond = new Game();
        gameSecond.setId(2);
        gameSecond.setName("Gta 5");
        gameSecond.setCost(500);
        gameSecond.setRating(5);
        gameSecond.setDescription("Test, test");
        gameSecond.setRelease_date(LocalDate.of(2013, 6, 12));

        this.game.create(gameSecond);
    }

    @Test
    public void getByName() {
        Game expected = new Game();
        expected.setId(2);
        expected.setName("Gta 5");
        expected.setCost(500);
        expected.setRating(5);
        expected.setDescription("Test, test");
        expected.setRelease_date(LocalDate.of(2013, 6, 12));

    }
}
