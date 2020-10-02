import MoveToken.getSquareNumber
import RollDice.rollDice
import WhoGoesFirst.whoGoesFirst

import scala.io.StdIn.readChar
import scala.util.control.Breaks.break

object OnePersonGame {

  def onePersonGame(player: Players): String = {
    val computer = Players("Computer", 0)
    val firstPlayer = whoGoesFirst(player, computer, rollDice, rollDice)
    println(firstPlayer.name + " is going first")
    if (firstPlayer == player) {
      while (firstPlayer.currentSquare < 100 && computer.currentSquare < 100) {
        println(s"${firstPlayer.name} please press r to roll the dice ")
        val answer1 = readChar()
        if (answer1 == 'r') {
          val firstRollNumber = rollDice
          getSquareNumber(firstPlayer, firstRollNumber)
          if (firstPlayer.currentSquare >= 100) break
          println(firstPlayer.name + " rolled a " + firstRollNumber + " and is on square number " + firstPlayer.currentSquare)
        }
        val computerRoll = rollDice
        getSquareNumber(computer, computerRoll)
        println(computer.name + " rolled a " + computerRoll + " and is on square number " + computer.currentSquare)
      }
    }
    else {
      while (player.currentSquare < 100 && computer.currentSquare < 100) {
        val computerRoll = rollDice
        getSquareNumber(computer, computerRoll)
        if (computer.currentSquare >= 100) break
        println(computer.name + " rolled a " + computerRoll + " and is on square number " + computer.currentSquare)
        println(s"${player.name} please press r to roll the dice ")
        val answer1 = readChar()
        if (answer1 == 'r') {
          val firstRollNumber = rollDice
          getSquareNumber(player, firstRollNumber)
          println(player.name + " rolled a " + firstRollNumber + " and is on square number " + player.currentSquare)
        }
      }
    }
    if (player.currentSquare >= 100) s"${player.name} has won " + player.currentSquare
    else s"${computer.name} has won " + computer.currentSquare
  }

}
