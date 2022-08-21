package com.company;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class test1 implements inter {
    @Override
    public void post(String body, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter() ;
        out.println("Its response from server") ;
        out.println(body) ;
        res.setStatus(200);
    }
}
