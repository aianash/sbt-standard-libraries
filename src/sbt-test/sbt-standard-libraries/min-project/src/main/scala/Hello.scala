import akka.actor.Actor

object Hello {
  def main(args: Array[String]) {
    println("hello world")
  }
}

class HelloActor extends Actor {
  def receive = {
    case x: String => sender() ! x
  }
}