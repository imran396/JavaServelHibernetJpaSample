

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserListController", urlPatterns = "/userlist")
public class UserListController extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.getAttribute("sessionKoi").toString();
        String sesionId = "123456";
        Cookie loginCookie = null;
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    if(!sesionId.equals(cookie.getValue())){
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }else{
                        UserDao userDAO = new UserDao();
                        List<User> users = userDAO.getUsers();
                        request.setAttribute("users",users);
                        request.getRequestDispatcher("users.jsp").forward(request, response);
                    }
                }
            }

        }

    }


}