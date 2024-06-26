<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.chainsys.demo1.model.Student" %>
    <%@ page import="java.util.List" %>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All User Details</title>
</head>
<style>
    body {
        font-family: Arial, sans-serif;
        line-height: 1.6;
        background-color: #f9f9f9;
        margin: 20px;
    }
    h1 {
        color: #333;
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        background-color: #fff;
    }
    th, td {
        padding: 15px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #f2f2f2;
        color: #333;
    }
    td {
        color: #666;
    }
    button {
        padding: 8px 15px;
        background-color: #e57a97;
        color: white;
        border: none;
        cursor: pointer;
        border-radius: 3px;
        transition: background-color 0.3s ease;
    }
    button:hover {
        background-color: #45a049;
    }
    .edit-button {
        background-color: #2196F3;
    }
    .edit-button:hover {
        background-color: #1e87db;
    }
    .delete-button {
        background-color: #f44336;
    }
    .delete-button:hover {
        background-color: #e53935;
    }
</style>

<body>
<h1>User Details</h1>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Grade</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
        <%List<Student> users=(ArrayList<Student>)request.getAttribute("users");
        for (Student user : users)
          {
        %>
        <tr>
            <td><%=user.getId() %></td>
            <td><%=user.getName() %></td>
            <td><%=user.getGrade() %></td>
            <td>
                <form action="updateStudent.jsp">
                    <input type="hidden" name="id" value="<%=user.getId() %>">
                    <button>Edit</button>
                </form>
            </td>
            <td>
               
        <form action="/delete" method="get">
          <input type="hidden" name="id" value="<%= user.getId()%>">
          <button>Delete</button>
          </form>
          </td>
            </td>
        </tr>
        <%} %>
    </tbody>
</table>
</body>
</html>