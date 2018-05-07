<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- need to use few tags like if, loops in this page. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/style.css" rel="stylesheet" type="text/css">



</head>
<body class="bodybackground"  style="height: 386px; width: 1340px">

${msg}
${loginMessage}
${logoutMessage}

	<center>
		<h2 >Welcome to Shopping Cart</h2>
	</center>
	<jsp:include page="headerUP.jsp"></jsp:include>
	<jsp:include page="carousel.jsp"></jsp:include>
	<jsp:include page="mobileCarousel.jsp"></jsp:include>
	<jsp:include page="rolex.jsp"></jsp:include>
	<jsp:include page="furniture.jsp"></jsp:include>
	
	
	 <c:if test="${isUserClickedLogin==true}">
		<jsp:include page="login.jsp"></jsp:include>
	</c:if>
	<c:if test="${isUserClickedRegister==true}">
		<jsp:include page="register.jsp"></jsp:include>
	</c:if>
	<c:if test="${isUserClickedCart==true}">
		<jsp:include page="myCart.jsp"></jsp:include>
	</c:if>
	



</body>
</html>



