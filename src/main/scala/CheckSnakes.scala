object CheckSnakes {

  def checkSnakes(squareNumber: Int): Int = {
    squareNumber match {
      case 14 => 4
      case 28 => 10
      case 43 => 1
      case 47 => 18
      case 51 => 31
      case 63 => 39
      case 68 => 33
      case 77 => 26
      case 83 => 58
      case 90 => 70
      case 93 => 66
      case 95 => 53
      case 99 => 80
      case _ => squareNumber
    }
  }

}
