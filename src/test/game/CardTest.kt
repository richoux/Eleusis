package game

import org.junit.Test

import org.junit.Assert.*

class CardTest
{

    @Test
    fun isFace()
    {
        assertFalse( deck[0].isFace() )
        assertFalse( deck[9].isFace() )
        assertTrue( deck[10].isFace() )
        assertTrue( deck[12].isFace() )

        assertFalse( deck[13].isFace() )
        assertFalse( deck[22].isFace() )
        assertTrue( deck[23].isFace() )
        assertTrue( deck[25].isFace() )

        assertFalse( deck[26].isFace() )
        assertFalse( deck[35].isFace() )
        assertTrue( deck[36].isFace() )
        assertTrue( deck[38].isFace() )

        assertFalse( deck[39].isFace() )
        assertFalse( deck[48].isFace() )
        assertTrue( deck[49].isFace() )
        assertTrue( deck[51].isFace() )
    }

    @Test
    fun isEven()
    {
        assertFalse( deck[0].isEven() )
        assertTrue( deck[9].isEven() )
        assertFalse( deck[10].isEven() )
        assertTrue( deck[11].isEven() )
        assertFalse( deck[12].isEven() )

        assertFalse( deck[13].isEven() )
        assertTrue( deck[22].isEven() )
        assertFalse( deck[23].isEven() )
        assertTrue( deck[24].isEven() )
        assertFalse( deck[25].isEven() )

        assertFalse( deck[26].isEven() )
        assertTrue( deck[35].isEven() )
        assertFalse( deck[36].isEven() )
        assertTrue( deck[37].isEven() )
        assertFalse( deck[38].isEven() )

        assertFalse( deck[39].isEven() )
        assertTrue( deck[48].isEven() )
        assertFalse( deck[49].isEven() )
        assertTrue( deck[50].isEven() )
        assertFalse( deck[51].isEven() )
    }

    @Test
    fun testSuit()
    {
        assertTrue( deck[0].suit == Suit.Spade )
        assertTrue( deck[12].suit == Suit.Spade )

        assertTrue( deck[13].suit == Suit.Heart )
        assertTrue( deck[25].suit == Suit.Heart )

        assertTrue( deck[26].suit == Suit.Diamond )
        assertTrue( deck[38].suit == Suit.Diamond )

        assertTrue( deck[39].suit == Suit.Club )
        assertTrue( deck[51].suit == Suit.Club )
    }

    @Test
    fun testColor()
    {
        assertTrue( deck[0].color == Color.Black )
        assertTrue( deck[12].color == Color.Black )

        assertTrue( deck[13].color == Color.Red )
        assertTrue( deck[25].color == Color.Red )

        assertTrue( deck[26].color == Color.Red )
        assertTrue( deck[38].color == Color.Red )

        assertTrue( deck[39].color == Color.Black )
        assertTrue( deck[51].color == Color.Black )
    }
}