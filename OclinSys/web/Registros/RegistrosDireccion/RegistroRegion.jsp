<%-- 
    Document   : RegistroRegion
    Created on : 05-sep-2016, 19:47:38
    Author     : Tatiana Montilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<section class="RegistroRegion">
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>RegistroRegion</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="regiontxt">Escriba el nombre de la nueva Region</label>  
  <div class="col-md-4">
  <input id="regiontxt" name="regiontxt" type="text" placeholder="" class="form-control input-md">
    
  </div>
</div>

<!-- Select Basic-->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Selecciona un Pais</label>
  <div class="col-md-4">
    <select id="selectbasic" name="selectbasic" class="form-control">
      <option value="1">Pais1</option>
      <option value="2">Pais2</option>
      <option value="3">Pais3</option>
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
<!-- Multiple Radios (inline) 
<div class="form-group">
  <label class="col-md-4 control-label" for="opcioncrearpais">¿Esta el pais en la lista?</label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="opcioncrearpais-0">
      <input type="radio" name="opcioncrearpais" id="opcioncrearpais-0" value="1" checked="checked">
      Si
    </label> 
    <label class="radio-inline" for="opcioncrearpais-1">
      <input type="radio" name="opcioncrearpais" id="opcioncrearpais-1" value="2">
      No
    </label>
  </div>
</div>
-->
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nuevopais">Escriba el nombre del nuevo Pais</label>  
  <div class="col-md-4">
  <input id="nuevopais" name="nuevopais" type="text" placeholder="" class="form-control input-md">
  <span class="help-block">Ej: "Eucrania"</span>  
  </div>
</div>

</fieldset>
</form>
</section>