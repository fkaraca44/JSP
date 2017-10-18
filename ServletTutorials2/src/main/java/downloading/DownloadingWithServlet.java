package downloading;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadingWithServlet
 */
public class DownloadingWithServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadingWithServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("application/vnd.oasis.opendocument.text");
		response.setHeader("Content-Disposition", "attachment;filename=odtdosyasi.odt");
		
		InputStream is = getServletContext().getResourceAsStream("/f.odt");
		int read=0;
		byte [] bytes = new byte[1024];
		ServletOutputStream sos = response.getOutputStream();
		while( (read = is.read(bytes)) != -1){
			sos.write(bytes,0,read);
		}
		sos.close();
	}

}
