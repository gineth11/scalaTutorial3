import math.Pi
object answer3{

  def main(args: Array[String]): Unit = {
    
    def volume(r:Int):Double= (4/3)*Pi*r*r*r
    printf("Volume of the Sphere is : %.2f",volume(5))
  }
}