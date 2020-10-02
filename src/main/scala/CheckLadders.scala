object CheckLadders {

  def checkLadders(currentSquare: Int): Int = {
    currentSquare match {
      case 2 => 21
      case 8 => 30
      case 16 => 37
      case 27 => 69
      case 41 => 62
      case 45 => 55
      case 65 => 97
      case 73 => 94
      case _ => currentSquare
    }
  }

}
