<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Expense Tracker</title>
  
  
  <!-- Bootstrap core CSS-->
  <link href="static/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="static/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="static/css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Expense Tracker</div>
      <div class="card-body">
        <form id="loginForm" action="login.html"
					method='POST'>
          <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input class="form-control" name="email" id="email" type="email" aria-describedby="emailHelp" placeholder="Enter email">
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input class="form-control" name="pass" id="pass" type="password" placeholder="Password">
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember Password</label>
            </div>
          </div>
          <button type="submit" class="btn btn-primary btn-block">SIGN IN</button>
          
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="register.html">Register an Account</a>
          <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="static/vendor/jquery/jquery.min.js"></script>
  <script src="static/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="static/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>
