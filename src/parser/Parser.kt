package parser

import structure.Node

trait Parser {
    fun parse(contents:String) : Array<Node>
}

class ParserImpl : Parser {
    override fun parse(contents: String): Array<Node> {
        return array()
    }
}