# Ejemplos de Arreglos Multidimensionales en Java


------------------------------------------------------------------------

## 1. Tablero de un videojuego (matriz 2D)

**Uso:** Representa el mapa de un videojuego, donde cada número indica
un tipo de terreno, obstáculo o enemigo. Las matrices son fundamentales
en la creación de niveles.

``` java
public class TableroJuego {
    public static void main(String[] args) {
        int[][] mapa = {
            {0, 1, 1, 1, 0},
            {0, 2, 0, 3, 0},
            {1, 1, 1, 1, 1}
        };
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                System.out.print(mapa[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
```

------------------------------------------------------------------------

## 2. Registro de notas de estudiantes (matriz 2D)

**Uso:** Guardar notas por estudiante y por asignatura. Es típico en
sistemas académicos.

``` java
public class Notas {
    public static void main(String[] args) {
        double[][] notas = {
            {4.5, 3.2, 4.0},
            {3.8, 4.1, 4.2},
            {5.0, 4.9, 4.8}
        };
        double suma = 0;
        for (int i = 0; i < notas[0].length; i++) suma += notas[0][i];
        System.out.println("Promedio estudiante 1: " + (suma / notas[0].length));
    }
}
```

------------------------------------------------------------------------

## 3. Imagen en blanco y negro (matriz 2D)

**Uso:** Cada número representa la intensidad del gris. Las imágenes
digitales se manejan con matrices.

``` java
public class Imagen {
    public static void main(String[] args) {
        int[][] imagen = {
            {255, 200, 150},
            {100, 50, 25},
            {0, 0, 0}
        };
        System.out.println("Pixel superior izquierdo = " + imagen[0][0]);
    }
}
```

------------------------------------------------------------------------

## 4. Asientos de un cine (matriz 2D)

**Uso:** Control de reservas en salas de cine, aviones, teatros, etc.

``` java
public class Cine {
    public static void main(String[] args) {
        boolean[][] asientos = new boolean[5][5];
        asientos[2][3] = true;
        System.out.println("¿Asiento reservado?: " + asientos[2][3]);
    }
}
```

------------------------------------------------------------------------

## 5. Tabla de multiplicar (matriz 2D)

**Uso:** Ejemplo clásico para comprender cómo funcionan los accesos a
filas y columnas.

``` java
public class TablaMultiplicar {
    public static void main(String[] args) {
        int[][] tabla = new int[10][10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                tabla[i][j] = (i + 1) * (j + 1);
    }
}
```

------------------------------------------------------------------------

## 6. Cubo 3D (matriz 3D)

**Uso:** Simulación de espacios tridimensionales, videojuegos 3D, voxel
worlds tipo Minecraft.

``` java
public class Cubo3D {
    public static void main(String[] args) {
        int[][][] cubo = new int[3][3][3];
        cubo[0][0][0] = 7;
        System.out.println("Valor en (0,0,0): " + cubo[0][0][0]);
    }
}
```

------------------------------------------------------------------------

## 7. Sensores de temperatura por zonas (IoT)

**Uso:** Edificios inteligentes controlan temperatura por piso y
habitación usando matrices.

``` java
public class SensoresTemperatura {
    public static void main(String[] args) {
        double[][] temperaturas = {
            {22.5, 23.1, 21.8, 24.0},
            {25.3, 24.8, 26.1, 23.9},
            {20.1, 19.8, 21.0, 22.3}
        };
    }
}
```

------------------------------------------------------------------------

## 8. Sensor de calidad del aire (matriz 2D)

**Uso:** Ciudades inteligentes monitorean contaminación por sectores.

``` java
public class CalidadAire {
    public static void main(String[] args) {
        int[][] pm25 = new int[5][5];
        pm25[2][3] = 80;
    }
}
```

------------------------------------------------------------------------

## 9. Mapa de calor en videojuegos (heatmap)

**Uso:** Analítica de videojuegos: detectar dónde pasan más tiempo los
jugadores.

``` java
public class Heatmap {
    public static void main(String[] args) {
        int[][] mapaCalor = new int[10][10];
        mapaCalor[2][3]++;
    }
}
```

------------------------------------------------------------------------

## 10. Datos de precipitación (matriz 2D)

**Uso:** Modelos climáticos, meteorología, análisis de lluvia por región
y día.

``` java
public class Precipitacion {
    public static void main(String[] args) {
        double[][] lluvia = {
            {5.2, 1.3, 0.0, 2.1},
            {3.3, 2.1, 1.7, 0.0}
        };
    }
}
```

------------------------------------------------------------------------

## 11. Datos científicos de laboratorio (matriz 2D)

**Uso:** Experimentos con varias mediciones por material o condición.

``` java
public class DatosCientificos {
    public static void main(String[] args) {
        double[][] fuerzas = {
            {12.3, 13.1, 12.8},
            {20.1, 19.8, 21.0},
            {8.5, 8.8, 9.1}
        };
    }
}
```

------------------------------------------------------------------------

## 12. Imagen RGB (matriz 3D)

**Uso:** Procesamiento de imágenes, machine learning, visión por
computadora.

``` java
public class ImagenRGB {
    public static void main(String[] args) {
        int[][][] imagen = {
            { {255, 0, 0}, {0, 255, 0} },
            { {0, 0, 255}, {255, 255, 0} }
        };
    }
}
```

------------------------------------------------------------------------

## 13. Inventario RPG (matriz 2D)

**Uso:** Cada fila es un personaje, cada columna un objeto de su
inventario.

``` java
public class InventarioRPG {
    public static void main(String[] args) {
        String[][] inventarios = {
            {"Espada", "Escudo", "Poción"},
            {"Arco", "Flechas", "Antorcha"},
            {"Libro de magia", "Cristal", "Capa"}
        };
    }
}
```

------------------------------------------------------------------------

## 14. Flujo de autos por zonas (matriz 2D)

**Uso:** Sensores urbanos para detectar congestiones y diseñar movilidad
inteligente.

``` java
public class Trafico {
    public static void main(String[] args) {
        int[][] flujoAutos = new int[24][5];
        flujoAutos[8][2] = 150;
    }
}
```

------------------------------------------------------------------------

## 15. Matriz de reacciones químicas (matriz 2D)

**Uso:** Se registran reacciones químicas bajo diferentes condiciones.

``` java
double[][] reacciones = {
    {0.5, 1.2, 1.8},
    {0.7, 1.3, 2.0},
    {1.0, 1.5, 2.3}
};
```

----------------------------------------------------------
