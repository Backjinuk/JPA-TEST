package hellojpa;

import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em =  emf.createEntityManager();
        EntityTransaction tx =  em.getTransaction();

        tx.begin();

        try {
            Member member = new Member();
            member.setUserName("member1");
            em.persist(member);

            Team team = new Team();
            team.setName("teamA");
            team.getMembers().add(member);
            em.persist(team);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
            e.printStackTrace(); //추가
        }finally {
            em.close();
        }
        emf.close();
    }
}
