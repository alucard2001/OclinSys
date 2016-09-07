<%-- 
    Document   : RegistroPais
    Created on : 05-sep-2016, 18:16:38
    Author     : Tatiana Montilla
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--
<%
    //variable k muestra los mensajes
    String mensaje = "";

    //Identificar el boton que se presionado
    boolean cancelar = false;
    boolean consultar = false;
    boolean editar = false;
    boolean guardar = false;
    boolean nuevo = false;

    if (request.getParameter("cancelar") != null) {
        cancelar = true;
    }

    if (request.getParameter("consultar") != null) {
        consultar = true;
    }

    if (request.getParameter("editar") != null) {
        editar = true;
    }

    if (request.getParameter("guardar") != null) {
        guardar = true;
    }

    if (request.getParameter("nuevo") != null) {
        nuevo = true;
    }

    String nombre = "";

    if (request.getParameter("nombre") != null) {
        nombre = request.getParameter("nombre");
    }

    if (consultar) {
        if (nombre == "") {
            mensaje = "El Nombre de la region no puede estar vacio";
        } else {
            Datos MiProv = new Datos();
           // Departamento Depart = MiDepart.getDepartamento(nombre);
           Provincia Prov = MiProv.getProvincia(nombre);

            if (Prov == null) {
                mensaje = "La Provincia no existe";

            } else {
                nombre = Prov.getProvincia();
                mensaje = "Se a registrado con existe";
            }
            MiProv.CerrarConexion();

        }

    }
    //Si pulsa el boton limpiar

    if (cancelar) {
        nombre = "";
    }
// Si pulsa el boton nuevo
    if (guardar) {
        if (nombre == "") {
            mensaje = " Debe ingresar un nombre para la Provincia";

        } else {
               Datos MiProv = new Datos();
             Provincia Prov = MiProv.getProvincia(nombre);
            
                  if (MiProv== null) {
            
                MiProv.NuevoProvincia(Prov);
                mensaje = "Ha sido registrada";
            } else {

                mensaje = "Ya existe";

            }
           MiProv.CerrarConexion();
        }
        
    }
    // Si pulsa el boton actualizar
    if (editar) {
        if (nombre == "") {
            mensaje = " Debe ingresar un Nombre";

        } else {
            Datos MiProv = new Datos();
            Provincia Prov = MiProv.getProvincia(nombre);

            if (MiProv != null) {

                Prov = new Provincia(0, nombre);

                //Se debe seleccionar el costructor que esta mas completo
                MiProv.ActProvincia(Prov);
                mensaje = "Ha sido actualizado";
            } else {

                mensaje = "No existe, debe registrarlo";

            }
            MiProv.CerrarConexion();
        }

    }
   
%>
--%>



<section class="registropais">
    <form class="form-horizontal">

        <fieldset>

            <!-- Form Name -->
            <legend>Registro de Pais</legend>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="txtpais">Registro de Pais</label>  
                <div class="col-md-4">
                    <input id="txtpais" name="txtpais" type="text" placeholder="" class="form-control input-md">
                    <span class="help-block">Ej: Alemania</span>  
                </div>
            </div>

        </fieldset>
    </form>

</section>



