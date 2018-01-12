import com.alibaba.fastjson.JSON;
import com.student.MyDbUtil;
import com.student.Student;

import java.sql.Connection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Connection connection = MyDbUtil.getConnection();
        String sql = "SELECT sno,sname,ssex,sage,sbirthday,clazz FROM student";
        List<Student> list = MyDbUtil.executeQuery(connection,Student.class,sql);
        String json = JSON.toJSONString(list);
        System.out.println(json);
    }
}
