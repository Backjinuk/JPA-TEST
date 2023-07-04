package hellojpa;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "teamId")
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "teamId")
    private List<Member> members = new ArrayList<>();

}
