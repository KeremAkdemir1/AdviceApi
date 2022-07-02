import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CustomServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(CustomServlet.class);

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {
        logger.info("CustomServlet doGet method invoked");
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {
        logger.info("CustomServlet doPost method  invoked");
        super.doPost(req, resp);
    }
    @Bean
    public ServletRegistrationBean customServletBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new CustomServlet(), "/servlet");
        return bean;
    }
}
