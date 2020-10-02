import CheckWin.checkWin
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class GameSpec extends AnyWordSpec with Matchers {

  "the game should finish" when {
    "the player gets to square 100" in {
      val currentSquare = 97
      val move = 3
      checkWin(currentSquare + move) shouldBe true
    }
  }
  "the game should carry on" when {
    "no one has reached square 100" in {
      val currentSquare = 93
      val move = 4
      checkWin(currentSquare + move) shouldBe false
    }
  }
}
