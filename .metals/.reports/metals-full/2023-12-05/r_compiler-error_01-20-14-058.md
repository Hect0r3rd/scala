file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2Fsusta%2FOneDrive%2FDesktop%2FCS%2FOrganization%2520of%2520Programming%2520Languages%2Fscala%2Fbasics.scala:51: error: illegal start of simple expression
}
^

occurred in the presentation compiler.

action parameters:
uri: file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala
text:
```scala
object Basics extends App
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
    def myFunc(x:Int,y:String):String=
    {            
        y+" "+x
    }
    def fact(i:Int):Int=
}
```



#### Error stacktrace:

```
scala.meta.internal.parsers.ScalametaParser.simpleExpr0(ScalametaParser.scala:2225)
	scala.meta.internal.parsers.ScalametaParser.simpleExpr(ScalametaParser.scala:2178)
	scala.meta.internal.parsers.ScalametaParser.prefixExpr(ScalametaParser.scala:2161)
	scala.meta.internal.parsers.ScalametaParser.postfixExpr(ScalametaParser.scala:2035)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$expr$2(ScalametaParser.scala:1616)
	scala.meta.internal.parsers.ScalametaParser.atPosOpt(ScalametaParser.scala:315)
	scala.meta.internal.parsers.ScalametaParser.autoPosOpt(ScalametaParser.scala:359)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1521)
	scala.meta.internal.parsers.ScalametaParser.expr(ScalametaParser.scala:1420)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$funDefRest$1(ScalametaParser.scala:3751)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:361)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:366)
	scala.meta.internal.parsers.ScalametaParser.funDefRest(ScalametaParser.scala:3713)
	scala.meta.internal.parsers.ScalametaParser.funDefOrDclOrExtensionOrSecondaryCtor(ScalametaParser.scala:3659)
	scala.meta.internal.parsers.ScalametaParser.defOrDclOrSecondaryCtor(ScalametaParser.scala:3489)
	scala.meta.internal.parsers.ScalametaParser.nonLocalDefOrDcl(ScalametaParser.scala:3468)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$templateStat$1.applyOrElse(ScalametaParser.scala:4439)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$templateStat$1.applyOrElse(ScalametaParser.scala:4433)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:231)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:230)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4384)
	scala.meta.internal.parsers.ScalametaParser.getStats$2(ScalametaParser.scala:4423)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$scala$meta$internal$parsers$ScalametaParser$$templateStatSeq$3(ScalametaParser.scala:4424)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$scala$meta$internal$parsers$ScalametaParser$$templateStatSeq$3$adapted(ScalametaParser.scala:4421)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:517)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$templateStatSeq(ScalametaParser.scala:4421)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$templateStatSeq(ScalametaParser.scala:4413)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateBody$1(ScalametaParser.scala:4264)
	scala.meta.internal.parsers.ScalametaParser.inBracesOr(ScalametaParser.scala:253)
	scala.meta.internal.parsers.ScalametaParser.inBraces(ScalametaParser.scala:249)
	scala.meta.internal.parsers.ScalametaParser.templateBody(ScalametaParser.scala:4264)
	scala.meta.internal.parsers.ScalametaParser.templateBodyOpt(ScalametaParser.scala:4268)
	scala.meta.internal.parsers.ScalametaParser.templateAfterExtends(ScalametaParser.scala:4211)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$template$1(ScalametaParser.scala:4232)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:312)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:358)
	scala.meta.internal.parsers.ScalametaParser.template(ScalametaParser.scala:4219)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateOpt$1(ScalametaParser.scala:4257)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:312)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:358)
	scala.meta.internal.parsers.ScalametaParser.templateOpt(ScalametaParser.scala:4249)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$objectDef$1(ScalametaParser.scala:3951)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:361)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:366)
	scala.meta.internal.parsers.ScalametaParser.objectDef(ScalametaParser.scala:3943)
	scala.meta.internal.parsers.ScalametaParser.tmplDef(ScalametaParser.scala:3820)
	scala.meta.internal.parsers.ScalametaParser.topLevelTmplDef(ScalametaParser.scala:3801)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4405)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4393)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:231)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:230)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4384)
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

file%3A%2F%2F%2FC%3A%2FUsers%2Fsusta%2FOneDrive%2FDesktop%2FCS%2FOrganization%2520of%2520Programming%2520Languages%2Fscala%2Fbasics.scala:51: error: illegal start of simple expression
}
^