package belhard.dao;

import belhard.util.JDBCFactory;

import java.sql.Connection;

/**
 * Created by Lenovo on 08.06.2017.
 */
public class AbstractDAO<T> {
	protected Connection connection = JDBCFactory.getConnection();

}
