import org.specs2.mutable._

class HelloWorldSpec extends Specification {
  val hello = new Main	

  "The 'Hello world' function" should {
    "contain 11 chars" in {
       hello.helloW must have size(11)
    }
    "start with 'Hello'" in {
      hello.helloW must startWith("Hello")
    }
    "end with 'world'" in {
      hello.helloW must endWith("world")
    }
  }
}
