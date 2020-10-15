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

        <!-- Modal -->
        <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Warning</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                Delete product type?
              </div>
              <div class="modal-footer">
                <form method="POST" action="producttype/333">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary" data-dismiss="modal">Yes</button>
                </form>
              </div>
            </div>
          </div>
        </div>

        <a href="addproducttype" class="btn btn-success btn-block submit-button">Create New Product Type</a>

<!--        <form action="/producttype" method="get">-->
<!--            <button type="submit" class="btn btn-success btn-block submit-button">Create New Product Type</button>-->
<!--        </form>-->
    </div>
<%@ include file="common/footer.jspf" %>>