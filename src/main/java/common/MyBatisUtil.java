package common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author FanWeichong
 * @date 2019-08-15 8:49
 */
public class MyBatisUtil {
    private static SqlSessionFactory factory;
    private static SqlSession session;
    static {
        try {
            InputStream is= Resources.getResourceAsStream("mb-config.xml");
            factory=new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getFactory() {
        return factory;
    }

    public static SqlSession getSession() {
        session = getFactory().openSession();
        return session;
    }

    public static SqlSession getSession(boolean autoCommit) {
        session = getFactory().openSession(autoCommit);
        return session;
    }

    public static void close() {
        session.close();
    }
}
