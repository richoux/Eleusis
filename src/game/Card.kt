package game

enum class Suit{ Spade, Heart, Diamond, Club }
enum class Color{ Black, Red }

data class Card(val value: Int, val suit: Suit, val color: Color)
{
  fun isFace(): Boolean = value > 10
  fun isEven(): Boolean = value % 2 == 0
}

fun deckBuilder(): List<Card>
{
  val deck = ArrayList<Card>()

  for( i in 0..51 )
    when
    {
      i < 13 ->       deck.add( Card( i+1,      Suit.Spade,   Color.Black ) )
      i in 13..25 ->  deck.add( Card( (i%13)+1, Suit.Heart,   Color.Red ) )
      i in 26..38 ->  deck.add( Card( (i%13)+1, Suit.Diamond, Color.Red ) )
      else ->         deck.add( Card( (i%13)+1, Suit.Club,    Color.Black ) )
    }

  return deck
}

internal val deck = deckBuilder()

