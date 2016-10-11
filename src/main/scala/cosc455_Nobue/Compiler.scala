package cosc455_Nobue

/**
  * Created by nruben1 on 10/11/2016.
  */
object Compiler {
  var fileContents : String = **
  var currentToken : string = **

  def main(args: Array[String])= {
   // println(args{0})
   // check usage
    checkFile(args)
    readFile(args{0})

  }

}
