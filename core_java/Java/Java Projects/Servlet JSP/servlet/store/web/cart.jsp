
<%@page import="com.apress.projs.store.Product"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.apress.projs.store.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Cart cart = (Cart) session.getAttribute("cart");
    if (cart == null) {
        cart = new Cart();
    }

    Iterator items = cart.getItems();
%>

<h1>Current Cart Contents:</h1>
<table>
    <%if (items.hasNext()) {
            while (items.hasNext()) {%>
    <tr>
        <%Product p = (Product) items.next();%>

        <td><%=p.getName()%></td>
        <td><%=p.getPrice()%></td>
    </tr>
    <%}
    } else {
    %>
    Cart is empty</p>
    <%}%>

</table>
