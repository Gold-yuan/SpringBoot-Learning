package com.bsutility.cert.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bsutility.cert.dao.MongoDao;
import com.bsutility.cert.pojo.Cert;
import com.bsutility.cert.pojo.DatatableJsonView;

import net.sf.json.JSONObject;

/**
 * @author adminytf
 *
 */
@Controller
public class MainController {
	private Logger log = LoggerFactory.getLogger(MainController.class);
	@Autowired
	private MongoDao dao;

	@RequestMapping(value = "/certList", method = RequestMethod.GET)
	public String certList(HttpServletRequest req, Model mm) {
		log.info("/certList");
		return "cert/cert_list";
	}

	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String table(HttpServletRequest req, Model mm) {
		log.info("/certList");
		return "cert/table";
	}

	@RequestMapping(value = "/datatable", method = RequestMethod.GET)
	public String datatable(HttpServletRequest req, Model mm) {
		log.info("/certList");
		return "cert/datatable";
	}

	// 查询
	@ResponseBody
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public DatatableJsonView query(String start, String length) {
		log.info("query: {},{}",start, length);

		// 这里做查询操作
		Page<Cert> pagelist = dao.findCertByPage(1);
		System.out.println(pagelist.getContent());
		System.out.println(pagelist.getSize());
		System.out.println(pagelist.getTotalPages());
		System.out.println(pagelist.getTotalElements());
		System.out.println(pagelist);
		DatatableJsonView v = new DatatableJsonView();
		v.setDraw(2);
		v.setRecordsFiltered(pagelist.getTotalElements());
		v.setRecordsTotal(pagelist.getTotalElements());
		v.setData(pagelist.getContent());
		System.out.println(JSONObject.fromObject(v).toString());
		return v;
	}
}
