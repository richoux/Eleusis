package game

enum class Suit{ Spide, Heart, Diamond, Club }
enum class Color{ Black, Red }

data class Card(val value: Int, val suit: Suit, val color: Color)
{
  fun isFace() : Boolean = value > 10
  fun isEven() : Boolean = value % 2 == 0
}
