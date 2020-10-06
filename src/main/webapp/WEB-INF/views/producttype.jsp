<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>Product Type</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!--    <link th:rel="stylesheet" th:href="@{/webjars/bootstrap/4.1.0/css/bootstrap.min.css} "/>-->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
<!--        body {-->
<!--            background-color: #3e3e3e;-->
<!--            color: white;-->
<!--        }-->
        .product-type-container {
            max-width: 500px;
  	        padding: 15px;
  	        margin: 0 auto;
        }
        .submit-button {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }

    </style>
</head>
<body>
    <div class="container product-type-container">
        <h2 class="text-center">Product Types</h2>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>
                    Product Types
                </th>
                <th>
                    Description
                </th>
                <th>
                    Actions
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="producttype" items="${producttypes}">
                <tr>
                    <td th:text="${producttype.name}"></td>
                    <td th:text="${producttype.description}"></td>
                    <td><link rel="eye-icon" /></td>
                </tr>
            </c:forEach>
            </tbody>

        </table>

        <a href="producttype.jsp" class="btn btn-success btn-block submit-button">Create New Product Type</a>

<!--        <form action="/producttype" method="get">-->
<!--            <button type="submit" class="btn btn-success btn-block submit-button">Create New Product Type</button>-->
<!--        </form>-->
    </div>
    <script src="@{/webjars/jquery/3.0.0/jquery.min.js}"></script>
    <script src="@{/webjars/bootstrap/4.1.0/js/bootstrap.min.js}"></script>
</body>
</html>