package Factura;

public class Datos_Cliente {
    public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private char sexo;
    private double nacimiento;
    
    //Cronstructor de los datos de personas
        public Persona(String pNombre, String pApellido,String pDireccion, int pTelefono, char pSexo, double pNacimiento){
            nombre = pNombre;
            apellido = pApellido;
            direccion = pDireccion;
            telefono = pTelefono;
            sexo = pSexo;
            nacimiento = pNacimiento;
        }
    //Metodo para establecer el nombre del cliente
    public void establecerNombre(String pNombrep){
        nombre = pNombrep;
    }
    
    //Método para obtener el nombre del cliente
    public String obtenerNombre(){
        return nombre;
    }
    //Método para establecer el apellido del cliente
    public void establecerApellido(String pApellidop){
        apellido = pApellidop;
    }
    //Método para obtener el apellido del cliente
    public String obtenerApellido(){
        return apellido;
    }
    //Método para establecer la direccion del cliente
    public void establecerDireccion(String pDireccionp){
        direccion = pDireccionp;
    }
    //Método para obtener la direccion del cliente
    public String obtenerDireccion(){
        return direccion;
    }
    //Método para establecer el telefono del cliente
    public void establecerTelefono(int pTelefonop){
        telefono = pTelefonop;
    }
    //Método para obtener el telefono del cliente
    public int obtenerTelefono(){
        return telefono;
    }
    //Método para establecer el sexo del cliente
    public void establecerSexo(char pSexop){
        sexo = pSexop;
    }
    //Método para obtener el sexo de la persona
    public char obtenerSexo(){
        return sexo;
    }
    //Método para establecer fecha de nacimiento de la persona
    public void establecerFechaNacimiento (double pNacimientop){
        nacimiento = pNacimientop;
    }
    //Método para obtener fecha de nacimiento de la persona
    public double obtenerFechaNacimiento(){
        return nacimiento;
    }
    //Método para mostrar datos en pantalla
    public void obtenerDatos(){
        System.out.printf("\nNombre de la persona: %s", obtenerNombre());
        System.out.printf("\nEdad de la persona: %s",obtenerApellido());
        System.out.printf("\nSexo de la persona: %s",obtenerDireccion());
        System.out.printf("\nTelefono del cliente: %d",obtenerTelefono());
        System.out.printf("\nPeso en kilogramos de la persona: %s",obtenerSexo());
        System.out.printf("\nEstatura de la persona: %s",obtenerSexo());
        //Imprimir fecha
        
        
    }
}
}
