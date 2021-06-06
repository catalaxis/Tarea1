package Type;

import Type.ActualType.Number.ActualNumber.TypeBinary;
import Type.ActualType.TypeBool;
import Type.ActualType.TypeString;

public interface IType {
    //Setters y getters que se comparten a lo largo de nuestras clases
    public String getString();
    public void setString(String Str);

    public boolean getBool();
    public void setBool(boolean Bool);

    public int getInt();
    public void setInt(int Integer);

    public double getFloat();
    public void setFloat(double Float);

    public String getBinary();
    public void setBinary(String Binary);

    //
    public String toString();
    public TypeString toTypeString();


    TypeBinary orBinary(TypeBinary Binary);
    IType orBool(TypeBool Bool);

    TypeBinary andBinary(TypeBinary Binary);
    IType andBool(TypeBool Bool);
}
