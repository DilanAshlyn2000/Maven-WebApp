<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
</head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    padding: 20px;
}
h2 {
text-align:center;
    color: #333;
}
form {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    max-width: 300px;
    margin: 0 auto;
}
label {
    font-weight: bold;
}
input[type="number"], button {
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
    width: 100%;
    box-sizing: border-box;
}
button {
    background-color: #e57a97;
    color: white;
    border: none;
    cursor: pointer;
}
button:hover {
    background-color: #45a049;
}
</style>
<body>
<%
    int id=Integer.parseInt(request.getParameter("id"));
%>
<h2>Update User</h2>
 <form action="/update" method="post">
    <label>Id</label>
    <input type="number" name="id" value="<%=id %>" readonly><br><br>
     <label for="grade">Grade:</label>
     <input type="number" id="grade" name="grade" class="but" min="1" max="10" required>
    <button  onclick="validation()">Update</button>
 </form>
 <script type="text/javascript">
 function validation(){	
var grade=document.getElementById("grade");
if(!grade.checkValidity())
{
    alert("Grade should be from 1-10");
    return;
}
</script>
</body>
</html>