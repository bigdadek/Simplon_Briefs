<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> KB ^_^ </title>
	<!--  <link rel="stylesheet" href="./CSS/LogSignCss.css">  -->
		<style type="text/css">
		
			* {
			  box-sizing: border-box; }
			
			body {
			  font-family: "Montserrat-Regular";
			  color: #999;
			  font-size: 12px;
			  margin: 0; }
			
			img {
			  max-width: 100%; }
			
			a {
			  text-decoration: none;
			  color: #ff9a9c;
			  transition: all 0.3s ease; }
			a:hover {
			    text-decoration: none;
			    color: #fe4447; }
			
			:focus {
			  outline: none; }
			
			.wrapper {
			  min-height: 100vh;
			  display: flex;
			  align-items: center;}
			
			.inner {
			  max-width: 850px;
			  margin: auto;
			  background: #fff;
			  display: flex;
			  box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.2);
			  -webkit-box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.2);
			  -moz-box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.2);
			 }
			
			.image-holder {
			  width: 50%;
			  padding-right: 15px; }
			
			form {
			  width: 50%;
			  padding-top: 77px;
			  padding-right: 60px;
			  padding-left: 15px; }
			
			h3 {
			  font-size: 35px;
			  font-family: "ElMessiri-SemiBold";
			  text-align: center;
			  margin: 0;
			  margin-bottom: 27px;
			  color: #ff9a9c; }
			
			.form-holder {
			  padding-left: 24px;
			  position: relative;
			  border: 2px solid transparent;
			  background: #ff9a9c; }
			
			.form-control {
			  display: block;
			  width: 100%;
			  border-radius: 23.5px;
			  height: 47px;
			  padding: 0 24px;
			  color: #808080;
			  font-size: 13px;
			  border: none;
			  background: #f7f7f7;
			  margin-bottom: 25px; 
			  font-family: "Montserrat-Regular"; 
			  font-size: 13px;
			  text-transform: uppercase;
			  font-family: "Montserrat-Regular"; }
			
			button {
			  letter-spacing: 2px;
			  border: none;
			  width: 133px;
			  height: 47px;
			  margin-right: 19px;
			  border-radius: 23.5px;
			  cursor: pointer;
			  display: flex;
			  align-items: center;
			  justify-content: center;
			  padding: 0;
			  background: #ff9a9c;
			  font-size: 15px;
			  color: #fff;
			  text-transform: uppercase;
			  font-family: "Montserrat-SemiBold";
			}
		
	</style>
</head>

<body>
	<div class="wrapper">
		<div class="inner">
			<div class="image-holder">
				<img src="logo.jpg">
			</div>
			
			<form method='post' action='LoginServlet'>
		
				<h3>Log in</h3>
				
				<input type="text" placeholder="User name" name="userName" class="form-control">
				<input type="password" placeholder="Password" name="password" class="form-control">
				
				<div class="form-login">
					<button >Log in</button>
					<p>You do not have an account? <a href="#">SignUp</a></p>
				</div>
		
			</form>
		</div>
	</div>
	ome content");
}
</script>
</body>
</html>
