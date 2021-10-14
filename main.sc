sealed trait Vehicle {}

class Car(s: String) extends Vehicle {
  val Immatriculation = ""

  def debugVars(): Any = {
    val vars = this.getClass.getDeclaredFields
    for (v <- vars) {
      v.setAccessible(true)
      println("Field: " + v.getName() + " => " + v.get(this))
    }
  }
  def display() = {
    println("name: " + s);

  }
}
class Motobike extends Vehicle {}
class Boat extends Vehicle {}



object Main {

  def main(args: Array[String]) = {

    val car: Car = new Car("Zoé");

    val motobike = new Motobike();
    val yacht = new Boat()

   
    car.debugVars()
    car.display()
  }
}

