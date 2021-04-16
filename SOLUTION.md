¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?.

Tenemos 3 acciones importantes en excepciones, cuando intenta solucionar un error (palabra reservada (Try)). Cuando atrapa los errores (palabra reservada (catch)) y con la palabra  reservada (finally) 

cuando lanzamos una excepcion avisa en el compilador que esta teniendo un error (Palabra reservada Throw) , propagamos la excepcion (throws Exception) y cuando capturamos la excepcion 

        try {
            new Cube(-1);
        } catch (ShapeException e) {
            assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        }finally{
        sout("proceso terminado");
    }

¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.

cuando una clase hereda metodos de una clase padre se "sobre escribe" el metodo que tenga esa clase padre en la clase hija
Se utiliza cuando se tienen varias clases y se heredan los metodos por ejemplo la super clase "animal" tiene un metodo llamado "Comer" y las clases hijas "Persona" y "Zombie" heredan este metodo pero ninguno de ellos come lo mismo

public class animal{
public void comer()

La clase persona y zombie heredan este metodo

public class zombie extends animal{
@Override
public void comer(){
sout ("humano")

la palabra reservada @Override nos permite sobreescribir los metodos
