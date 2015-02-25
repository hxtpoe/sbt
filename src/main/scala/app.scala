import scheduler._

object main {
  def main(args: Array[String]):Unit = {

    lazy val scheduler = new scheduler("xx")

    scheduler.run()
  }
}