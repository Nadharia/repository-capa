const API_BASE_URL = 'http://localhost:8080/api';

function registroValores(params) {
const usuario=document.getElementById("usuario");
const password=document.getElementById("password");

console.log(usuario,password)
}


function cargarJson(params) {
fetch("https://pokeapi.co/api/v2/pokemon/ditto")
.then(response => response.json())
.then(jsonCargado)

}




function jsonCargado(json) {
    console.log(json);
}

cargarJson()

