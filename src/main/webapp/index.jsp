<%@ page info="Vanillaweb Main Page"%>
<%@ page import="com.otatkay.vanillaweb.controler.IndexPageControler" %>

<% IndexPageControler pageControl = new IndexPageControler(); %>
<html>
<body>
<h1>Vanilla Vanilla !</h1>
<h2>This is Vanillaweb Taster</h2>
<p>
    Currently, I'm tasting <%= pageControl.whatAreWeTastingNow() %> and I feel it <%= pageControl.howDoesItTaste() %>
</p>

</body>
</html>
