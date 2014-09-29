package parser

import structure.Sexp

class RecursiveDescentParser : Parser {
    override fun parse(contents: String): Array<Sexp> {
        return array()
    }
}