package hellojpa;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Member {
    public Member(){ }

    @Id
    @GeneratedValue
    @Column(name = "memberId")
    private Long id;

    @Column(name = "username", nullable = false )
    private String UserName;

}
