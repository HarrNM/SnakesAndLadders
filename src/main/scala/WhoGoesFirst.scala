import scala.annotation.tailrec

object WhoGoesFirst {

  @tailrec
  def whoGoesFirst(player1: Players, player2: Players, player1Roll: Int, player2Roll: Int): Players = {
    if (player1Roll > player2Roll) player1
    else if (player2Roll > player1Roll) player2
    else whoGoesFirst(player1, player2, player1Roll, player2Roll)
  }

}
