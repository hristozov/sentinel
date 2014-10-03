package parser.tokenizer

class Tokenizer(input: String) {
    private var idx = 0;
    public val input: String;
    {
        this.input = input;
    }

    public fun nextToken(): Token {
        return Token(input.charAt(idx++));
    }

    public fun previousToken(): Token {
        return Token(input.charAt(idx--));
    }

    public fun atEnd(): Boolean {
        return idx >= input.length;
    }

    public fun atStart(): Boolean {
        return idx < 0;
    }
}