<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Emp Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addemp">Add Emp</a>
        </li>
      </ul>
    
    </div>
  </div>
</nav>

<div class="container">
	<div class="row">
		<div class="col-md-6 offset-md-3" >
			<div class="card">
					<div class="card-header text-center" >
						<h3>Add Emp</h3>	
					</div>
					
					<div class="card-body">
					
						<form action="createEmp" method="post">
						
						<div class="mb-3">
							<label> Employee Id</label>
							<input type="number" name="id" class="form-control" />
						</div>
						
						<div class="mb-3">
							<label> Enter Full Name</label>
							<input type="text" name="name" class="form-control" />
						</div>
						
						<div class="mb-3">
							<label> Address</label>
							<input type="text" name="address" class="form-control" />
						</div>
						<div class="mb-3">
							<label> Email</label>
							<input type="email" name="email" class="form-control" />
						</div>
						<div class="mb-3">
							<label> Password</label>
							<input type="password" name="password" class="form-control" />
						</div>
						<div class="mb-3">
							<label> Designation</label>
							<input type="text" name="designation" class="form-control" />
						</div>
						<div class="mb-3">
							<label> Salary</label>
							<input type="number" name="salary" class="form-control" />
						</div>
						
						<button class="btn btn-primary">Submit</button>
		
						</form>
				</div>
				
				</div>
		</div>
	</div>

</div>
</body>
</html>