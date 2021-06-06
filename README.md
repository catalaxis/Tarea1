# Tarea1
Tarea1

Existen 5 tipos definidos en las clases TypeString (string), TypeBool (booleano), TypeInt (int), TypeFloat (double/float), TypeBinary (string binario).

El uso de este programa es de la siguiente manera:

1.- Sobre los setters y getters:
  notar que cada tipo tiene definido su setter y getter especifico, usar el setter equivocado no alterara el tipo ni la igualdad de este, pero es importante evitar
  cometer este tipo de errores.
  
2.- equals()
  el metodo equals es analogo en cada Type, con excepcion en TypeString, donde para evitar problemas el metodo compara caracter por caracter de los strings que
  componen cada TypeString.
 

3.- Transformaciones
  cada transformacion retorna un clon del tipo transformado al tipo a transformar. Es posible crear clones del mismo tipo. No es necesario usar casteos.
  todas las tranformaciones siguen la misma forma de ej:
  TypeBool(argsboolean).toTypeString() -> TypeString(argsstring)
  
4.- Operaciones
  cada operacion retorna un resultado segun el tipo, para manejar algunas operaciones es necesario usar casteos, en particular revisar los ejemplos en cada Test.
  Existen 7 operaciones, no son simetricas y la estructura de estas esta definida en el enunciado. Estas operaciones son: add, or, and, plus, subs, mult, div.
  todas las operaciones siguen el mismo uso, el cual se puede observar en el siguiente ej:
  TypeFloat Float = TypeInt(argsint).plus(TypeFloat(argsdouble)) -> TypeFloat(resultdouble)
  En algunos casos es necesario usar casteos, por lo que el uso seria de la siguiente forma:
  TypeFloat Float = (TypeBinary) Binary.div(TypeFloat(argsdouble))
  
