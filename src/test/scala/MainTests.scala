import org.specs2.mutable._

class Week2Tests extends Specification {
  val solution = new Main	

  
    val s = solution.singleton(5)
       "contains 5" ! s(5) 
       //s(4) must be(false)
       //s(6) must be(false)

  "The interval function" should {
    //success
  }

  "The union function" should {
    //success
  }

  "The intersect function" should {
    //success
  }



}
