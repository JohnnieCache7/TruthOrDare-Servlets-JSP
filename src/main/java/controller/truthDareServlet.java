package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TruthOrDare;

/**
 * Servlet implementation class truthDareServlet
 */
@WebServlet("/truthDareServlet")
public class truthDareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public truthDareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h1> Thanks For Playing Truth Or Dare! </h1>");
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userPick = request.getParameter("userPick");
		
		TruthOrDare game = new TruthOrDare(userPick);
		
    	request.setAttribute("usersTruthOrDare", game);
  
		if (userPick.equalsIgnoreCase("truth")) {
			getServletContext().getRequestDispatcher("/truth.jsp").forward(request, response);
		}else if (userPick.equalsIgnoreCase("dare")) {
			getServletContext().getRequestDispatcher("/dare.jsp").forward(request, response);
		}
    	
	}

}
