<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="/WEB-INF/taglib/spring.tld"%>
<div>
	<h1 align="center">Wine Producer</h1>
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
			{ "id":"${wine.id}" , "name":"${wine.name}", "producer":"${wine.type}", "price":"${wine.price}", "weight": "${wine.weight}"}
			<c:if test="${!loop.last}">,</c:if>
		</c:forEach>
		];
		

		
		
	</script>
</div>
