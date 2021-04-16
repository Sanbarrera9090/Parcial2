¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?.

Tenemos 3 acciones importantes en excepciones, cuando intenta solucionar un error (palabra reservada (Try)). Cuando atrapa los errores (palabra reservada (catch)) y con la palabra  reservada (finally) 

cuando lanzamos una excepcion, propagamos la excepcion y cuando capturamos la excepcion 

        try {
            new Cube(-1);
        } catch (ShapeException e) {
            assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        }finally{
        sout("proceso terminado");
    }
