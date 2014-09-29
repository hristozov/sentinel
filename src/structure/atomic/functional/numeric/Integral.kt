package structure.atomic.functional.numeric

import structure.atomic.Atom

class Integral(content: Int) : Atom {
    public var content: Int?;

    {
        this.content = content
    }
}