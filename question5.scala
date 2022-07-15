object answer5{

  def main(args: Array[String]): Unit = {
    
    def easy(e:Int):Int=e*8
    def tempo(t:Int):Int=t*7
    def total(e:Int,t:Int)=easy(e)+tempo(t)
    
    printf("Total Running Time : %d minutes",total(4,3))
  }
}