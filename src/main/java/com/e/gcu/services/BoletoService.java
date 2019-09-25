package com.e.gcu.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.e.gcu.domain.PagamentoComBoleto;

@Service
public class BoletoService {
	// alterar para um web service que gere o boleto
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}

}
