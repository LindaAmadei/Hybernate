import javax.persistence.*;


@Entity
@Table
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "fk_classes")
    private Classes classes;

    public Enrollments(){}

    public Enrollments(int id, Student student, Classes classes){
        this.id = id;
        this.classes= classes;
        this.student= student;

    }

    public int getId() {
        return id;
    }

    public Classes getClasses() {
        return classes;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

