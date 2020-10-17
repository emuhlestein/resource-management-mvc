    <%@ include file="common/header.jspf" %>
    <%@ include file="common/nav.jspf" %>

    <div class="container product-type-container">
        <h2 class="text-center">Product Types</h2>
        <p><font color="red">${errorMessage}</font></p>
            <button class="btn btn-danger chump">Delete</button>
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
                    <form id="delete-product-type" action="/producttype" method="post">
                        <input type="hidden" name="id" value="${producttype.id}">
                        <button type="submit" class="btn btn-danger" click="return confirmDelete()">Delete</button>
                    </form>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>

        <a href="addproducttype" class="btn btn-success btn-block submit-button">Create New Product Type</a>

<!--        <form name="deleteForm" action="/producttype" method="get">-->
<!--            <button type="submit" class="btn btn-success btn-block submit-button">Create New Product Type</button>-->
<!--        </form>-->
    </div>
<%@ include file="common/footer.jspf" %>>

<script>
function confirmDelete() {
    return confirm("Are you sure you want to delete this item");
}

let forms = document.querySelectorAll('#delete-product-type');
forms.forEach((form, index) => {
    form.addEventListener('submit', (event) => {
        event.preventDefault();
        console.log("Action: ", form.action);
        console.log("Method: ", form.method);
        console.log("Form: ", form);
        $.ajax({
            type: "DELETE",
            url: form.action,
            data: {
                id: form.elements['id'].value
            }
        });
    });
});
</script>
