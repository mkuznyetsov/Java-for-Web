import javax.servlet.RequestDispatcher;
import java.io.*;

/**
 * Created by Nazar on 09.10.2014.
 */
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    int one = Integer.parseInt(request.getParameter("one"));
    int two = Integer.parseInt(request.getParameter("two"));
    int suma = one + two;
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
    request.setAttribute("result",suma); //переменной result(ключ) передается значение suma(значение)
    dispatcher.forward(request,response); //перенаправление на страницу suma.jsp
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
