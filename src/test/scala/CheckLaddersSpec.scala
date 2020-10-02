import org.scalatest.wordspec.AnyWordSpec
import CheckLadders.checkLadders
import org.scalatest.matchers.should.Matchers

class CheckLaddersSpec extends AnyWordSpec with Matchers {

  "CheckLadders" should {
    "return the correct square number" when {
      "the player lands on a ladder" in {
        val currentSquare = 2

        checkLadders(currentSquare) shouldBe 21
      }
    }
    "the player doesn't land on a ladder" in {
      val currentSquare = 10

      checkLadders(currentSquare) shouldBe 10
    }
  }

}
