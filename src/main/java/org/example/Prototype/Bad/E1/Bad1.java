package org.example.Prototype.Bad.E1;

public class Bad1 {
    ClassToCopy toCopy = new ClassToCopy(3);
    ClassToCopy copied = new ClassToCopy(toCopy.getField());

}

class ClassToCopy{
    private int field;
    public ClassToCopy(int field){
        this.field = field;
    }
    public int getField(){
        return this.field;
    }
}