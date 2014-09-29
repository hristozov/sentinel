package parser

import structure.composite.Sexp

trait Parser {
    fun parse(contents:String) : Array<Sexp>
}
