import CheckLadders.checkLadders
import CheckSnakes.checkSnakes

object MoveToken {

  var currentSquare = 0

  def start(): Int = {
    currentSquare += 1
    currentSquare
  }

  def moveToken(placesMoved: Int): Int = {
    currentSquare = currentSquare + placesMoved
    currentSquare
  }

  def getSquareNumber(player: Players, diceRoll: Int) = {
    val squareNumber = player.currentSquare + diceRoll
    currentSquare = checkSnakes(squareNumber)
    currentSquare = checkLadders(currentSquare)
    player.currentSquare = currentSquare
  }
}