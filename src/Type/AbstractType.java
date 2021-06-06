package Type;

import Type.ActualType.Number.ActualNumber.TypeBinary;
import Type.ActualType.TypeBool;
import Type.ActualType.TypeString;
import jdk.jfr.BooleanFlag;

public abstract class AbstractType implements IType{
    private String Str;
    private boolean Bool;
    private int Integer;
    private double Float;
    private String Binary;

    public AbstractType(String Str, boolean Bool, int Integer, double Float, String Binary){
        this.Str = Str;
        this.Bool = Bool;
        this.Integer = Integer;
        this.Float = Float;
        this.Binary = Binary;
    }
    @Override
    public String getString() {
        return this.Str;
    }

    @Override
    public void setString(String Str) {
        this.Str = Str;
    }

    @Override
    public boolean getBool() {
        return this.Bool;
    }

    @Override
    public void setBool(boolean Bool) {
        this.Bool = Bool;
    }

    @Override
    public int getInt() {
        return this.Integer;
    }

    @Override
    public void setInt(int Integer) {
        this.Integer = Integer;
    }

    @Override
    public double getFloat() {
        return this.Float;
    }

    @Override
    public void setFloat(double Float) {
        this.Float = Float;
    }

    @Override
    public String getBinary() {
        return this.Binary;
    }

    @Override
    public void setBinary(String Binary) {
        this.Binary = Binary;
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public TypeString toTypeString(){ //retorna un TypeString para cualquier subclase (para cualquier Type)
        return new TypeString(this.toString());
    }
    public IType or(IType Type){
        return new TypeBinary("");
    }
    public TypeBinary orBinary(TypeBinary Binary){
        return new TypeBinary("");
    }
    @Override
    public IType orBool(TypeBool Bool){
        return new TypeBinary("");
    }
    public IType and(IType IType){
        return new TypeBinary("");
    }
    @Override
    public TypeBinary andBinary(TypeBinary Binary){
        return new TypeBinary("");
    }
    @Override
    public IType andBool(TypeBool Bool){
        return new TypeBinary("");
    }
}
