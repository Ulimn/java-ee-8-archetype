package sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleEntity {

    public SampleEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
