<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%-- <script src="http://h1.flashvortex.com/display.php?id=2_1384553889_30059_318_0_468_60_8_1_108" type="text/javascript"></script> --%>
<div>
	<a href="<s:url value="/home" />"> <img
		src="<s:url value="/resource" />/image/def_logo.png" border="0"
		height="96px" width="96px" />
	</a>
	<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
		codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0"
		width="770" height="95">
		<param name="movie"
			value="<s:url value="/resource" />/flash/flashvortex.swf" />
		<param name="quality" value="best" />
		<param name="menu" value="true" />
		<param name="allowScriptAccess" value="sameDomain" />
		<embed src="<s:url value="/resource" />/flash/flashvortex.swf"
			quality="best" menu="true" width="770" height="95"
			type="application/x-shockwave-flash"
			pluginspage="http://www.macromedia.com/go/getflashplayer"
			allowScriptAccess="sameDomain" />
	</object>
</div>
