package dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author FanWeichong
 * @date 2019-08-15 8:40
 */
public interface TeacherDao {
    int updAreaById(@Param("tid") long id, @Param("fangxiang") String area);
}
