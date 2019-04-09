package app.servlets;

import classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String login = request.getParameter("login");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String confPassword = request.getParameter("password_confirmation");
        if(name.isEmpty() | lastName.isEmpty() | phone.isEmpty()){
            request.setAttribute("message", "введите свои данные");
            getServletContext().getRequestDispatcher("/view/registration.jsp").forward(request,response);
        }
        if(login.isEmpty() | password.isEmpty() | confPassword.isEmpty()){
            request.setAttribute("message", "введите логин и пароль");
            getServletContext().getRequestDispatcher("/view/registration.jsp").forward(request,response);
        }
        if(!password.equals(confPassword)){
            request.setAttribute("message", "пароли не совпадают");
            getServletContext().getRequestDispatcher("/view/registration.jsp").forward(request,response);
        }
        if(AccountDB.selectByLogin(login) != null){
            request.setAttribute("message", "Пользователь с таким логином существует");
            getServletContext().getRequestDispatcher("/view/registration.jsp").forward(request,response);
        }
        if(!phone.matches("^((8|\\+375)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")){
            request.setAttribute("message", "Не правильный номер");
            getServletContext().getRequestDispatcher("/view/registration.jsp").forward(request,response);
        }
        Account account = new Account();
        account.setPassword(password);
        account.setLogin(login);
        AccountDB.insert(account);
        int accountId = AccountDB.selectByLogin(login).getAccountId();
        User user = new User(name, lastName, accountId);
        UserDB.insert(user);
        PhoneDB.insert(new Phone(phone, user.getUserId()));
        getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", null);
        getServletContext().getRequestDispatcher("/view/registration.jsp").forward(request,response);

    }
}
