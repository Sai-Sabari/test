package com.company;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface inter {
    void post(String body , HttpServletResponse res) throws IOException;

}
