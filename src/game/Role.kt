package game

interface Role
{
  fun selectCards(): IntArray { return  intArrayOf( -1, -1, -1, -1 ) }
  fun validate( lastSixCards: IntArray, playedCards: IntArray ): Boolean { return false }
  fun becomeProphet() {}
  fun declareNothingToPlay() {}
}

class Researcher : Role
{
  override fun selectCards(): IntArray
  {

    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun becomeProphet()
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun declareNothingToPlay()
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}

class Prophet : Role
{
  override fun selectCards(): IntArray
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun validate(lastSixCards: IntArray, playedCards: IntArray): Boolean
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}

class GameMaster : Role
{
  override fun selectCards(): IntArray
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun validate(lastSixCards: IntArray, playedCards: IntArray): Boolean
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}