package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import hcmute.models.ProductModels;
import hcmute.serviecs.IProductService;
import hcmute.serviecs.ProductServiceImp;
@WebServlet(urlPatterns = {"/listProduct","/find"})
public class ProductControllers extends HttpServlet{

	private static final long serialVersionUID = 1L;
	IProductService productService = new ProductServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("listProduct")) {
			findAll(req, resp);
		} else if (url.contains("find")) {
			int id = Integer.parseInt(req.getParameter("id"));
			List<ProductModels> list1 = productService.findbycate(id);
			req.setAttribute("list", list1);
			RequestDispatcher rd = req.getRequestDispatcher("/views/listProduct.jsp");
			rd.forward(req, resp);
		}
		
	}
private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<ProductModels> listProduct = productService.findAll();
		req.setAttribute("list", listProduct);
		RequestDispatcher rd = req.getRequestDispatcher("/views/listProduct.jsp");
		rd.forward(req, resp);
		
	}
}
