package response;

import java.util.Collection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.transport.http.HttpMetadataPublisher;

@WebServlet(urlPatterns = {"/ResponseHeaderExample"})
public class ResponseHeaderExample extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		// setHeader metodu ile response header ekliyoruz.
				// setHeader metodu, eger ilgili isme sahip(firstName) header yoksa
				// olusturur varsa uzerine yazar override eder.
		response.setHeader("arkadas", "Fahri karaca");
		response.setHeader("arkadas", "Bekir Güngör");
		// containsHeader metodu parametre olarak aldigi degerde response header
				// olup olmadigini kontrol eder.
				// Eger ilgili response header varsa true yoksa false donecektir.
		boolean contains = response.containsHeader("arkadas");
		System.out.println(contains);
		
		String arkadas = response.getHeader("arkadas");
		// getHeader metodu yetersiz kalmaktadir.Eger ayni isme sahip header
		// varsa bu durumda ilk eklenen header'a ait degeri dondurmektedir.
		
		response.addHeader("arkadas", "Fatih KArabey");
		
		Collection <String> firstNamesHeader = response.getHeaders("arkadas");
		for (String firstNameHeader : firstNamesHeader) {
			System.out.println("arkadas:" + firstNameHeader);
		}
		
	}
	
}
