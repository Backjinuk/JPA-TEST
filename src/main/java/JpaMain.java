/*


import doamin.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em =  emf.createEntityManager();
        EntityTransaction tx =  em.getTransaction();

        tx.begin();

        try {
            Order order = new Order();


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
*/
