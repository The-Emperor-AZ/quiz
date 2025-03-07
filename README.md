03 Validador de Contraseñas
Instrucción:
Desarrolla un programa que valide si una contraseña ingresada por el usuario cumple con los siguientes criterios de seguridad:
Debe tener al menos 8 caracteres
Debe contener al menos una letra mayúscula
Debe contener al menos una letra minúscula
Debe contener al menos un número
Debe contener al menos un carácter especial (@, #, $, %, &, *)
El programa debe indicar cuáles criterios no se cumplen.
Nota: Acá te dejo una ayuda.
(c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*')
variables: Contraseña 
- Con scanner le voy a pedir al usuario que ingrese la contraseña.
- def las condiciones que debe cumplir para que se cumplan con el if.