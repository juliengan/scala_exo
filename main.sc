sealed trait Vehicle(s:String)
{
  var name = ""
}
object Vehicle
{
  def apply(name: String): Vehicle = {
        var p = new Vehicle
        p.name = name
      
  }
}
class Car extends Vehicle
{
  var name = ""  
}
class Motobike extends Vehicle{}
class Boat extends Vehicle{}

object Main
{
      
    // Driver code
    def main(args: Array[String]) =
    {
          
        // Creating object of the derived class
        val v = new Vehicle("Tesla");
        val car = new Car();
        val motobike = new Motobike();
        
        v.name;
    }
}

