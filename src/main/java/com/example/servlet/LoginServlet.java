package com.example.servlet;

import javax.servlet.annotation.WebServlet;
import com.example.Users;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("/login.jsp");
        } else {
            response.sendRedirect("/user/hello.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        if (Users.getInstance().getUsers().contains(login)
                && !password.isEmpty()) {
            request.getSession().setAttribute("user", login);
            response.sendRedirect("/user/hello.jsp");
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
    //write your code here!
}
