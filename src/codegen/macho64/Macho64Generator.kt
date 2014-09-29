package codegen.macho64

import codegen.common.Generator
import structure.composite.Sexp
import structure.atomic.functional.arithmetic.Plus
import structure.composite.PlusExpression
import structure.atomic.functional.numeric.Integral

class Macho64Generator : Generator {
    override fun generate(program: Array<Sexp>): String {
        var header = """.globl start
start:""";
        var intermediate = visit(program[0]);
        var footer = """
    movl %ebx, %edi
    movl $0x2000001, %eax
    syscall"""
        return header + intermediate + footer;
    }

    private fun visit(sexp : Sexp) : String {
        return when (sexp) {
            is PlusExpression -> {
                var plusExpression = sexp as PlusExpression
                var op1 = (plusExpression.rest()[0] as Integral).content
                var op2 = (plusExpression.rest()[1] as Integral).content

                return """
    mov $${op1}, %ax
    mov $${op2}, %bx
    add %ax, %bx"""
            }
            else -> ""
        }
    }
}