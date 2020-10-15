    <%@ include file="common/header.jspf" %>
    <%@ include file="common/nav.jspf" %>
    <div class="container product-type-container">
        <h2 class="text-center">Container Types</h2>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>
                    Container Type
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
            <c:forEach var="containertype" items="${containertypes}">
                <tr>
                    <td><c:out value="${containertype.name}"/></td>
                    <td><c:out value="${containertype.description}"/></td>
                    <td class="text-center">
                    <a type="button" class="btn btn-danger"
                        href="/delete-containertype/${containertype.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>

        <a href="addcontainertype" class="btn btn-success btn-block submit-button">Create new container type</a>
    </div>
<%@ include file="common/footer.jspf" %>>