package models;

public class Base {
    public String id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base p = (Base) obj;

            if (this.id.equals(p.id)) {
                return true;
            }
        }
        return false;
    }
}
