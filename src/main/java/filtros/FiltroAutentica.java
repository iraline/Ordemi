package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns={"/*"})
public class FiltroAutentica implements Filter {

	// Executado quandoa aplicacao eh iniciada
	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

	// Intercepta as requisicoes
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		String url = httpServletRequest.getRequestURI();
		
		HttpSession sessao = httpServletRequest.getSession();
		
		if(sessao.getAttribute("usuarioLogado") != null || url.lastIndexOf("login") > -1 || url.contains("resources")) {
			//executa as acoes do request e response
			chain.doFilter(request, response);
			
		}
		else {
			((HttpServletResponse)response).sendRedirect("login.jsp");		
		}	

	}

	// Executado quando a aplicacao eh iniciada
	@Override
	public void destroy() {

	}

}
