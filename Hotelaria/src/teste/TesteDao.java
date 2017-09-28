package teste;

import java.util.List;

import dao.GenericDao;
import dao.TblDao;
import model.Tbl;
import modelo.Venda;

public class TesteDao {

	public static void main(String[] args) {

		TblDao h = TblDao.getInstancia();

		// dao.persistir(h);
		// dao.buscaPorId(Tbl.class, 2);

		List<Tbl> resultado = (List<Tbl>) h.buscaPorId(Tbl.class, 1);

		for (Tbl tbl : resultado) {
			System.out.println(
					tbl.getCliente().getNome() + " | " + tbl.getCliente().getEndereco() + " | " + tbl.getValor());
		}

	}

}
