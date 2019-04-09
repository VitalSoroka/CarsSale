package app.servlets;

import classes.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/myAuto")
public class MyAutosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
    @SuppressWarnings("Duplicates")
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sAccountId = request.getParameter("account_id");
        if(sAccountId != null && !sAccountId.isEmpty()){
            Account account = AccountDB.select(Integer.parseInt(sAccountId));
            if(account == null){
                request.setAttribute("message", null);
                getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
            }
            if(account.getPassword().hashCode() == Integer.parseInt(request.getParameter("password"))){
                int userId = UserDB.selectByAccountId(Integer.parseInt(sAccountId)).getUserId();
                ArrayList<Auto> autos = AutoDB.selectByUserId(userId);
                for(int i = 0; i < autos.size(); i++){
                    autos.get(i).setBrand(BrandDB.select(autos.get(i).getBrandId()));
                }
                request.setAttribute("autos", autos);
                request.setAttribute("password", account.getPassword().hashCode());
                request.setAttribute("account_id", account.getAccountId());
                getServletContext().getRequestDispatcher("/view/myAuto.jsp").forward(request,response);
            }
        }
        else {
            request.setAttribute("message", null);
            getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
        }
    }
}
