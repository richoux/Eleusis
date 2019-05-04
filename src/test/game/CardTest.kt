package game

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class CardTest
{

    @Test
    fun isFace()
    {
        assertFalse(Card(1, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(2, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(3, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(4, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(5, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(6, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(7, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(8, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(9, Suit.Spide, Color.Black).isFace())
        assertFalse(Card(10, Suit.Spide, Color.Black).isFace())

        assertTrue(Card(11, Suit.Spide, Color.Black).isFace())
        assertTrue(Card(12, Suit.Spide, Color.Black).isFace())
        assertTrue(Card(13, Suit.Spide, Color.Black).isFace())
    }

    @Test
    fun isEven()
    {
        assertFalse(Card(1, Suit.Spide, Color.Black).isEven())
        assertTrue(Card(2, Suit.Spide, Color.Black).isEven())
        assertFalse(Card(3, Suit.Spide, Color.Black).isEven())
        assertTrue(Card(4, Suit.Spide, Color.Black).isEven())
        assertFalse(Card(5, Suit.Spide, Color.Black).isEven())
        assertTrue(Card(6, Suit.Spide, Color.Black).isEven())
        assertFalse(Card(7, Suit.Spide, Color.Black).isEven())
        assertTrue(Card(8, Suit.Spide, Color.Black).isEven())
        assertFalse(Card(9, Suit.Spide, Color.Black).isEven())
        assertTrue(Card(10, Suit.Spide, Color.Black).isEven())
        assertFalse(Card(11, Suit.Spide, Color.Black).isEven())
        assertTrue(Card(12, Suit.Spide, Color.Black).isEven())
        assertFalse(Card(13, Suit.Spide, Color.Black).isEven())
    }
}