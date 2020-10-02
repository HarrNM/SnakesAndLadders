import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import CheckSnakes._

class CheckSnakesSpec extends AnyWordSpec with Matchers {

  "CheckSnakes" should {
    "move the player back spaces" when {
      "the player lands on a snake" in {
        val currentSquare = 14
        checkSnakes(currentSquare) shouldBe 4
      }
    }
    "return the current square unaltered" when {
      "the player does not land on a snake" in {
        val currentSquare = 2
        checkSnakes(currentSquare) shouldBe 2
      }
    }
  }

}
