package dao;

import model.Tbl;

public class TblDao extends GenericDao<Tbl> {

	private static TblDao instancia;

	private TblDao() {

	}

	public static TblDao getInstancia() {
		if (instancia == null) {
			instancia = new TblDao();
			return instancia;
		} else {
			return instancia;
		}
	}
}
