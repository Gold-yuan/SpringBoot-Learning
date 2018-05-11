/**
 * 
 */
package com.bsutility.cert.dao;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bsutility.cert.pojo.Cert;

/**
 * @author adminytf
 *
 */
public interface MongoDao {
	/**
	 * 添加申请证书
	 * 
	 * @param cert
	 */
	void addCert(Cert cert);

	/**
	 * 获取所有证书
	 * @return
	 */
	List<Cert> findAllCert();
	
	/**
	 * 分页获取证书列表
	 * @return
	 */
	Page<Cert> findCertByPage(int page);
	
	/**
	 * 获取证书数量
	 * @return
	 */
	long findCertCount();

	/**
	 * 根据CN获取证书
	 * 
	 * @return
	 */
	Cert findCertByCN(String cn);
	

	/**
	 * 根据cn删除证书
	 * 
	 * @param cn
	 */
	void delCert(String cn);
}
