package org.example.Prototype.Bad.E2;

public class Bad1 {
    ClassToCopy toCopy = new ClassToCopy(5);
    Copied copied = new Copied(5);
}

class ClassToCopy{
    private int field;
    private int otherField = 3;

    public ClassToCopy(int field){
        this.field = field;
    }
}

class Copied extends ClassToCopy{
    public Copied(int field){
        super(field);
    }
}