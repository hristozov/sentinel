package parser

import structure.composite.Sexp
import parser.tokenizer.Tokenizer

trait Parser {
    fun parse(tokenizer: Tokenizer): Array<Sexp>
}
