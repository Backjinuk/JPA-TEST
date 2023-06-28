package hellojpa;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MBR")
@Data
public class Member {
    @Id
    private Long id;

    @Column(unique = true, length = 10)
    private String name;
    private int age;
    public Member(){  }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
