package main;

import common.MyBatisUtil;
import dao.TeacherDao;

/**
 * @author FanWeichong
 * @date 2019-08-15 8:49
 */
public class Test {
    public static void main(String[] args) {
        int lines= MyBatisUtil.getSession(true).getMapper(TeacherDao.class).updAreaById(1,"前端");
        System.out.println("结果："+lines);
    }
}
