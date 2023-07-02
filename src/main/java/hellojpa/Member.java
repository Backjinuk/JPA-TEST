package hellojpa;

import lombok.Data;
import javax.persistence.*;

//@Entity
//@Data
//@SequenceGenerator(
//name = "MEMBER_SEQ_GENERATOR",
//        sequenceName = "MEMBER_SEQ",
//        initialValue = 1, allocationSize = 50)
public class Member {

 //   @Id
 //   @GeneratedValue(strategy = GenerationType.SEQUENCE,
 //               generator = "MEMBER_SEQ_GENERATOR")
    private Long id;

  //  @Column(name = "name", nullable = false )
    private String UserName;

    public Member(){ }
}
