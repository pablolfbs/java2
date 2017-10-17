package teste;

import dao.TblDao;
import model.Tbl;

public class TesteDao {

	public static void main(String[] args) {

		TblDao h = TblDao.getInstancia();
		
		Tbl tbl = new Tbl();
		
//		tbl.setCliente("Pablo");
//		tbl.setQtdHospedes(5);
//		tbl.setCheckin("12/29/2017");
//		tbl.setCheckout("01/02/2018");
//		tbl.setNoites(3);
//		tbl.setTipo_uh("Premium");
//		tbl.setVl_diaria("R$500,00");
//		tbl.setRs_uh("R$1.000,00");
//		tbl.setGastos_extras("R$200,00");
		
//		h.persistir(tbl);

		Tbl cliente = h.buscaPorId(Tbl.class, 2695);
//		System.out.println(cliente.getCliente());
		h.remove(cliente);
//
//		List<Tbl> resultado = (List<Tbl>) h.buscaPorId(Tbl.class, 1);
//
//		for (Tbl tbl1 : resultado) {
//			System.out.println(tbl1.getNome() + " | " + tbl1.getQtdHospedes() + " | " + tbl1.getCheckin()
//					+ tbl1.getCheckout() + " | " + tbl1.getNoites() + " | " + tbl1.getQuarto() + tbl1.getValorDiaria()
//					+ " | " + tbl1.getValorPeriodo() + " | " + tbl1.getGastosExtras());
//		}

	}

}
