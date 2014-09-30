package structure.atomic.functional.numeric

import structure.atomic.Atom

class Integral(content: Int) : Atom {
    public val content: Int?;

    {
        this.content = content
    }
}