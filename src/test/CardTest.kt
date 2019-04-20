package eleusis.test

import kotlin.test.assertTrue
import eleusis.game.*

class CardTest
{
  @Test fun cardIsFace()
  {
    // Assertions.assertFalse( Card(1, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(2, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(3, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(4, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(5, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(6, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(7, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(8, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(9, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertFalse( Card(10, Suit.Spide, Color.Black).isFace() )

    // Assertions.assertTrue( Card(11, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertTrue( Card(12, Suit.Spide, Color.Black).isFace() )
    // Assertions.assertTrue( Card(13, Suit.Spide, Color.Black).isFace() )

    assertFalse( Card(1, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(2, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(3, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(4, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(5, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(6, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(7, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(8, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(9, Suit.Spide, Color.Black).isFace() )
    assertFalse( Card(10, Suit.Spide, Color.Black).isFace() )

    assertTrue( Card(11, Suit.Spide, Color.Black).isFace() )
    assertTrue( Card(12, Suit.Spide, Color.Black).isFace() )
    assertTrue( Card(13, Suit.Spide, Color.Black).isFace() )
  }
}

