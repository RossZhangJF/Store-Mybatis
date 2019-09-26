package com.store.servlet;

import com.store.dao.WebShopDaoMapper;
import com.store.entry.WebShop;
import com.store.utils.MyTools;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TemplatePagingServlet")
public class TemplatePagingServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是分页的Servlet");
        SqlSession sqlSession = MyTools.getSqlSession();
        WebShopDaoMapper webMapper = sqlSession.getMapper(WebShopDaoMapper.class);
        List <WebShop> list= webMapper.getWebShop();
        HttpSession session=req.getSession();
        System.out.println(list.get(1));
        if (list!=null){
            session.setAttribute("WebShops",list);
            resp.sendRedirect("file/template.jsp");
        }else{

        }
    }
}
