package Bean;

public class ProduitDto {
    private Integer id;
    private String description;

    @Override
    public String toString() {
        return "ProduitDto [id= "+ id +" description "+ description+" toString()="+super.toString()+"]" ;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
