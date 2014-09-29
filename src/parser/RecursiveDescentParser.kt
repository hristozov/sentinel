package parser

import structure.composite.Sexp

class RecursiveDescentParser : Parser {
    override fun parse(contents: String): Array<Sexp> {
        return array()
    }
}