package com.ajax.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import com.ajax.bean.Book;
import com.google.gson.Gson;

public class ResponseJsonUtils {
	public static void responseJson(HttpServletResponse response, ArrayList<Book> books){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		Gson gson=new Gson();
		String jsonStr=gson.toJson(books);
		System.out.println(jsonStr);
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.write(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}
}
