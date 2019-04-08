package app.servlets;

import classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
@SuppressWarnings("Duplicates")
@WebServlet("/deleteAuto")
public class DeleteAutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sAccountId = request.getParameter("account_id");
        int autoId = Integer.parseInt(request.getParameter("auto_id"));
        if(sAccountId != null && !sAccountId.isEmpty()){
            Account account = AccountDB.select(Integer.parseInt(sAccountId));
            if(account == null){
                request.setAttribute("message", null);
                getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
            }
            if(account.getPassword().hashCode() == Integer.parseInt(request.getParameter("password"))){
                AutoDB.delete(autoId);
                request.setAttribute("password", request.getParameter("password"));
                request.setAttribute("account_id", request.getParameter("account_id"));
                getServletContext().getRequestDispatcher("/view/myAuto.jsp").forward(request,response);
            }
        }
        else {
            request.setAttribute("message", null);
            getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
