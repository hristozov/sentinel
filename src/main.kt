import parser.RecursiveDescentParser
import structure.composite.PlusExpression
import structure.atomic.functional.numeric.Integral
import codegen.macho64.Macho64Generator
import structure.composite.Sexp
import parser.tokenizer.Tokenizer

fun main(args: Array<String>) {
    val parser = parser.RecursiveDescentParser();
    val plusOperation = parser.parse(Tokenizer("(+ 3 4)"))[0]
    val program = array<Sexp>(plusOperation)
    val generator = Macho64Generator()
    println(generator.generate(program))
}