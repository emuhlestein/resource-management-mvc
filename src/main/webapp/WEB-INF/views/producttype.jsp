<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>Product Type</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet"/>
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
                <th class="text-center">
                    Actions
                </th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="producttype" items="${producttypes}">
                <tr>
                    <td><c:out value="${producttype.name}"/></td>
                    <td><c:out value="${producttype.description}"/></td>
                    <td class="text-center">
                        <a href="#"><i class="far fa-trash-alt" data-toggle="modal" data-target="#deleteModal" title="Delete product type"></i></a>
                        <a class="ml-1" href="#"><i class="far fa-edit" title="Edit product type"></i></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>

        <!-- Modal -->
        <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                ...
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div>
          </div>
        </div>

        <a href="producttype.jsp" class="btn btn-success btn-block submit-button">Create New Product Type</a>

<!--        <form action="/producttype" method="get">-->
<!--            <button type="submit" class="btn btn-success btn-block submit-button">Create New Product Type</button>-->
<!--        </form>-->
    </div>
    <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <script src="https://kit.fontawesome.com/d3765305ff.js" crossorigin="anonymous"></script>
</body>
</html>