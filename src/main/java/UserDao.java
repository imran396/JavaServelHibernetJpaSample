
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDao {
    public void addUserDetails(String userName, String password, String email,
                               String phone, String city) {
        try {
            // 3. Get Session object
            Session session = getSession();

            // 4. Starting Transaction
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setUserName(userName);
            user.setPassword1(password);
            user.setEmail(email);
            user.setCity(city);
            user.setPhone(phone);
            session.save(user);
            transaction.commit();
            System.out.println("\n\n Details Added \n");

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
    }


    public User getUser(int user_id)
    {
        Session session = getSession();
        return (User) session.get(User.class, user_id);
    }

    private static Session getSession() {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory.openSession();
    }

    public  List<User>getUsers(){
        Session session = getSession();
        String sql = "SELECT * FROM USER";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(User.class);
        return (List<User>) query.list();
    }
}
