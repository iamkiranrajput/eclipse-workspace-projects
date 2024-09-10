	<%@ page import="com.db.DBConnect" %>
<%@ page import="com.dao.UserDao" %>
	
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Index Page</title>
	<%@include file="component/allcss.jsp"%>
	
	<style type="text/css">
	.point-card{
	     box-shadow: 0 0 10px 0 rgba(0, 0,0,0.3);
	     }
	      body {
	      
	      background-color: #cccccc;
	      
	      }
	 </style>
	</head>
	
	<body>
	    <%@include file="component/navbar.jsp"%>
	    
	    
	<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
	 
	  <div class="carousel-indicators">
	    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
	    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
	    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
	  </div>
	  
	  <div class="carousel-inner">
	    <div class="carousel-item active">
	      <img src="img/ind1.png" class="d-block w-100" alt="..." height="500px">
	    </div>
	    
	    <div class="carousel-item">
	      <img src="img/ind2.jpg" class="d-block w-100" alt="..." height="500px">
	    </div>
	    
	    <div class="carousel-item">
	      <img src="img/in2.jpg" class="d-block w-100" alt="..." height="500px">
	    </div>
	    
	  </div>
	  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Previous</span>
	  </button>
	  
	  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Next</span>
	  </button>
	</div>
	
	<hr>
	<div class="container p-2">
	   <p class="text-center fw-bold fs-2"> OUR TEAM </p>
	   
	   <div class="row">
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/d1.png" width="250px" height="300px">
	              <p class="fw-bold fs-5">Dr. R. A.Vedhpathak</p>
	              <p class="fs-7">(CEO and Chairman)</p>
	           </div>
	       </div>
	     </div>
	
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/d2.jpg" width="250px" height="300px">
	              <p class="fw-bold fs-5">Dr. S. D. Shetty</p>
	              <p class="fs-7">(Orthologist)</p>
	           </div>
	       </div>
	     </div>
	   
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/d3.jpeg" width="250px" height="300px">
	              <p class="fw-bold fs-5">Dr. M. K. Sharma</p>
	              <p class="fs-7">(Gynaechologist)</p>
	           </div>
	       </div>
	     </div>
	   
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/d4.jpeg" width="250px" height="300px">
	              <p class="fw-bold fs-5">Dr. N. A. Verma</p>
	              <p class="fs-7">(cardiologist)</p>
	           </div>
	       </div>
	     </div>
	   </div>
	
	</div>
	
	<hr>
	<div class="container p-2">
	   <p class="text-center fw-bold fs-2"> OUR PRODUCTS </p>
	   
	   <div class="row">
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/med.jpg" width="250px" height="300px">
	              <p class="fw-bold fs-5">Medicine</p>
	              <p class="fs-7"> <a href="https://www.1mg.com/" class="text-decoration-none"> Visit Now</a></p>
	           </div>
	       </div>
	     </div>
	
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/cosm.jpg" width="250px" height="300px">
	              <p class="fw-bold fs-5">Cosmatics</p>
	              <p class="fs-7"><a href="https://www.nykaa.com/" class="text-decoration-none"> Visit Now</a></p>
	           </div>
	       </div>
	     </div>
	   
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/mc.jpeg" width="250px" height="300px">
	              <p class="fw-bold fs-5">Menstrual products</p>
	              <p class="fs-7"><a href="https://www.thesirona.com/" class="text-decoration-none"> Visit Now</a></p>
	           </div>
	       </div>
	     </div>
	   
	     <div class="col-md-3">
	       <div class="card point-card">
	           <div class="card-body text-center">
	              <img src="img/pro.jpeg" width="250px" height="300px">
	              <p class="fw-bold fs-5">Protines</p>
	              <p class="fs-7"><a href="https://nutrabay.com/" class="text-decoration-none"> Visit Now</a></p>
	           </div>
	       </div>
	     </div>
	   </div>
	
	</div>
	
	<%@include file="component/footer.jsp"%>
		
	</body>
	</html>
