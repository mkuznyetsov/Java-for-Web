import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver"); //проверяет на наличие данного класса в библиотеке
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            //Основные методы JDBC
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234"); //Подключение к БД
            Statement st = con.createStatement(); //Создание обьекта, который имеет методы управления БД
            ResultSet rs = st.executeQuery("select * from testtable"); //обьект, который содержит результат роботы над БД

            Table tempTable = new Table();
            List<Table> list = new ArrayList<Table>();
            while(rs.next()) {
                tempTable.setId(rs.getString("id"));
                tempTable.setFirst_name(rs.getString("first_name"));
                tempTable.setLast_name(rs.getString("last_name"));
                //System.out.println(tempTable.getId());
                list.add(tempTable);
            }

            //System.out.println(list.get(0).getId());

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
            request.setAttribute("list",list);
            dispatcher.forward(request,response);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
