package br.edu.unicesumar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unicesumar.model.Cliente;
import br.edu.unicesumar.service.ClienteService;

/**
 * Servlet implementation class CadastrarClienteServlet
 */
@WebServlet("/CadastrarClienteServlet")
public class CadastrarClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente c;
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		
		ClienteService cs = new ClienteService();
		c = cs.CadastrarCliente(nome, sobrenome, email, telefone);
		
		System.out.println(c.getNome());
		
//		RequestDispatcher rd = getServletContext().getRequestDispatcher("/cadastrarCliente.jsp");
//		rd.forward(request, response);
				
	
		
		
		
	}

}
