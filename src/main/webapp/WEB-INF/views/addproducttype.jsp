<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>Add Product Type</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!--    <link th:rel="stylesheet" th:href="@{/webjars/bootstrap/4.1.0/css/bootstrap.min.css} "/>-->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"/>
    <style>
        .product-type-form {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <form class="product-type-form" method="post" th:action="@{/producttype}" th:object="${producttype}">
            <h2 class="text-center">Add Product Type</h2>
            <div class="form-group mt-3">
                <label for="name" class="sr-only">Name</label>
                <input type="text" th:field="*{name}" id="name" name="name" class="form-control" placeholder="Name" required="" autofocus="">
            </div>
            <div class="form-group mt-3">
                <label for="description" class="sr-only">Name</label>
                <input type="text" th:field="*{description}" id="description" name="description" class="form-control" placeholder="Description" required="">
            </div>
            <button class="btn btn-success btn-block">Create</button>
        </form>
    </div>

    <script th:src="@{/webjars/jquery/3.0.0/jquery.min.js}"></script>
    <script th:src="@{/webjars/bootstrap/4.1.0/js/bootstrap.min.js}"></script>
</body>
</html>