import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet(urlPatterns={"/exemplo"})
public class Exemplo extends HttpServlet{	
	@Override
	public void doGet(  HttpServletRequest req, 
						HttpServletResponse res){
		try{
			PrintWriter pw = res.getWriter();
			pw.write("Sistema Unificado de Epidemias SUEs\nAndre Luiz Ribeiro Antunes RA:1460481711003\nProfessor Fabricio Galende Marques de Carvalho Laboratorio de Engenharia de Software");
			pw.close();
		} catch (IOException ioe){
			System.out.println("Erro no Servlet");
		}
	}	
}