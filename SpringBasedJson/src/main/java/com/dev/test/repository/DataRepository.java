package com.dev.test.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dev.test.vo.DataVO;

@Repository
public class DataRepository {
	@Autowired
	private JdbcTemplate JdbcTemplate;

	public DataVO test(String test) {
		return getData(test);

	}

	private DataVO getData(String data) {
		DataVO list = new DataVO();
		list.getData().add(new DataVO.Data(data, "A", "B", "C", "D"));
		list.getData().add(new DataVO.Data(data, "A", "B", "C", "D"));
		list.getData().add(new DataVO.Data(data, "A", "B", "C", "D"));

		return list;
	}
}
