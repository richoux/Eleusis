package game

interface Role
{
  fun selectCards(): Array<Card?> { return arrayOfNulls<Card>(4) }
  fun validate( lastSixCards: Array<Card?>, playedCards: Array<Card?> ): Boolean { return false }
  fun becomeProphet() {}
  fun declareNothingToPlay() {}
}

class Researcher : Role
{
  override fun selectCards(): Array<Card?>
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
  override fun selectCards(): Array<Card?>
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun validate(lastSixCards: Array<Card?>, playedCards: Array<Card?>): Boolean
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}

class GameMaster : Role
{
  override fun selectCards(): Array<Card?>
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun validate(lastSixCards: Array<Card?>, playedCards: Array<Card?>): Boolean
  {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}