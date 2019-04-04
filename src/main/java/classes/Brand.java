package classes;

import java.io.Serializable;

public class Brand implements Serializable {
    private int brandId;
    private String name;

    public int getBrandId() {
        return brandId;
    }

    public String getName() {
        return name;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public void setName(String name) {
        this.name = name;
    }

}
