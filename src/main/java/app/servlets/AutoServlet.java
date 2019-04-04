package app.servlets;

import classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auto")
public class AutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sAutoId = request.getParameter("auto_id");
        System.out.println("s0");
        int autoId = Integer.parseInt(sAutoId);
        if(autoId < 1) {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
        System.out.println("s1");
        Auto auto = AutoDB.select(autoId);
        if (auto == null) {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        }
        System.out.println("step1");
        auto.setBrand(BrandDB.select(auto.getBrandId()));
        auto.setTypeAuto(TypeAutoDB.select(auto.getTypeAutoId()));
        User user = UserDB.select(auto.getUserId());
        Phone phone = PhoneDB.selectByUserId(auto.getUserId());
        request.setAttribute("auto", auto);
        request.setAttribute("user", user);
        request.setAttribute("phone", phone);
        System.out.println("step2");
        getServletContext().getRequestDispatcher("/view/autoInf.jsp").forward(request,response);
    }
}
