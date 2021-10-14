sealed trait Vehicle[A]
{

}

case class Car extends Vehicle[A]{}
case class Motobike extends Vehicle[A]{}
case class Boat extends Vehicle[A]{}

