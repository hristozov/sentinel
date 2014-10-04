package parser

import structure.composite.Sexp
import parser.tokenizer.Tokenizer
import parser.tokenizer.Token
import structure.atomic.functional.arithmetic.Plus
import structure.composite.Node
import structure.atomic.functional.numeric.Integral
import structure.composite.PlusExpression

class RecursiveDescentParser : Parser {
    override fun parse(tokenizer: Tokenizer): Array<Sexp> {
        var plusOperation = plusOperation(tokenizer) as Sexp;
        return array(plusOperation);
    }

    private fun whitespace(token: Token): Boolean {
        return ' ' == token.token
    }

    private fun lparen(token: Token): Boolean {
        return '(' == token.token
    }

    private fun rparen(token: Token): Boolean {
        return ')' == token.token
    }

    private fun plus(token: Token): Node? {
        // hehe
        if ('+' == token.token) {
            return Plus()
        }
        return null;
    }

    private fun digit(token: Token): Integral? {
        return Integral(token.token.toString().toInt());
    }

    private fun plusOperation(input: Tokenizer): Sexp? {
        if (!lparen(input.nextToken())) {
            return null;
        }

        val plus = plus(input.nextToken());
        if (plus == null) {
            return null;
        }

        if (!whitespace(input.nextToken())) {
            return null;
        }
        val digit1 = digit(input.nextToken());
        if (digit1 == null) {
            return null;
        }

        if (!whitespace(input.nextToken())) {
            return null;
        }
        val digit2 = digit(input.nextToken());
        if (digit2 == null) {
            return null;
        }

        if(!rparen(input.nextToken())) {
            return null;
        }

        return PlusExpression(array(digit1, digit2))
    }
}