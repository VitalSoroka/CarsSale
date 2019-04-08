package app.servlets;

import classes.Account;
import classes.AccountDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password  = request.getParameter("password");
        String login = request.getParameter("login");
        if (login.isEmpty() || password.isEmpty()) {
            request.setAttribute("message", "введите логин");
            getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
        }
        else {
            Account account = AccountDB.selectByLogin(login);
            if (account != null && account.getPassword().equals(password)) {
                response.sendRedirect( request.getContextPath()+"/myAuto?account_id="+account.getAccountId()+
                        "&password="+account.getPassword().hashCode());
            } else {
                request.setAttribute("message", "не правильне логин или пароль");
                getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", null);
        getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
    }
}
