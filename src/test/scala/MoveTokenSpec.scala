import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import MoveToken._
import RollDice._

class MoveTokenSpec extends AnyWordSpec with Matchers {

  "MoveToken" should {
    "start the game on square 1" in {
      start() shouldBe 1
    }
    "move the token to the correct square" when {
      "moved 3 spaces" in {
        start()
        moveToken(3) shouldBe 4
      }
      "moved 3 spaces and then 4 spaces" in {
        start()
        moveToken(3)
        moveToken(4) shouldBe 8
      }
    }
    "move token 1-6 spaces on a dice roll" in {
      val roll = rollDice
      start()
      assert( 2 to 7 contains moveToken(roll))
    }
  }
}
