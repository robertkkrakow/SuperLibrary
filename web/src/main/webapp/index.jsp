<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cool jsp design</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jspf"/>
<div class="container mt-5">

    <form action="HomeServlet" method="POST">
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Title</th>
                <th scope="col">ISBN</th>
                <th scope="col">Author</th>
                <th scope="col">Category</th>
                <th scope="col">Release</th>
                <th scope="col">Pages</th>
                <th scope="col">Borrower</th>
                <th scope="col">Select</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${requestScope.book}">
                <tr>
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td>${book.author_id.firstName}<br>${book.author_id.lastName}</td>
                    <td>${book.isbn}</td>
                    <td>${book.category}</td>
                    <td>${book.releaseDate}</td>
                    <td>${book.pages}</td>
                    <td>${book.borrows}</td>
                    <td><input type="radio" name="bookChoice" value=${book.id_book}></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="btn-group" role="group">
            <button type="submit" class="btn btn-secondary" name="action" value="ADD">ADD</button>
            <button type="submit" class="btn btn-secondary" name="action" value="EDIT">EDIT</button>
            <button type="submit" class="btn btn-secondary" name="action" value="DELETE">DELETE</button>
            <button type="submit" class="btn btn-secondary" name="action" value="SHOW">SHOW</button>
        </div>
    </form>
</div>

<%@ include file="/WEB-INF/fragments/footer.jspf" %>
<script src="webjars/bootstrap/4.0.0-2/js/bootstrap.js"></script>
</body>
</html>

