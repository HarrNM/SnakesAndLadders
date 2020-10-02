import OnePersonGame.onePersonGame
import RollDice.rollDice
import TwoPersonGame.twoPersonGame
import WhoGoesFirst.whoGoesFirst

import scala.io.StdIn._

object Game extends App {

  def SnakesAndLadders(): String = {
    println("Do you want to play with 1 or 2 players?")
    val noOfPlayers = readChar()
    if (noOfPlayers == '2') {
      val player1Name = readLine("Please enter Player1's name ")
      val player2Name = readLine("Please enter Player2's name ")
      val player1 = Players(player1Name, 0)
      val player2 = Players(player2Name, 0)
      val firstPlayer = whoGoesFirst(player1, player2, rollDice, rollDice)
      println(firstPlayer.name + " is going first")
      if (firstPlayer == player1) twoPersonGame(firstPlayer, player2)
      else twoPersonGame(player2, player1)
    }
    else if (noOfPlayers == '1') {
      val player1Name = readLine("Please enter Player1's name ")
      val player1 = Players(player1Name, 0)
      onePersonGame(player1)
    }
    else "Please only enter either 1, or 2. Start again"
  }

}
