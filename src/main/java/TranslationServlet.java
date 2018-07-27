import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@javax.servlet.annotation.WebServlet(name = "TranslationServlet",urlPatterns = "/translate")
public class TranslationServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("hi", "xin chao");
        dictionary.put("goodbye", "tam biet");
        dictionary.put("sky", "bau troi");
        dictionary.put("young", "tre");
        dictionary.put("baby", "em be");

        String word = request.getParameter("word");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        String result = dictionary.get(word);
        if (result != null) {
            pw.println("<h2>" + word + " co nghia la:</h2>");
            pw.println(result);
        } else {
            pw.println("Not found!");
        }
        pw.println("</html>");
    }
}
