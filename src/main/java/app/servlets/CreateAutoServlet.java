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
@WebServlet("/createAuto")
public class CreateAutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sAccountId = request.getParameter("account_id");
        if(sAccountId != null && !sAccountId.isEmpty()){
            Account account = AccountDB.select(Integer.parseInt(sAccountId));
            if(account == null){
                request.setAttribute("message", null);
                getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
            }
            if(account.getPassword().hashCode() == Integer.parseInt(request.getParameter("password"))){
                int userId = UserDB.selectByAccountId(Integer.parseInt(sAccountId)).getUserId();
                String sBrandId = request.getParameter("brand_id");
                String nameModel = request.getParameter("name_model");
                String sCost = request.getParameter("cost");
                String sYearOfIssue = request.getParameter("year_of_issue");
                String color = request.getParameter("color");
                String sMileage = request.getParameter("mileage");
                String typeFuel = request.getParameter("type_fuel");
                String sEnginePower = request.getParameter("engine_power");
                String sEngineVolume = request.getParameter("engine_volume");
                String driveUnit = request.getParameter("drive_unit");
                String transmission = request.getParameter("transmission");
                if(sAccountId.isEmpty() || sBrandId.isEmpty() || nameModel.isEmpty()|
                color.isEmpty() || sCost.isEmpty() || sYearOfIssue.isEmpty()|| sMileage.isEmpty() ||
                typeFuel.isEmpty() || sEnginePower.isEmpty() || sEngineVolume.isEmpty() ||
                driveUnit.isEmpty() || transmission.isEmpty()){
                    request.setAttribute("password", request.getParameter("password"));
                    request.setAttribute("account_id", request.getParameter("account_id"));
                    request.setAttribute("message", "заполните все поля");
                    ArrayList<Brand> brands = BrandDB.select();
                    request.setAttribute("brands", brands);
                    getServletContext().getRequestDispatcher("/view/createAnAd.jsp").forward(request,response);
                }

                try {
                    Auto auto = new Auto(Integer.parseInt(sYearOfIssue), nameModel, Double.parseDouble(sCost), color,
                            Integer.parseInt(sMileage), typeFuel, Integer.parseInt(sEnginePower),
                            Double.parseDouble(sEngineVolume), driveUnit, transmission, userId, Integer.parseInt(sBrandId));
                    AutoDB.insert(auto);
                }
                catch (NumberFormatException ex){
                    ArrayList<Brand> brands = BrandDB.select();
                    request.setAttribute("brands", brands);
                    request.setAttribute("password", request.getParameter("password"));
                    request.setAttribute("account_id", request.getParameter("account_id"));
                    request.setAttribute("message", "Неправильный формат данных");
                    getServletContext().getRequestDispatcher("/view/createAnAd.jsp").forward(request,response);

                }

                response.sendRedirect( request.getContextPath()+"/myAuto?account_id="+account.getAccountId()+
                        "&password="+account.getPassword().hashCode());
            }
        }
        else {
            request.setAttribute("message", null);
            getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sAccountId = request.getParameter("account_id");
        if(sAccountId != null | sAccountId.isEmpty()){
            Account account = AccountDB.select(Integer.parseInt(sAccountId));
            if(account == null){
                request.setAttribute("message", null);
                getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
            }
            if(account.getPassword().hashCode() == Integer.parseInt(request.getParameter("password"))){
                ArrayList<Brand> brands = BrandDB.select();
                request.setAttribute("message", null);
                request.setAttribute("brands", brands);
                request.setAttribute("password", account.getPassword().hashCode());
                request.setAttribute("account_id", account.getAccountId());
                getServletContext().getRequestDispatcher("/view/createAnAd.jsp").forward(request,response);
            }
        }
        else {
            request.setAttribute("message", null);
            getServletContext().getRequestDispatcher("/view/login.jsp").forward(request,response);
        }
    }
}
