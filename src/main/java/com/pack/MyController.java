package com.pack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	TestDAO edao;
	
	
	@RequestMapping("/verifyBalance")
	public ModelAndView verify(HttpServletRequest request, HttpServletResponse response) {
		
		int mobile_no=Integer.parseInt(request.getParameter("inputNumer"));
		String mobile_carrier=request.getParameter("carrier");
		int amount=Integer.parseInt(request.getParameter("inputAmount"));
		
		int bal=edao.getBal(mobile_no);
		
		if(amount>bal) {
			ModelAndView mv=new ModelAndView("fail.jsp");
			return mv;
			
		}
		else {
			ModelAndView mv=new ModelAndView("interim.jsp");
			mv.addObject("mobile-no", mobile_no);
			mv.addObject("mobile_carrier", mobile_carrier);
			mv.addObject("balance", bal);
			mv.addObject("amount", amount);
			return mv;
		}
		
	}
	
	@RequestMapping(value="/confirm/{mobile_no,amount,balance,carrier}")
	public ModelAndView transact(@PathVariable int mobile_no, @PathVariable int amount, @PathVariable int balance, @PathVariable String mobile_carrier) {
		
		balance-=amount;
		
		edao.update(mobile_no,balance);
		edao.insert(mobile_no,mobile_carrier,amount);
		
		return new ModelAndView("index.jsp");
	}
	
	@RequestMapping(value="/reject")
	public ModelAndView rejectTrans() {
		return new ModelAndView("recharge.jsp");
	}
	
	@RequestMapping(value="/dispTrans/{no}")
	public ModelAndView displayTransaction(HttpServletRequest request) {
		int no=Integer.parseInt(request.getParameter("inputNumber"));
		List<RechargeNumbers> lst=edao.getRows(no);
		return new ModelAndView("display","list1",lst);
	}
	
	/*@RequestMapping(value="/dispAll")
	public ModelAndView displayAll() {
		List<RechargeNumbers> lst=edao.getAll();
		return new ModelAndView("displayAll.jsp","list2",lst);
	}*/

}