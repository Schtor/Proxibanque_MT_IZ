package org.banque.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.banque.entity.Client;
import org.banque.service.ClientService;
import org.banque.service.ClientServiceImplementation;


/**
 * Servlet implementation class ServletComptes: c'est la servlet qui va nous
 * permettre dans un second temps d'enregistrer les comptes bancaires associés
 * aux clients pour pouvoir effectuer les virements de compte à compte
 * (actuellement inactive).
 * 
 * @author Marwa et Maxime
 * 
 */
@WebServlet("/ServletComptes")
public class ServletClients extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClientService cs = new ClientServiceImplementation();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletClients() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Client> lc = cs.trouverToutClient();
		System.out.println(lc);
		RequestDispatcher dispatcher;
		request.setAttribute("listeClients", lc);
		dispatcher = request.getRequestDispatcher("/WEB-INF/ListeClients.jsp");
		dispatcher.forward(request, response);

	}

}
