<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/jsp/template/header.jsp" %>

    <main role="main">

      <div id="myCarousel" class="carousel slide" data-ride="carousel">
        
      </div>

<div class="container-wrapper">
      	<div class="container">
      		<div class="page-header">
	      		<h1>All Products</h1>
	      		
	      		<p class="lead">Check out all the products</p>
      		</div>
				<table class="table table-striped table-hover">
					<tr class="bg-success">
						<th>Photo thumb</th>
						<th>Product Name</th>
						<th>Product Category</th>
						<th>Product Status</th>
						<th>Product Price</th>
						<th></th>
					</tr>
				<c:forEach items="${products}" var="product">
					<tr>
						<td><img src="#" alt="image"/></td>
						<td>${product.productName}</td>
						<td>${product.productCategory}</td>
						<td>${product.productStatus}</td>
						<td>${product.productPrice}</td>
						<spring:url value="/productList/viewProduct/${product.productId}" var="productId"/>
						<td><a href="${productId}">
						<i class="fas fa-info-circle"></i></a></td>
					</tr>
				</c:forEach>
				</table>
	</div>
</div><!-- /.container -->
</main>
<%@include file="/WEB-INF/jsp/template/footer.jsp" %>