package com.pack;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDAO// implements DaoInter
{
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	/*public int saveData(RechargeNumbers r)
	{
		System.out.println("in save data..");
		String query="insert into E values('"+e.getrNo()+"','"+e.getName()+"','"+e.getSal()+"')";
		return jdbcTemplate.update(query);
	}*/
	public int getBal(int mobile_no) {
		String query="select balance from recharge_numbers where mobile_no=?";
		int bal=jdbcTemplate.queryForObject(query, new Object[] {mobile_no}, Integer.class);
		return bal;
	}
	
	public int update(int mobile_no, int balance) {
		String query="update recharge_numbers set balance="+balance+" where mobile_no="+mobile_no;
		return jdbcTemplate.update(query);
	}
	
	public int insert(int mobile_no, String mobile_carrier, int amount) {
		String query="insert into recharge_transaction values("+mobile_no+",'"+mobile_carrier+"',"+amount+")";
		return jdbcTemplate.update(query);
	}
	
	public List<RechargeNumbers> getRows(int no){
		String query="select * from recharge_transaction where mobile_number=?";
		List<RechargeNumbers> lst=(List<RechargeNumbers>) jdbcTemplate.queryForObject(query, new Object[] {no}, new BeanPropertyRowMapper<RechargeNumbers>());
		return lst;
	}
}