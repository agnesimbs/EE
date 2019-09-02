package controller;

import model.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter(urlPatterns = "/login")
public class UserFilter extends HttpFilter {
    private User user=null;
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        //super.doFilter(req, res, chain)
        HttpServletResponse resp= (HttpServletResponse) res;
        HttpServletRequest sreq= (HttpServletRequest) req;
      String pass= sreq.getParameter(user.getPassword());

        if (pass.length()!=8){
            resp.sendRedirect("/view/login.html");
       }
    }
}
