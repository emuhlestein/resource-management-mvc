    <%@ include file="common/header.jspf" %>
    <%@ include file="common/nav.jspf" %>
    <div class="container product-type-container">
        <h2 class="text-center">Product Types</h2>
        <p><font color="red">${errorMessage}</font></p>
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
                    <a type="button" class="btn btn-danger"
                        href="/delete-producttype/${producttype.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>

        <a href="addproducttype" class="btn btn-success btn-block submit-button">Create New Product Type</a>

<!--        <form action="/producttype" method="get">-->
<!--            <button type="submit" class="btn btn-success btn-block submit-button">Create New Product Type</button>-->
<!--        </form>-->
    </div>
<%@ include file="common/footer.jspf" %>>