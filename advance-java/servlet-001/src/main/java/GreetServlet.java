import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(value = "/greet", loadOnStartup = 1)
public class GreetServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("GreetServlet init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("GreetServlet service");
        res.getWriter().println("Good morning !"+ LocalDateTime.now());
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("GreetServlet destroy");
    }
}
