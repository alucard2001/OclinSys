<%-- 
    Document   : menuAdm
    Created on : 23-mar-2016, 6:35:35
    Author     : Alucard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<!--Menu Administrador-->
<section class="menuAdm">
    <nav class="navbar navbar-default" role="navigation" style="display: block;">
        <div class="container">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#menuAdm">
                    <span class="sr-only">este es el boton desplegave</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>                    
                </button>
            </div>
            <div class="collapse navbar-collapse " id="navegacion-sf" >
                <ul class="nav navbar-nav navbar-left">
                    <li>  <%@include file="menupartes/registro.jsp" %></li>
                    <li><%@include file="menupartes/compra.jsp" %></li>
                    <li><%@include file="menupartes/venta.jsp" %></li>
                    <li><%@include file="menupartes/Cierre.jsp" %></li>
                </ul>
            </div>
        </div>
    </nav>
</section>