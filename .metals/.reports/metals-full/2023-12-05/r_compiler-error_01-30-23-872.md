file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2Fsusta%2FOneDrive%2FDesktop%2FCS%2FOrganization%2520of%2520Programming%2520Languages%2Fscala%2Fbasics.scala:1: error: illegal start of definition identifier
o
^

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala
text:
```scala
o
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
}
```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4386)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$13(ScalametaParser.scala:4618)
	scala.Option.getOrElse(Option.scala:201)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4618)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:312)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:358)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4574)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4567)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:312)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:358)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4567)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4572)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:135)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:132)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:59)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:54)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:132)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:29)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:36)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:356)
```
#### Short summary: 

file%3A%2F%2F%2FC%3A%2FUsers%2Fsusta%2FOneDrive%2FDesktop%2FCS%2FOrganization%2520of%2520Programming%2520Languages%2Fscala%2Fbasics.scala:1: error: illegal start of definition identifier
o
^