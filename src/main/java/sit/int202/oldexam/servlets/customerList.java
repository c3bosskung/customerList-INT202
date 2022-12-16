package sit.int202.oldexam.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.oldexam.entities.Customer;
import sit.int202.oldexam.repositories.CustomerRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "customerList", value = "/099/customers")
public class customerList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = CustomerRepository.findAll();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/customer.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
