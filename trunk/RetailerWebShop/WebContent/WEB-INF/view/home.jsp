<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>
<div>
	<h1 align="center">Retailer</h1>
	<br />
	<div id="freewall_container" class="freewall_container">
		<c:forEach items="${wineList}" var="wine">
			<div class="freewall_item">
				<div align="center"><img alt="${wine.name}" style="height: 288px; " src="<s:url value='/resource' />/wine_image/${wine.imageUrl}"></div>
				<table>
					<tr>
						<td class="ptd"><div class="pinfo">Name</div></td>
						<td class="ptd"><div class="pinfo">:</div></td>
						<td class="ptd"><div class="pinfo">${wine.name}</div></td>
					</tr>
					<tr>
						<td class="ptd"><div class="pinfo">Type</div></td>
						<td class="ptd"><div class="pinfo">:</div></td>
						<td class="ptd"><div class="pinfo">${wine.type}</div></td>
					</tr>
					<tr>
						<td class="ptd"><div class="pinfo">Weight</div></td>
						<td class="ptd"><div class="pinfo">:</div></td>
						<td class="ptd"><div class="pinfo">${wine.weight}</div></td>
					</tr>
					<tr>
						<td class="ptd"><div class="pinfo">Price</div></td>
						<td class="ptd"><div class="pinfo">:</div></td>
						<td class="ptd"><div class="pinfo">${wine.price}</div></td>
					</tr>
					<tr>
					<td class="ptd"><div class="pinfo">Date</div></td>
					<td class="ptd"><div class="pinfo">:</div></td>
						<td class="ptd"><div class="pinfo">
							<fmt:formatDate pattern="yyyy" value="${wine.productionDate}" />
						</div></td>
					</tr>
					
				</table>
				<div align="center">
					<input class="btnAdd" id="${wine.id}" type="button" value="Add To Cart" />
				</div>
			</div>
		</c:forEach>
	</div>
	<script>
	
	$(function() {
	      var wall = new freewall("#freewall_container");
	      wall.reset({
				selector: '.freewall_item',
				animate: false,
				cellW: 200,
				cellH: 200,
				delay: 50,
				onResize: function() {
					wall.fitWidth();
				}
			});
	      wall.fitWidth();
	    });
	
		
		var productList = null;
		productList = [
		<c:forEach items="${wineList}" var="wine"  varStatus="loop">
			{ "id":"${wine.id}" , "name":"${wine.name}", "type":"${wine.type}", "price":"${wine.price}", "weight": "${wine.weight}", "productionDate": "<fmt:formatDate pattern='dd-MM-yyyy' value='${wine.productionDate}' />", "imageUrl": "${wine.imageUrl}"}
			<c:if test="${!loop.last}">,</c:if>
		</c:forEach>
		];
		
		var shoppingCartProducts = [];
	
		function removeProduct(id)
		{
			for (var i = 0; i < shoppingCartProducts.length; i++) {
				if(shoppingCartProducts[i].id == id){
					shoppingCartProducts.splice(i,1);
					break;
				};
			};
			updateCart();
		}
		
		function updateCart()
		{
			$("#shoppingCardDiv").empty();
			for (var i = 0; i < shoppingCartProducts.length; i++) {
				$("#shoppingCardDiv").prepend(($('<input onclick="removeProduct('+ shoppingCartProducts[i].id  +');" type="button" value="Remove" style="width:50px;"/>')));
				$("#shoppingCardDiv").prepend($('<li class="selectedProduct" id="prd_'+shoppingCartProducts[i].id + '">' +shoppingCartProducts[i].name+ '    '+shoppingCartProducts[i].price+'</li>').fadeIn('slow'));
				
			};
		}
		
		$(document).ready(function() {
			$(".btnAdd").click(function(event) {
				
				outer: for (var i = 0; i < productList.length; i++) {
					if(event.target.id == productList[i].id){
						for (var j = 0; j < shoppingCartProducts.length; j++) {
							if(shoppingCartProducts[j].id == event.target.id){
								break outer;
							};
						}
						shoppingCartProducts.push(productList[i]);
						break;
					};
				};
				
				updateCart();
			});
		});
	</script>
</div>
