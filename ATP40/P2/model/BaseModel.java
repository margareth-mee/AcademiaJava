package P2.model;

public class BaseModel {
    public String id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BaseModel){
            BaseModel outro = (BaseModel)obj;
            if(outro.id == this.id){
                return true;
            }
        }
        return false;
    }
}
