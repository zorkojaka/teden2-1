import org.specs2.mutable._

class Week2Tests extends Specification {
  val solution = new Main

  "The set functions" should {
    "create the correct singleton" in {
      val s1 = solution.singleton(5)
      s1(5) mustEqual true
      s1(4) mustEqual false
      s1(6) mustEqual false
    }
    //etc. TODO

  }

  "The real functions" should {
    //TODO
  }

  "The coding functions" should {
    //TODO
  }
}
