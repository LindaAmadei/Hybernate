import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")
public class Classes {


    //creo tabella
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;

    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;

    public Classes() {
    }

    public Classes(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
  