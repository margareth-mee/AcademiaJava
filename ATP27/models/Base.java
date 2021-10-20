package models;

public class Base {
    public int id;

    @Override
    public String toString() {
        return "ID: " + id;
    }
    
    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Base){
            Base base = (Base)obj;
            
            if(this.id == base.id){
                return true;
            }
        }

    return false;
    }
}
