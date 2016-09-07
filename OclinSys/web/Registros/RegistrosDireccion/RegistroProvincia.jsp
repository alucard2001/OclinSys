<%-- 
    Document   : RegistroProvincia
    Created on : 05-sep-2016, 21:40:03
    Author     : Tatiana Montilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="RegistoProvincia">
    <form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>RegistroProvincia</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nuevaprovincia">Escriba el nombre de la nueva Provincia</label>  
  <div class="col-md-4">
  <input id="nuevaprovincia" name="nuevaprovincia" type="text" placeholder="" class="form-control input-md">
    
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectregion">Seleccione la Region</label>
  <div class="col-md-4">
    <select id="selectregion" name="selectregion" class="form-control">
      <option value="1">Region 1</option>
      <option value="2">Region 2</option>
    </select>
  </div>
</div>

<!-- Multiple Checkboxes (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="checkboxes">¿La region no esta en la lista?</label>
  <div class="col-md-4">
    <label class="checkbox-inline" for="checkboxes-0">
      <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
      Crear nueva Region
    </label>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nuevaregion">Escriba el nombre de la nueva Region</label>  
  <div class="col-md-4">
  <input id="nuevaregion" name="nuevaregion" type="text" placeholder="" class="form-control input-md">
    
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Seleccione Pais</label>
  <div class="col-md-4">
    <select id="selectbasic" name="selectbasic" class="form-control">
      <option value="1">Pais1</option>
      <option value="2">Pais2</option>
    </select>
  </div>
</div>

<!-- Multiple Checkboxes (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="checkboxes">¿El Pais no esta en la lista?</label>
  <div class="col-md-4">
    <label class="checkbox-inline" for="checkboxes-0">
      <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
      Crear nuevo Pais
    </label>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nuevopais">Escriba el nombre del nuevo Pais</label>  
  <div class="col-md-4">
  <input id="nuevopais" name="nuevopais" type="text" placeholder="" class="form-control input-md">
    
  </div>
</div>

</fieldset>
</form>

</section>
