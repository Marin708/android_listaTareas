# 1. Diferencia entre val y var
### - val (Value): Es de solo lectura. Una vez que le asignas un valor, no puedes cambiarlo (es como una constante). Por el contrario, var (Variable): Es mutable. Puedes reasignar su valor las veces que necesites durante la ejecución.

# 2. ¿Para qué sirve el operador ?: (Elvis)?
### Sirve para gestionar valores nulos. Devuelve el valor de la izquierda si no es nulo; de lo contrario, devuelve el valor que se defina previamente a la derecha

# 3. ¿Qué genera automáticamente una data class?
### A diferencia de una clase normal, genera por defecto los métodos: equals() y hashCode() (para comparar datos, no referencias). toString() (que muestra el contenido de las propiedades). copy() (para crear copias modificando solo algunos campos). Componentes para destructuring (componentN).

# 4. ¿Qué hace el Adapter en un RecyclerView?
### Funciona como un puente o traductor. Toma los datos de una lista y los convierte en "vistas" (ViewHolders) que el usuario puede ver en pantalla. Se encarga de crear las filas y de llenar cada una con la información correspondiente.

# 5. ¿Por qué usar View Binding en lugar de findViewById?
### Principalmente por dos razones de seguridad: Null safety: No hay riesgo de error si una vista no existe en el layout actual (evita el famoso NullPointerException). Type safety: Ya sabe qué tipo de vista es cada una (Button, TextView, etc.), por lo que no necesitas hacer castings manuales, lo que hace el código más limpio y robusto.
