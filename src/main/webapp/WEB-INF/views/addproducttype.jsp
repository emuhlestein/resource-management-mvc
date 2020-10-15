
    <%@ include file="common/header.jspf" %>
    <div class="container">
        <form class="product-type-form" method="post" action="producttype"">
            <h2 class="text-center">Add Product Type</h2>
            <fieldset class="form-group mt-3">
                <label for="name" class="sr-only">Name</label>
                <input type="text" th:field="*{name}" id="name" name="name" class="form-control" placeholder="Name" required="" autofocus="">
            </fieldset>
            <fieldset class="form-group mt-3">
                <label for="description" class="sr-only">Name</label>
                <input type="text" th:field="*{description}" id="description" name="description" class="form-control" placeholder="Description" required="">
            </fieldset>
            <button class="btn btn-success btn-block">Create</button>
        </form>
    </div>
 <%@ include file="common/footer.jspf" %>