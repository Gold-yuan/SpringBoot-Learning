/**
 * 
 */
package com.bsutility.cert.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bsutility.cert.pojo.Cert;

/**
 * @author adminytf
 *
 */
@Repository
public class MongoDaoImpl implements MongoDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void addCert(Cert cert) {
		mongoTemplate.save(cert);

	}
	@Override
	public void delCert(String cn) {
		Cert cert = new Cert();
		cert.setCn(cn);
		mongoTemplate.remove(cert);
	}

	@Override
	public List<Cert> findAllCert() {
		return mongoTemplate.findAll(Cert.class);
	}

	@Override
	public Page<Cert> findCertByPage(int page) {

		SpringDataPageable pageable = new SpringDataPageable();
		Query query = new Query();
		List<Order> orders = new ArrayList<Order>(); // 排序
		orders.add(new Order(Direction.DESC, "cn"));
		Sort sort = Sort.by(orders);
		
		// 开始页
		pageable.setPagenumber(page);
		// 每页条数
		pageable.setPagesize(10);
		// 排序
		pageable.setSort(sort);
		// 查询出一共的条数
		Long count = mongoTemplate.count(query, Cert.class);
		// 查询
		List<Cert> list = mongoTemplate.find(query.with(pageable), Cert.class);
		// 将集合与分页结果封装
		Page<Cert> pagelist = new PageImpl<Cert>(list, pageable, count);
		
		return pagelist;
	}

	@Override
	public long findCertCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cert findCertByCN(String cn) {
		return mongoTemplate.findById(cn, Cert.class);
	}

}
