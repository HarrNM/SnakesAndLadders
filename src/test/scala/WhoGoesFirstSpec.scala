import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import WhoGoesFirst.whoGoesFirst

class WhoGoesFirstSpec extends AnyWordSpec with Matchers {

  "WhoGoesFirst" should {
    "return player1" in{
      val player1 = Players("PlayerOne", 0)
      val player2 = Players("PlayerTwo", 0)

      whoGoesFirst(player1, player2, 5, 1) shouldBe player1
    }
    "return player2" in {
      val player1 = Players("PlayerOne", 0)
      val player2 = Players("PlayerTwo", 0)

      whoGoesFirst(player1, player2, 1, 4) shouldBe player2
    }
  }

}
