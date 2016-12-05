import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TeamTest{
  Team team;
  Player player;
  Player player2;

  @Before 
  public void before() {
    team = new Team("Milwaukee Bucks");
    player = new Player("Giannis Antetokounmpo", 3);
    player2 = new Player("Michael Beasley", 3);
  }

  @Test
  public void hasName(){
    assertEquals("Milwaukee Bucks", team.getName()); 
  }

  @Test
  public void onCourtStartsEmpty() {
    assertEquals(0, team.playerCount());
  }

  @Test
  public void canSubInPlayer() {
    team.subIn(player);
    assertEquals(1, team.playerCount());
  }

  @Test
  public void canSubOutPlayer() {
    team.subIn(player);
    team.subOut(player);
    assertEquals(0, team.playerCount());
  }

  @Test
  public void cannotSubInPlayerIfSpotIsOccupied() {
    team.subIn(player);
    team.subIn(player);
    assertEquals(1, team.playerCount());
  }

  @Test
  public void cannotSubOutPlayerIfNotOnCourt() {
    team.subIn(player);
    team.subOut(player2);
    assertEquals(1, team.playerCount());
  }

}