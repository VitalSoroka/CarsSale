package app.servlets;

import classes.*;

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
        final ArrayList<Auto> autos = AutoDB.select();
        for (int i = 0; i<autos.size(); i++) {
            Auto auto = autos.get(i);
            Brand brand = BrandDB.select(auto.getBrandId());
            System.out.println(auto.getBrandId());
            if (brand == null) {
                brand = new Brand();
                brand.setName("...");
            }
            auto.setBrand(brand);

        }
        for (Auto auto : autos) {
            System.out.println(auto.getBrand().getName());
        }
        System.out.println("Успешно");
        request.setAttribute("autos", autos);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

    }
}
