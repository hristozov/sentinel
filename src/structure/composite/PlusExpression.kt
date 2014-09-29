package structure.composite

import structure.atomic.functional.arithmetic.Plus
import structure.atomic.functional.numeric.Integral

class PlusExpression(args: Array<Integral>) : Sexp {
    private var args: Array<Integral>;

    {
        this.args = args;
    }

    override fun first(): Node {
        return Plus();
    }

    override fun rest(): Array<Node> {
        var result = array<Node>().toList() + args.toList();
        return result.copyToArray();
    }

}