<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
}
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
    overflow: hidden;
    position: relative; 
}

.form-container {
    background-color: white;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    padding: 40px;
    width: 100%;
    max-width: 400px;
    z-index: 1;
}

.form-container h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}

.form-group {
    margin-bottom: 20px;
}

.form-group label {
    display: block;
    margin-bottom: 8px;
    color: #333;
}

.form-group input[type="email"],
.form-group input[type="password"] {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    transition: border-color 0.3s ease;
}

.form-group input[type="email"]:focus,
.form-group input[type="password"]:focus {
    outline: none;
    border-color: #4CAF50;
}

.btn-submit {
    background-color: #e57a97;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
    width: 100%;
    margin-top: 10px;
    transition: background-color 0.3s ease;
}

.btn-submit:hover {
    background-color: #45a049;
}
 .text4{
    font-family:  cursive;
    text-align: center;
    font-family: bold;
    font-size:18px;
    }
     .text5{
    font-family:  cursive;
    text-align: left;
    font-family: bold;
    font-size:18px;
    }
    .but{
     padding: 12px 20px;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
    width: 100%;
    margin-top: 10px;
    border: 2px solid grey;
    }
</style>
<body>

<div class="form-container">
<div class="text5">
		<h2>
			<font color="#e57a97">REGI</font><font color="#74ab4f">STER</font></h2>
	</div>
    
    <form action="/register" method="get">
    <div class="text5">
        <div class="form-group">
           <label for="name">Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter Name" class="but" required>
        </div>
        <div class="form-group">
   <label for="grade">Grade:</label>
  <input type="number" id="grade" name="grade" class="but" required>
        </div>
        </div>
        <button type="submit" class="btn-submit">REGISTER</button>
    </form>
</div>

</body>
</html>
