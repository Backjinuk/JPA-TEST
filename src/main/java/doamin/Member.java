/*
package doamin;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String streat;
    private String zipcode;

    @OneToMany(mappedBy = "MEMBER_ID")
    private List<Order> orders = new ArrayList<>();
}
*/
