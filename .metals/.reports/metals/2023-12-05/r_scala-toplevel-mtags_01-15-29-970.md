id: file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala:[824..825) in Input.VirtualFile("file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala", "object Basics extends App
{
  //basic types and string operations
  val num : Int = 8
  val bool = false
  val str = "This is a string"
  val composedStr ="This"+" "+"is"+"also"+" "+"a"+" "+"string"
  val interpolatedStr =s"My favorite number is $num"

  //expressions, anything can be assigned as long as it can be reduced to a value
  val exp=2+3

  val ifExp=
    if(num>10)
    {
        21
    }
    else
    {
        999
    }
  val chainIfExp=
    if(num>10)
    {
        21
    }
    else if(num<0)
    {
        -8
    }
    else if(num>999)
    {
        80
    }
    else
    {
        0
    }
    //code blocks, similar to expressions mixed with functions
    val cBlock=
        {
            val localVal=67
            
            localVal+3
        }
    def
}")
file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala
file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala:47: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace