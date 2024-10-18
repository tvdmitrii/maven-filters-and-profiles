package com.turygin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "SimpleServlet",
        urlPatterns = { "/simpleServlet" }
)
public class SimpleServlet extends HttpServlet {

    private static final Logger LOG = LogManager.getLogger(SimpleServlet.class);
    private static final String ENVIRONMENT = Config.getProperties().getProperty("environment");

    public SimpleServlet() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        LOG.debug("Executing SimpleServlet...");

        request.setAttribute("environment", ENVIRONMENT);
        String url = "/index.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
