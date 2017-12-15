package com.buyStock.service;

import com.buyStock.dao.IAccountDao;
import com.buyStock.dao.IStockDao;

public class BuyStockServiceImpl implements IBuyStockService {

	private IAccountDao adao;
	private IStockDao sdao;
	
	@Override
	public void openAccount(String aname, double money) {
		adao.insertAccount(aname,money);
	}

	@Override
	public void openStock(String sname, int amount) {
		sdao.insertStock(sname,amount);
	}

	@Override
	public void buyStock(String aname, double money, String sname, int account) throws BuyStockException {
		boolean isBuy=true;
		adao.updateAccount(aname,money,isBuy);
		sdao.updateStock(sname,account,isBuy);
	}

	public IAccountDao getAdao() {
		return adao;
	}

	public void setAdao(IAccountDao adao) {
		this.adao = adao;
	}

	public IStockDao getSdao() {
		return sdao;
	}

	public void setSdao(IStockDao sdao) {
		this.sdao = sdao;
	}

}
