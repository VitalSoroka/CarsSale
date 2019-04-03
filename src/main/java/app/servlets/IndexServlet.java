package app.servlets;

import classes.User;
import classes.UserDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//@WebServlet("/start")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       ArrayList<User> users = UserDB.select();
        request.setAttribute("users", users);
        for (User user : users) {
            System.out.println(user.getName());
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
