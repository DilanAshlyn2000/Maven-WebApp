<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

.card{
position: absolute;
    left: 37%;
    text-align: center;
    
    top: 353px;
}
img.img2 {
    POSITION: absolute;
    LEFT: 435px;
    height: 233px;
    top: 120px;
    }
 button {
    background: white;
}
h2 {
  font-size: 22px;
  background: -webkit-linear-gradient(#e57a97 , #bebf6c );
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
}
</style>
<body>

<div class="card">
      <h2>QUOTE OF THE DAY</h2>
<form method="get" action="/about">
  <button class="button1" type="submit">VIEW</button>
  </form>
  </div>
  <img
		src="https://cdn.pixabay.com/photo/2013/07/02/22/20/bouquet-142876_1280.jpg"
		alt="image"  class="img2">
</body>
</html>