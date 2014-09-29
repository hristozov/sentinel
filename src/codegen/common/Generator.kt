package codegen.common

import structure.composite.Sexp

trait Generator {
    fun generate(program: Array<Sexp>) : String
}
