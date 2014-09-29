package structure.composite

trait Sexp : Node {
    fun first():Node
    fun rest():Array<Node>
}