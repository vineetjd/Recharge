<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>MOBILE RECHARGE</title>

<meta name="description" content="">
<meta name="author" content="Vineet Jacob David">

<link rel="stylesheet" href="bootstrap1.min.css">
<script type="text/javascript" src="jquery1.min.js"></script>
<script type="text/javascript" src="bootstrap1.min.js"></script>

</head>
<body style="background-color: #222;">
	<nav class="navbar navbar-inverse" style="color: #9d9d9d;">
		<div class="container-fluid">
			<div class="navbar-header">
			    <a class="navbar-brand" href="index.jsp">Mobile Recharge!
			</div></a>
		</div>
	</nav>
	<div class="row"
		style="display: flex; justify-content: center; align-items: center;">
		<div class="col-md-4" style="color: #9d9d9d;">
			<form role="form" method="post" action="">
				<div class="form-group">
					<label for="inputNumber"> Number </label> <input type="number"
						class="form-control" name="inputNumber"
						pattern="[0-9]{10}" title="Phone no. hould have only 10 numbers.">
				</div>
				<br>
				<button type="submit" class="btn btn-primary btn-block">
					Display Transactions</button>
				<br>
			</form>
		</div>
	</div>

</body>
</html>