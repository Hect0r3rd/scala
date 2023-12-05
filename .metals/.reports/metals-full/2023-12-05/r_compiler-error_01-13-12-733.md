file:///C:/Users/susta/OneDrive/Desktop/CS/Organization%20of%20Programming%20Languages/scala/basics.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2Fsusta%2FOneDrive%2FDesktop%2FCS%2FOrganization%2520of%2520Programming%2520Languages%2Fscala%2Fbasics.scala:43: error: unclosed character literal
            ''
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
    //code block
    val cBlock=
        {
            val localVal=67
            ''
        }
}
```



#### Error stacktrace:

```
scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:23)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:33)
	scala.meta.internal.tokenizers.Reporter.syntaxError(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter.syntaxError$(Reporter.scala:25)
	scala.meta.internal.tokenizers.Reporter$$anon$1.syntaxError(Reporter.scala:33)
	scala.meta.internal.tokenizers.LegacyScanner.fetchSingleQuote$1(LegacyScanner.scala:438)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:443)
	scala.meta.internal.tokenizers.LegacyScanner.nextToken(LegacyScanner.scala:246)
	scala.meta.internal.tokenizers.LegacyScanner.foreach(LegacyScanner.scala:1044)
	scala.meta.internal.tokenizers.ScalametaTokenizer.uncachedTokenize(ScalametaTokenizer.scala:24)
	scala.meta.internal.tokenizers.ScalametaTokenizer.$anonfun$tokenize$1(ScalametaTokenizer.scala:17)
	scala.collection.concurrent.TrieMap.getOrElseUpdate(TrieMap.scala:961)
	scala.meta.internal.tokenizers.ScalametaTokenizer.tokenize(ScalametaTokenizer.scala:17)
	scala.meta.internal.tokenizers.ScalametaTokenizer$$anon$2.apply(ScalametaTokenizer.scala:332)
	scala.meta.tokenizers.Api$XtensionTokenizeDialectInput.tokenize(Api.scala:25)
	scala.meta.tokenizers.Api$XtensionTokenizeInputLike.tokenize(Api.scala:14)
	scala.meta.internal.parsers.ScannerTokens$.apply(ScannerTokens.scala:880)
	scala.meta.internal.parsers.ScalametaParser.<init>(ScalametaParser.scala:33)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:35)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:25)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:17)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:206)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:356)
```
#### Short summary: 

file%3A%2F%2F%2FC%3A%2FUsers%2Fsusta%2FOneDrive%2FDesktop%2FCS%2FOrganization%2520of%2520Programming%2520Languages%2Fscala%2Fbasics.scala:43: error: unclosed character literal
            ''
            ^