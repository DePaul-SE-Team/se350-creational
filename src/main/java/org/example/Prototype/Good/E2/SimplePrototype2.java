package org.example.Prototype.Good.E2;

public class SimplePrototype2 {
    public static void main (String [] args){
        TryingToClone2 clone = new TryingToClone2(2);
        TryingToClone2 cloned = clone.clone();
        System.out.println("same object? " + (clone == cloned)); // it has the same memory address -> you want it to be different memory?
        System.out.println("same content? " + (clone.equals(cloned))); // it has the same memory address -> you want it to be different memory?
    }
}

class TryingToClone2{
    private int field;
    TryingToClone2(int field){
        this.field = field;
    }

    TryingToClone2(TryingToClone2 clone){
        this(clone.field); //  you only clone
    }
    public TryingToClone2 clone(){
        return new TryingToClone2(this);
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof TryingToClone2){
            return this.field == ((TryingToClone2) obj).field;
        }
        return false;
    }
}


