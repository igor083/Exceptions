package entidades;

import exceptions.SaldoException;

public class Conta {
	private Integer numeroConta;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	

	
	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Conta(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public void deposito(Double quant) {
		
	}
	
	public void saque(Double quant) throws SaldoException {
		
		if(saldo==0.0) {
			throw new SaldoException("A conta esta zerada.");
		}
		if(quant>limiteSaque) {
			throw new SaldoException("A quantia a ser sacada ultrapassa o valor maximo de saque.");
		}
		if(quant>saldo) {
			throw new SaldoException("A quantia a ser sacada ultrapassa o valor em conta.");
		}
	}
}
