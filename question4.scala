object answer4{

  def main(args: Array[String]): Unit = {
    
    def init(c:Int):Double=24.95*0.6*c
    def shipping(c:Int):Double=if(c>50) (150+(c-50)*0.75).toDouble else (c*3).toDouble
    def cost(c:Int):Double=init(c)+shipping(c)
    printf("Final Cost is %.2f",cost(60))
    
  }
}