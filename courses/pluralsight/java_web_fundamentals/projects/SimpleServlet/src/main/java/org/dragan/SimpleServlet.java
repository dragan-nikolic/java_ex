package org.dragan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/home", "*.do"}, name="SimpleServlet", initParams = {@WebInitParam(name = "ProductName", value="Welcome Application")})
public class SimpleServlet extends HttpServlet {
    String appName = "My Application";

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("name");

        if (name != null) {
            resp.getWriter().printf("<h2>Hello %s</h2><h3>Product: %s</h3>", name, appName);
        } else {
            resp.getWriter().write("<h2>Please enter a name!</h2>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        if (name != null && name != "") {
            resp.setContentType("text/html");
            resp.getWriter().printf("<h2>Hello %s</h2>", name);
        } else {
            resp.sendRedirect("index.jsp");
        }
    }

    @Override
    public void init() throws ServletException {
        appName = getInitParameter("ProductName");
    }
}
