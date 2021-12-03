package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Produto;

public class ListarServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.setAttribute("produtos", Produto.getProdutos());
		request.getRequestDispatcher("/produtos.jsp").forward(request,response);
	}
}
