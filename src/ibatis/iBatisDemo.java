package ibatis;  
  
import ibatis.model.CusUserDO;
import ibatis.model.User;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.sqlmap.client.SqlMapSession;
  
public class iBatisDemo {  
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException, SQLException {  
        String config = "ibatis/SqlMapConfig.xml";  
        Reader reader = Resources.getResourceAsReader(config);  
        SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);  
//        @SuppressWarnings("unchecked")
//		List<CusUserDO> list = sqlMap.queryForList("selectCusUserById",20l);  
////        List<User> list = sqlMap.queryForList("getAllUsers");  
//        for (CusUserDO cusUserDO : list) {  
//            System.out.println(cusUserDO);  
//        }  
        Map map=new HashMap();
        map.put("login_name", "test");
        map.put("password", "e10adc3949ba59abbe56e057f20f883e");
		List<CusUserDO> list = sqlMap.queryForList("checkUser",map); 
      for (CusUserDO cusUserDO : list) {  
          System.out.println(cusUserDO);  
      }  
        System.exit(0);
    }  
}  