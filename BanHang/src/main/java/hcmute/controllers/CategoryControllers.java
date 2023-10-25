package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.models.CategoryModels;
import hcmute.serviecs.CategoryServiceImp;
import hcmute.serviecs.ICategoryService;

@WebServlet(urlPatterns = {"/category/listCate","/category/addcate","/category/update","/category/delete"})
public class CategoryControllers extends HttpServlet {
	ICategoryService cateService = new CategoryServiceImp();
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url =req.getRequestURI().toString();
		if(url.contains("listCate"))
		{
			findAll(req,resp);
		}
		else if (url.contains("addcate"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/views/addCategory.jsp");
			rd.forward(req, resp);
		}
		else if (url.contains("update")) {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			int id = Integer.parseInt(req.getParameter("id"));
			CategoryModels model = cateService.findOne(id);
			req.setAttribute("cate", model);
			RequestDispatcher rd = req.getRequestDispatcher("/views/updateCategory.jsp");
			rd.forward(req, resp);
		}
		else if (url.contains("delete"))
		{
			int id = Integer.parseInt(req.getParameter("id"));
			cateService.delete(id);
			req.setAttribute("message", "Da xoa thanh cong");
			RequestDispatcher rd = req.getRequestDispatcher("listCate");
			rd.forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if(url.contains("addcate"))
		{
			insert(req,resp);
		}
		else if(url.contains("update"))
		{
			update(req, resp);
		}
	}
	private void update(HttpServletRequest req, HttpServletResponse res) throws IOException {
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(req.getParameter("cateId"));
		String cateName = req.getParameter("cateName");
		String images = req.getParameter("images");
		CategoryModels cate = new CategoryModels();
		cate.setCateName(cateName);
		cate.setImg(images);
		cate.setCateId(id);
		cateService.update(cate);
		res.sendRedirect(req.getContextPath()+"/category/listCate");
	}
	private void insert(HttpServletRequest req, HttpServletResponse res) throws IOException {
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		String cateName = req.getParameter("cateName");
		String images = req.getParameter("images");
		CategoryModels cate = new CategoryModels();
		cate.setCateName(cateName);
		cate.setImg(images);
		cateService.insert(cate);
		res.sendRedirect(req.getContextPath()+"/category/listCate");
	}
	private void findAll(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		List<CategoryModels> listCate = cateService.findAll();
		req.setAttribute("list", listCate);
		RequestDispatcher rd = req.getRequestDispatcher("/views/listCategory.jsp");
		rd.forward(req, res);
	}

//jjjjkdsflsfdlksj
}
//ssssss
