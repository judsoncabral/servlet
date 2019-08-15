package br.imd.ufrn.servlet.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.servlet.dominio.Usuario;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		if(login.equals("itamir") && senha.equals("itamir")) {
			Usuario u = new Usuario();
			u.setNome("itamir");
			req.getSession().setAttribute("usuario", u);
			resp.sendRedirect("/AulaServlet2019/paginas"
					+ "/conteudo.jsp");
		} else
			resp.sendRedirect("/AulaServlet2019/login.jsp");		
	}
}
