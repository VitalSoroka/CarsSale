package classes;

import java.io.Serializable;

public class TypeAuto implements Serializable {
    private int typeAutoId;
    private String name;

    public int getTypeAutoId() {
        return typeAutoId;
    }

    public String getName() {
        return name;
    }

    public void setTypeAutoId(int typeAutoId) {
        this.typeAutoId = typeAutoId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
