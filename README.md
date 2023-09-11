# CreandoApiRest-Maven

Creacion del proyecto Spring Boot Usando Maven 
![ProyectoMaven](https://github.com/Luiso-o/CreandoApiRest-Maven/assets/128043647/c80005e2-5a59-4002-9d6f-882ff3a9b45c)

Convertiremos esta aplicación en una API REST:
Dependiendo del package principal, crea otro subpackage llamado Controllers, y en su interior, añade la clase HelloWorldController.

Tendrá que tener dos métodos:
String saluda
String saluda2

Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:

"Hola, " + nombre + ". Estás ejecutando un proyecto Maven”.

El primer método responderá a una petición GET y deberá ser configurado para recibir el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor predeterminado “UNKNOWN”.

Deberá responder a:

http://localhost:9000/saludaConParametro
![ParametroSinNombre](https://github.com/Luiso-o/CreandoApiRest-Maven/assets/128043647/c114e7eb-a670-4ffa-8cff-76f117872980)

http://localhost:9000/saludaConParametro?nombre=Mi nombre
![ParametroConNombre](https://github.com/Luiso-o/CreandoApiRest-Maven/assets/128043647/4162af6e-dba8-4a35-8823-7933fdd3b0ea)

El segundo método responderá a una petición GET, y deberá ser configurado para recibir el parámetro como PathVariable. El parámetro "nombre" será opcional.

Deberá responder a:

http://localhost:9000/saludaConVariable
![VariableSinNombre](https://github.com/Luiso-o/CreandoApiRest-Maven/assets/128043647/50595b60-49a5-40f5-9029-4cddc88a9f38)

http://localhost:9000/saludaConVariable/mi nombre
![veriableConNombre](https://github.com/Luiso-o/CreandoApiRest-Maven/assets/128043647/60a8f72c-8265-40d8-9e90-3fe06b13bbb5)

Test de Integración del controlador
![CapturaTestDeIntegracion](https://github.com/Luiso-o/CreandoApiRest-Maven/assets/128043647/b909feff-789d-4800-b790-a8014cab4b8a)



