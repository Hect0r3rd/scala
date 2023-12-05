id: file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala:[14..20) in Input.VirtualFile("file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala", "package com.
object Basics extends App
{
  //basic types and string operations
  val num : Int = 8
  val bool = false
  val str = "This is a string"
  val composedStr ="This"+" "+"is"+"also"+" "+"a"+" "+"string"
  val interpolatedStr =s"My favorite number is $num"

  //expressions, anything can be assigned as long as it can be reduced to a value leading to weird things like this
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
    //code blocks, similar to expressions but they can have values decarled inside them
    val cBlock=
        {
            val localVal=67
            
            localVal+3
        }
    def myFunc(x:Int,y:String):String=
    {            
        y+" "+x
    }
    //in scala normal iteration isn't normally used instead functions and recurrsion are used
    def fact(i:Int):Int=
    if(i<=1)
    {
        1
    }
    else
    {
        i+fact(i-1)
    }
    print(interpolatedStr)
}")
file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala
file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala:2: error: expected identifier; obtained object
object Basics extends App
^
#### Short summary: 

expected identifier; obtained object