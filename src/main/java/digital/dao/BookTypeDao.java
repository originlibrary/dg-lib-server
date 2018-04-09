package digital.dao;

import org.n3r.eql.Eql;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 创建自: Sober 时间: 2018/4/7.
 */
@Repository
public class BookTypeDao {

    public List<Map> getAllTypes() {
        return new Eql().select("getAllTypes").returnType(Map.class).execute();
    }

    public void deleteType(String id) {
        new Eql().delete("deleteType").params(id).execute();
    }

    public void addType(String name, String remark) {
        new Eql().insert("addType").params(name, remark).execute();
    }

    public void updateType(String id, String name, String remark) {
        new Eql().update("updateType").params(id, name, remark).execute();
    }
}
