package game

import java.time.Instant
import kotlin.random.Random

data class Player( val name: String, var role: Role )
{
  var hand: List<Int> = ArrayList<Int>()

  init
  {
    var r = Random(0)

  }
}
