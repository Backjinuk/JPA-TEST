package hellojpa;

import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaMain {
/*    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em =  emf.createEntityManager();
        EntityTransaction tx =  em.getTransaction();

        tx.begin();

        try {
            Member member1 = new Member();
            //member1.setUserName("A");

            Member member2 = new Member();
            //member2.setUserName("B");
            Member member3 = new Member();
            member3.setUserName("C");

            System.out.println("======================================");

            em.persist(member1);
            em.persist(member2);
            em.persist(member3);

            System.out.println("member. id = " + member1.getId());
            System.out.println("member. id = " + member2.getId());
            System.out.println("member. id = " + member3.getId());
            System.out.println("======================================");

            tx.commit();
        }catch (Exception e){
            tx.rollback();
            e.printStackTrace(); //추가
        }finally {
            em.close();
        }
        emf.close();
    }*/
}
