var url = "http://localhost:8080/servicio/"
var xhttp = new XMLHttpRequest();


var fieldNombre=document.getElementById('nombre');
var fieldEdad=document.getElementById('edad');
var fieldPais=document.getElementById('pais');
var fieldEstado=document.getElementById('estado');
var fieldCiudad=document.getElementById('ciudad');

var nombreVal=false;
var edadVal=false;
var paisVal=false;
var estadoVal=false;
var ciudadVal=false;

getPaises();

function nombreValidator(){
    if(!/^[a-záéíóúñA-ZÁÉÍÓÚÑ\s]*$/.test(fieldNombre.value) || fieldNombre.value=='' ||fieldNombre.value==null || fieldNombre.value==undefined) {
        fieldNombre.classList.add('is-invalid');
        errorNombre.hidden=false;
        nombreVal=false;
    }else{
        errorNombre.hidden=true;
        fieldNombre.classList.remove('is-invalid');
        nombreVal=true;
    }
}

function edadValidator(){
    if(fieldEdad.value<18 || fieldEdad.value>99){
        fieldEdad.classList.add('is-invalid');
        errorEdad.hidden=false;
        edadVal=false;
    }else{
        errorEdad.hidden=true;
        fieldEdad.classList.remove('is-invalid');
        edadVal=true;
    }
}

function paisValidator(){
    if(fieldPais.options[fieldPais.selectedIndex].value==0) {
        fieldPais.classList.add('is-invalid');
        errorPais.hidden=false;
        paisVal=false;
    }else{
        getEstados(fieldPais.options[fieldPais.selectedIndex].value);
        errorPais.hidden=true;
        fieldPais.classList.remove('is-invalid');
        paisVal=true;
    }
}

function estadoValidator(){
    if(fieldEstado.options[fieldEstado.selectedIndex].value==0) {
        fieldEstado.classList.add('is-invalid');
        errorEstado.hidden=false;
        estadoVal=false;
    }else{
        getCiudades(fieldEstado.options[fieldEstado.selectedIndex].value);
        errorEstado.hidden=true;
        fieldEstado.classList.remove('is-invalid');
        estadoVal=true;
    }
}

function ciudadValidator(){
    if(fieldCiudad.options[fieldCiudad.selectedIndex].value==0) {
        fieldCiudad.classList.add('is-invalid');
        errorCiudad.hidden=false;
        ciudadVal=false;
    }else{
        errorCiudad.hidden=true;
        fieldCiudad.classList.remove('is-invalid');
        ciudadVal=true;
    }
}

function getPaises(){
    xhttp.open("GET", url + "paises", true);
    xhttp.setRequestHeader('Content-type', 'application/json');
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            var res=JSON.parse(this.responseText);
            res.forEach((element)=>{
                var opt = document.createElement('option');
                opt.appendChild( document.createTextNode(element.nombre) );
                opt.value = element.id;
                fieldPais.appendChild(opt);
            })
            
        }
    };
    xhttp.send();

}

function getEstados(paisId){
    xhttp.open("POST", url + "estados", true);
    xhttp.setRequestHeader('Content-type', 'application/json');
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            vaciarSelect(fieldEstado);
            var res=JSON.parse(this.responseText);
            res.forEach((element)=>{
                var opt = document.createElement('option');
                opt.appendChild( document.createTextNode(element.nombre) );
                opt.value = element.id;
                fieldEstado.appendChild(opt);
            })
            
        }
    };
    xhttp.send(paisId);
}

function getCiudades(estadoId){
    xhttp.open("POST", url + "ciudades", true);
    xhttp.setRequestHeader('Content-type', 'application/json');
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            vaciarSelect(fieldCiudad);
            var res=JSON.parse(this.responseText);
            res.forEach((element)=>{
                var opt = document.createElement('option');
                opt.appendChild( document.createTextNode(element.nombre) );
                opt.value = element.id;
                fieldCiudad.appendChild(opt);
            })
            
        }
    };
    xhttp.send(estadoId);
}

function enviar(){
    if(nombreVal && edadVal && paisVal && estadoVal && ciudadVal){
        xhttp.open("POST", url + "guardar", true);
        xhttp.setRequestHeader('Content-type', 'application/json');
        xhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                console.log('Guardado');
                location.reload();
            }
        };
        xhttp.send(JSON.stringify({
            "ciudadId": fieldCiudad.options[fieldCiudad.selectedIndex].value,
            "nombre": fieldNombre.value,
            "edad": fieldEdad.value
          }));
    }else{
        nombreValidator();
        edadValidator();
        paisValidator();
        estadoValidator();
        ciudadValidator();
    }
}


function vaciarSelect(field){
    var length = field.options.length;
    for (i = length-1; i >= 0; i--) {
      field.options[i] = null;
    }
    var opt = document.createElement('option');
    opt.appendChild( document.createTextNode('Selecciona un valor') );
    opt.value = 0;
    fieldCiudad.appendChild(opt);
}