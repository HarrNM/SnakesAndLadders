import MoveToken.getSquareNumber
import RollDice.rollDice

import scala.io.StdIn.readChar
import scala.util.control.Breaks.break

object TwoPersonGame {

  def twoPersonGame(firstPlayer: Players, secondPlayer: Players): String = {
    while (firstPlayer.currentSquare < 100 && secondPlayer.currentSquare < 100) {
      println(s"${firstPlayer.name} please press r to roll the dice ")
      val answer1 = readChar()
      if (answer1 == 'r') {
        val firstRollNumber = rollDice
        getSquareNumber(firstPlayer, firstRollNumber)
        if (firstPlayer.currentSquare >= 100) break
        println(firstPlayer.name + " rolled a " + firstRollNumber + " and is on square number " + firstPlayer.currentSquare)
      }
      println(s"${secondPlayer.name} please press r to roll the dice ")
      val answer2 = readChar()
      if (answer2 == 'r') {
        val secondRollNumber = rollDice
        getSquareNumber(secondPlayer, secondRollNumber)
        println(secondPlayer.name + " rolled a " + secondRollNumber + " and is on square number " + secondPlayer.currentSquare)
      }
    }
    if (firstPlayer.currentSquare >= 100) s"${firstPlayer.name} has won " + firstPlayer.currentSquare
    else s"${secondPlayer.name} has won " + secondPlayer.currentSquare
  }

}
