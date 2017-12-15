package com.buyStock.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.buyStock.dao.IAccountDao;
import com.buyStock.dao.IStockDao;

public class BuyStockServiceImpl implements IBuyStockService {

	private IAccountDao adao;
	private IStockDao sdao;
	
	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
	@Override
	public void openAccount(String aname, double money) {
		adao.insertAccount(aname,money);
	}

	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
	@Override
	public void openStock(String sname, int amount) {
		sdao.insertStock(sname,amount);
	}

	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED, rollbackFor=BuyStockException.class)
	@Override
	public void buyStock(String aname, double money, String sname, int account) throws BuyStockException {
		boolean isBuy=true;
		adao.updateAccount(aname,money,isBuy);
		if(1==1){
			throw new BuyStockException("购买出现异常");
		}
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
