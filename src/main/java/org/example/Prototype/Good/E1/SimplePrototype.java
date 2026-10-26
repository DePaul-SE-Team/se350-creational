package org.example.Prototype.Good.E1;

public class SimplePrototype {
    public static void main (String [] args){
        TryingToClone clone = new TryingToClone(3);
        TryingToClone cloned = clone.clone();
        System.out.println("same object? " + (clone == cloned)); // it has the same memory address -> you want it to be different memory?
        System.out.println("same content? " + (clone.equals(cloned)));
    }
}

class TryingToClone{
    private int field;
    TryingToClone(int field){
        this.field = field;
    }
    public TryingToClone clone(){
        return new TryingToClone(this.field); // parameter will explode
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof TryingToClone){
            return this.field == ((TryingToClone) obj).field;
        }
        return false;
    }
}


