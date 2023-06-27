package hellojpa;

import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager manager =  emf.createEntityManager();

        EntityTransaction tx =  manager.getTransaction();
        tx.begin();

        try {
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("진욱2");          manager.persist(member);
            Member findmember = manager.find(Member.class, 1L);
            findmember.setName("HelloJPA");

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            manager.close();
        }
        emf.close();
    }
}
