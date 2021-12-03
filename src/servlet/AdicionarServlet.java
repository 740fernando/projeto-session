package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Carrinho;
import entities.Produto;

@WebServlet("/Adicionar")
public class AdicionarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Produto p = Produto.getProdutoById(id);
		
		HttpSession session = request.getSession();
		
		Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");
		
		if((carrinho==null)){
			carrinho = new Carrinho();
			session.setAttribute("carrinho", carrinho);
		}
		carrinho.add(p);
		
		request.getRequestDispatcher("/Listar").forward(request, response);
	}
}
