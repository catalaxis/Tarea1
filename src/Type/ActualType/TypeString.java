package Type.ActualType;

import Type.AbstractType;
import Type.IType;

public class TypeString extends AbstractType {
    public TypeString(String Str) {
        super(Str, false, 0, 0, "0");
    }
    @Override
    public boolean equals(Object Obj){
        if (Obj instanceof TypeString){
            var o = (TypeString) Obj;
            //si es el equals recibe un TypeString, entonces
            //inicializamos dos strings, uno con el string que almacena cada TypeString
            String str1 = o.toString();
            String str2 = this.getString();
            int i = 0; //inizializamos un contador
            if(str1.length()==str2.length()){ //primero tienen que tener el mismo largo
                while(i<str1.length()){ //luego mientras no lleguemos al final del string
                    if(str1.charAt(i)!=str2.charAt(i)){ //comparamos
                        return false;//en caso de que sean distintos, retornamos false inmediatamente
                    }
                    i++; //de lo contrario avanzamos el contador
                }
                return true; //si salimos del while es porque recorrimos todo el string
                //y todos los caracteres eran iguales, por lo tanto retornamos true
            }
            else{return false;} //si el largo es distinto inmediatamente false
        }
        else{return false;} //si no son del mismo tipo, false
    }

    //Transformaciones
    @Override
    public String toString(){
        return this.getString();
    }

    //Operaciones
    public TypeString add(IType ActualType){
        return new TypeString(this.getString() + ActualType.toString());
    }

}
