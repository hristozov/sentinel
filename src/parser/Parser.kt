package parser

import structure.Sexp

trait Parser {
    fun parse(contents:String) : Array<Sexp>
}
