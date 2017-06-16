package com.ajax.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajax.bean.Book;
import com.ajax.util.ResponseJsonUtils;

public class BookQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String method=request.getMethod();
		System.out.println(method);
		String deviceType=request.getParameter("deviceType");
		System.out.println(deviceType);
		String requestTime=request.getParameter("nocache");
		System.out.println(requestTime);
		if(!requestTime.equals("")&&requestTime!=null){
			Book book=new Book();
			ArrayList<Book> bookList= book.getBookList();
			if(deviceType.equals("web")){
				request.setAttribute("bookList", bookList);  
				request.getRequestDispatcher("index.jsp").forward(request, response);  
			}else{
				ResponseJsonUtils.responseJson(response, bookList);	
			}
			
		}

	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{  
		doGet(request, response);  
	}

}