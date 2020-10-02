import scala.util.Random

object RollDice {

  def rollDice: Int = {
    val num = Random.nextInt(6)
    num
  }

}
