import parser.RecursiveDescentParser
import structure.composite.PlusExpression
import structure.atomic.functional.numeric.Integral
import codegen.macho64.Macho64Generator
import structure.composite.Sexp

fun main(args: Array<String>) {
    var plusOperation = PlusExpression(array(Integral(3), Integral(4)))
    var program = array<Sexp>(plusOperation)
    var generator = Macho64Generator()
    println(generator.generate(program))
}