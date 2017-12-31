import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginController", urlPatterns = "/success")
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao userDAO = new UserDao();
        User user = userDAO.getUser(3);
        request.setAttribute("username",username);
        //Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );

        if(user.getUserName().equals(username) && user.getPassword1().equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("sessionKoi",username);
            Cookie userName = new Cookie("user", "123456");
            response.addCookie(userName);
            response.sendRedirect("userlist");
        }else{
            request.setAttribute("errorMessage","Please provide correct login details");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

}
