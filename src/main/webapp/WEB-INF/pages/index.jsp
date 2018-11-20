<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MOBILE RECHARGE</title>
	<link rel="stylesheet" href="bootstrap1.min.css">
    <script type="text/javascript" src="jquery1.min.js"></script>
    <script type="text/javascript" src="bootstrap1.min.js"></script>
    
    <style type="text/css">
      .hyp{ width: 250px; height: 50px; word-wrap: break-word; }
      a:link{ text-decoration: none; color: #9d9d9d }
      a:visited{ text-decoration: none; color: #9d9d9d }
      a:hover{ text-decoration: none; color: #9d9d9d; }

    </style>
  </head>
  <body style="background-color: #222">
  <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Mobile Recharge!</a>
        </div>
      </div>
  </nav>
  <div class="row" >
      <div class="col-md-12" style="display: flex; justify-content: center; align-items: center;">
        <ul style="list-style: none; font-weight: 700">
          <li><a href="recharge.jsp"><div class="hyp"> Recharge</div></a></li>
          <li><a href="transactionMobile.jsp"><div class="hyp"> Transactions of a single number</div></a></li>
          <li><a href="displayAll.jsp"><div class="hyp"> Display all transactions</div></a></li>
        </ul>
      </div>
  </div>
  </body>
</html>