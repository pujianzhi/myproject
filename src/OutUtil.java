import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OutUtil {
    public static void out(String content, HttpServletRequest req, HttpServletResponse resp){
        PrintWriter out = null;
        try {
            out = resp.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print(content);
        out.flush();

    }
}
