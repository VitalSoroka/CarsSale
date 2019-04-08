package app.servlets;

import classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/auto")
public class AutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sAutoId = request.getParameter("auto_id");
        int autoId = Integer.parseInt(sAutoId);
        if(autoId < 1) {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
        Auto auto = AutoDB.select(autoId);
        if (auto == null) {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        }
        auto.setBrand(BrandDB.select(auto.getBrandId()));
        User user = UserDB.select(auto.getUserId());
        ArrayList<Phone> phones = PhoneDB.selectByUserId(auto.getUserId());
        request.setAttribute("auto", auto);
        request.setAttribute("user", user);
        request.setAttribute("phones", phones);
        getServletContext().getRequestDispatcher("/view/autoInf.jsp").forward(request,response);
    }
}
